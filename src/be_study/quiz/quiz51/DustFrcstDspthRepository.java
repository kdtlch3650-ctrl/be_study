package be_study.quiz.quiz51;

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

public class DustFrcstDspthRepository {

	public String requestApi_getDust(String searchDate, String InformCode) throws Exception{
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustFrcstDspth"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=7c4473afce1978b5796fba74c2a7a1868850f0a64afa2269f51e86fc03e18251"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*xml 또는 json*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); /*한 페이지 결과 수(조회 날짜로 검색 시 사용 안함)*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호(조회 날짜로 검색 시 사용 안함)*/
        urlBuilder.append("&" + URLEncoder.encode("searchDate","UTF-8") + "=" + URLEncoder.encode(searchDate, "UTF-8")); /*통보시간 검색(조회 날짜 입력이 없을 경우 한달동안 예보통보 발령 날짜의 리스트 정보를 확인)*/
        urlBuilder.append("&" + URLEncoder.encode("InformCode","UTF-8") + "=" + URLEncoder.encode(InformCode, "UTF-8")); /*통보코드검색(PM10, PM25, O3)*/
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
	
	public DustDTO getDust(String searchDate, String InformCode){
		DustDTO dustDTO = null;
		
		try {
			dustDTO = new DustDTO();
			dustDTO.setSearchDate(searchDate);
			dustDTO.setInformCode(InformCode);
			
			String jsonString = requestApi_getDust(searchDate, InformCode);
			
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonString);
			
			JSONObject response = (JSONObject) jsonObj.get("response");
			JSONObject body = (JSONObject) response.get("body");
			JSONArray itemArr = (JSONArray) body.get("items");
			List<Item> items = new ArrayList<Item>(); 
			
			for(int i = 0;i<itemArr.size();i++) {
				JSONObject itemObj = (JSONObject) itemArr.get(i);
				Item item = new Item();
				item.informOverall = (String) itemObj.get("informOverall");
				item.informGrade = (String) itemObj.get("informGrade");
				item.dataTime = (String) itemObj.get("dataTime");
				item.imageUrl3 = (String) itemObj.get("imageUrl3");
				items.add(item);
			}
			dustDTO.setItems(items);			
						
		}catch (Exception e) {
			
		}
		
		return dustDTO;
	}

}
