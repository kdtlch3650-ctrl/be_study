package be_study.test;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;

public class VilageFcstInfoServiceRepository {
	//"20210628"
	public String requestApi_getVilTa(String base_date) throws Exception{
		 StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst"); /*URL*/
	        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=7c4473afce1978b5796fba74c2a7a1868850f0a64afa2269f51e86fc03e18251"); /*Service Key*/
	        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
	        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); /*한 페이지 결과 수*/
	        urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*요청자료형식(XML/JSON) Default: XML*/
	        urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode(base_date, "UTF-8")); /*‘21년 6월 28일발표*/
	        urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode("0500", "UTF-8")); /*05시 발표*/
	        urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8") + "=" + URLEncoder.encode("55", "UTF-8")); /*예보지점의 X 좌표값*/
	        urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8") + "=" + URLEncoder.encode("127", "UTF-8")); /*예보지점의 Y 좌표값*/
	        URL url = new URL(urlBuilder.toString());
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Content-type", "application/json");
	        System.out.println("Response code: " + conn.getResponseCode());
	        BufferedReader rd;
	        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
	            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        } else {
	            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
	        }
	        StringBuilder sb = new StringBuilder();
	        String line;
	        while ((line = rd.readLine()) != null) {
	            sb.append(line);
	        }
	        rd.close();
	        conn.disconnect();
	        System.out.println(sb.toString());
	        
	        return sb.toString();
	}
	
	public VilageDTO getVilage(String base_date) {
		VilageDTO vilageDTO = null;
		
		try {
			String jsonString = requestApi_getVilTa(base_date);
			vilageDTO = new VilageDTO();
			vilageDTO.setBase_date(base_date);
			
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonString);
			
			JSONObject response = (JSONObject) jsonObj.get("response");
			JSONObject body = (JSONObject) response.get("body");			
			JSONObject itemss = (JSONObject) body.get("items");
			
			JSONArray itemArr = (JSONArray) itemss.get("item");
			List<Item> items = new ArrayList<Item>();
			for (int i = 0; i < itemArr.size(); i++) {
				JSONObject itemObject = (JSONObject) itemArr.get(i);

				Item item = new Item();
				item.fcstDate = (String) itemObject.get("fcstDate");
//				item.setFcstDate((String) itemObject.get("fcstDate"));
				item.fcstTime = (String) itemObject.get("fcstTime");
////				item.setFcstTime((int) itemObject.get("fcstTime"));
//				item.nx = (String) itemObject.get("nx");
//				System.out.println(item);
				item.setNx(objectToInt(itemObject.get("nx")));
//				item.ny = Integer.parseInt(itemObject.get("ny"));
				item.setNy(objectToInt(itemObject.get("ny")));
				items.add(item);
			}
			vilageDTO.setItems(items);
			
		}catch (Exception e) {
			
		}

		
		return vilageDTO;
	}
	public static int objectToInt(Object obj) {
		return Integer.parseInt(obj.toString());
	}

}
