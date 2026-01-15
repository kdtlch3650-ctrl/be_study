package be_study.api.v1;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;

public class ApiServiceMain {
	public static void main(String[] args) {

		MidFcstInfoServiceRepository repository = new MidFcstInfoServiceRepository();

		try {
			// String result = repository.requestApi_getMidTa();
			// System.out.println(result);

			String jsonString = "{\"response\":{\"header\":{\"resultCode\":\"00\",\"resultMsg\":\"NORMAL_SERVICE\"},\"body\":{\"dataType\":\"JSON\",\"items\":{\"item\":[{\"regId\":\"11B10101\",\"taMin4\":0,\"taMin4Low\":1,\"taMin4High\":1,\"taMax4\":2,\"taMax4Low\":1,\"taMax4High\":1,\"taMin5\":-11,\"taMin5Low\":2,\"taMin5High\":2,\"taMax5\":-4,\"taMax5Low\":2,\"taMax5High\":2,\"taMin6\":-13,\"taMin6Low\":1,\"taMin6High\":2,\"taMax6\":-5,\"taMax6Low\":1,\"taMax6High\":1,\"taMin7\":-12,\"taMin7Low\":1,\"taMin7High\":2,\"taMax7\":-4,\"taMax7Low\":1,\"taMax7High\":1,\"taMin8\":-11,\"taMin8Low\":0,\"taMin8High\":2,\"taMax8\":-2,\"taMax8Low\":0,\"taMax8High\":1,\"taMin9\":-10,\"taMin9Low\":0,\"taMin9High\":2,\"taMax9\":-2,\"taMax9Low\":0,\"taMax9High\":1,\"taMin10\":-9,\"taMin10Low\":0,\"taMin10High\":2,\"taMax10\":-1,\"taMax10Low\":0,\"taMax10High\":1}]},\"pageNo\":1,\"numOfRows\":10,\"totalCount\":1}}}\r\n";
			System.out.println(jsonString);
			// result String 텍스트 -> 파싱
			// JSON 포맷 -> 파싱
			
			//json-simple 라이브러리 추가(밴드 확인)
			
			//최초 : JSONParser() parse()
			// { JSONObject 객체
			// [ JSONArray	배열
			// key:Value	get("키값")
			
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonString);
			
			JSONObject response = (JSONObject)jsonObj.get("response");
			
			JSONObject header = (JSONObject)response.get("header");
			System.out.println(header.get("resultCode"));
			System.out.println(header.get("resultMsg"));

			JSONObject body = (JSONObject)response.get("body");
			System.out.println(body.get("dataType"));
			System.out.println(body.get("pageNo"));
			System.out.println(body.get("numOfRows"));
			System.out.println(body.get("totalCount"));
			
			JSONObject items = (JSONObject)body.get("items");
			JSONArray item = (JSONArray)items.get("item");
			
//			for(int i=0;i<item.size();i++) {
//				item.get(i);
//			} 여러개 받아오기
			
			JSONObject itemObj = (JSONObject)item.get(0);
			System.out.println(itemObj.get("regId"));
			System.out.println(itemObj.get("taMin4"));
			System.out.println(itemObj.get("taMax4"));
			System.out.println(itemObj.get("taMin5"));
			System.out.println(itemObj.get("taMax5"));
			
			MidTaDTO midTaDTO = new MidTaDTO();
			midTaDTO.setResultCode(header.get("resultCode").toString());
			midTaDTO.setResultMsg(header.get("resultMsg").toString());
			midTaDTO.setRegId(itemObj.get("regId").toString());
			midTaDTO.setTaMin4(Integer.parseInt( itemObj.get("taMin4").toString()));
			midTaDTO.setTaMax4(Integer.parseInt( itemObj.get("taMax4").toString()));
			midTaDTO.setTaMin5(Integer.parseInt( itemObj.get("taMin5").toString()));
			midTaDTO.setTaMax5(Integer.parseInt( itemObj.get("taMax5").toString()));

			System.out.println(midTaDTO.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}