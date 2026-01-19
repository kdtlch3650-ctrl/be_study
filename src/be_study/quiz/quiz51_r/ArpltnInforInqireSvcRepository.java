package be_study.quiz.quiz51_r;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;

public class ArpltnInforInqireSvcRepository {
	public String requestAPi_getMinuDustWeekFrcstDspth(String searchDate) throws Exception{
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=7c4473afce1978b5796fba74c2a7a1868850f0a64afa2269f51e86fc03e18251"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*xml 또는 json*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("searchDate","UTF-8") + "=" + URLEncoder.encode(searchDate, "UTF-8")); /*통보시간 검색(조회 날짜 입력이 없을 경우 호출 당일 날짜를 기준으로 주간예보 리스트 확인)*/
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
	
	public MinuDustWeekDTO getMinuDustWeekFrcstDspth(String searchDate) {
		MinuDustWeekDTO minuDustWeekDTO = null;
		try {
		String jsonString = requestAPi_getMinuDustWeekFrcstDspth(searchDate);
		
		minuDustWeekDTO = new MinuDustWeekDTO();
		
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject)parser.parse(jsonString);
		
		JSONObject body = (JSONObject)((JSONObject)obj.get("response")).get("body");
		JSONObject item = (JSONObject)((JSONArray)body.get("items")).get(0);

		minuDustWeekDTO.setPresnatnDt(item.get("presnatnDt").toString());
		minuDustWeekDTO.setFrcstOneCn(item.get("frcstOneCn").toString());
		minuDustWeekDTO.setFrcstOneDt(item.get("frcstOneDt").toString());
		minuDustWeekDTO.setFrcstTwoCn(item.get("frcstTwoCn").toString());
		minuDustWeekDTO.setFrcstTwoDt(item.get("frcstTwoDt").toString());
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return minuDustWeekDTO;
	}
}
