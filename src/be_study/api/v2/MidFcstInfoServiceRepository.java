package be_study.api.v2;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;

public class MidFcstInfoServiceRepository {

				
	public String requestApi_getMidTa(String tmFc, String regId) throws Exception {
		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/1360000/MidFcstInfoService/getMidTa"); /* URL */
		urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8")
				+ "=7c4473afce1978b5796fba74c2a7a1868850f0a64afa2269f51e86fc03e18251"); /* Service Key */
		urlBuilder
				.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 페이지번호 */
		urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
				+ URLEncoder.encode("10", "UTF-8")); /* 한 페이지 결과 수 */
		urlBuilder.append("&" + URLEncoder.encode("dataType", "UTF-8") + "="
				+ URLEncoder.encode("JSON", "UTF-8")); /* 요청자료형식(XML/JSON)Default: XML */
		urlBuilder.append("&" + URLEncoder.encode("regId", "UTF-8") + "="
				+ URLEncoder.encode(regId, "UTF-8")); /* 11B10101 서울, 11B20201 인천 등 ( 별첨엑셀자료 참고) */
		urlBuilder.append("&" + URLEncoder.encode("tmFc", "UTF-8") + "=" + URLEncoder.encode(tmFc,
				"UTF-8")); /*-일 2회(06:00,18:00)회 생성 되며 발표시각을 입력- YYYYMMDD0600(1800) 최근 24시간 자료만 제공*/
//		urlBuilder.append("&" + URLEncoder.encode("regId", "UTF-8") + "="
//				+ URLEncoder.encode("11B10101", "UTF-8")); /* 11B10101 서울, 11B20201 인천 등 ( 별첨엑셀자료 참고) */
//		urlBuilder.append("&" + URLEncoder.encode("tmFc", "UTF-8") + "=" + URLEncoder.encode("202601150600",
//				"UTF-8")); /*-일 2회(06:00,18:00)회 생성 되며 발표시각을 입력- YYYYMMDD0600(1800) 최근 24시간 자료만 제공*/
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
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

	public MidTaDTO getMidta(String tmFc, String regId) {

		MidTaDTO midTaDTO = null;

		try {
			String jsonString = requestApi_getMidTa(tmFc, regId);
			//String result = repository.requestApi_getMidTa(tmFc, regId);
			// System.out.println(result);

			// 계속 받아오면 데이터 낭비이니 받아왔다 치고 저장
			//String jsonString = "{\"response\":{\"header\":{\"resultCode\":\"00\",\"resultMsg\":\"NORMAL_SERVICE\"},\"body\":{\"dataType\":\"JSON\",\"items\":{\"item\":[{\"regId\":\"11B10101\",\"taMin4\":0,\"taMin4Low\":1,\"taMin4High\":1,\"taMax4\":2,\"taMax4Low\":1,\"taMax4High\":1,\"taMin5\":-11,\"taMin5Low\":2,\"taMin5High\":2,\"taMax5\":-4,\"taMax5Low\":2,\"taMax5High\":2,\"taMin6\":-13,\"taMin6Low\":1,\"taMin6High\":2,\"taMax6\":-5,\"taMax6Low\":1,\"taMax6High\":1,\"taMin7\":-12,\"taMin7Low\":1,\"taMin7High\":2,\"taMax7\":-4,\"taMax7Low\":1,\"taMax7High\":1,\"taMin8\":-11,\"taMin8Low\":0,\"taMin8High\":2,\"taMax8\":-2,\"taMax8Low\":0,\"taMax8High\":1,\"taMin9\":-10,\"taMin9Low\":0,\"taMin9High\":2,\"taMax9\":-2,\"taMax9Low\":0,\"taMax9High\":1,\"taMin10\":-9,\"taMin10Low\":0,\"taMin10High\":2,\"taMax10\":-1,\"taMax10Low\":0,\"taMax10High\":1}]},\"pageNo\":1,\"numOfRows\":10,\"totalCount\":1}}}\r\n";
			System.out.println(jsonString);
			// result String 텍스트 -> 파싱
			// JSON 포맷 -> 파싱

			// json-simple 라이브러리 추가(밴드 확인)

			// 최초 : JSONParser() parse()
			// { JSONObject 객체
			// [ JSONArray 배열
			// key:Value get("키값")

			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonString);

			JSONObject response = (JSONObject) jsonObj.get("response");

			JSONObject header = (JSONObject) response.get("header");
			System.out.println(header.get("resultCode"));
			System.out.println(header.get("resultMsg"));

			JSONObject body = (JSONObject) response.get("body");
			System.out.println(body.get("dataType"));
			System.out.println(body.get("pageNo"));
			System.out.println(body.get("numOfRows"));
			System.out.println(body.get("totalCount"));

			JSONObject items = (JSONObject) body.get("items");
			JSONArray item = (JSONArray) items.get("item");

//						for(int i=0;i<item.size();i++) {
//							item.get(i);
//						} 여러개 받아오기

			JSONObject itemObj = (JSONObject) item.get(0);
			System.out.println(itemObj.get("regId"));
			System.out.println(itemObj.get("taMin4"));
			System.out.println(itemObj.get("taMax4"));
			System.out.println(itemObj.get("taMin5"));
			System.out.println(itemObj.get("taMax5"));

			midTaDTO = new MidTaDTO();
			midTaDTO.setResultCode(header.get("resultCode").toString());
			midTaDTO.setResultMsg(header.get("resultMsg").toString());
			midTaDTO.setTmFc("202601150600");
			midTaDTO.setRegId(itemObj.get("regId").toString());
			midTaDTO.setTaMin4(Integer.parseInt(itemObj.get("taMin4").toString()));
			midTaDTO.setTaMax4(Integer.parseInt(itemObj.get("taMax4").toString()));
			midTaDTO.setTaMin5(Integer.parseInt(itemObj.get("taMin5").toString()));
			midTaDTO.setTaMax5(Integer.parseInt(itemObj.get("taMax5").toString()));

		} catch (Exception e) {

		}

		return midTaDTO;
	}

}