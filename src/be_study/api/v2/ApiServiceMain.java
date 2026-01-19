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

public class ApiServiceMain {
	public static void main(String[] args) {

		//API 데이터 요청 -> 결과 값 응답
		MidFcstInfoServiceRepository repository = new MidFcstInfoServiceRepository();
		
		MidTaDTO midTaDTO = repository.getMidta("202601150600", "11B10101");
//		11B10101 서울날씨
		
		System.out.println(midTaDTO);
		
		MidTaDTO midTaDTO2 = repository.getMidta("202601150600", "11B20201");
		//11B20202 인천 날씨
		
		//midTaDTO 활용
		System.out.println(midTaDTO2);
		
		//파싱한 DTO 객체 -> DB 저장
		MidFcstDAO midFcstDAO = new MidFcstDAO();
		int r1 = midFcstDAO.saveMidTa(midTaDTO);
		if (r1 > 0)
			System.out.println("1번 잘 저장됨");
		int r2 = midFcstDAO.saveMidTa(midTaDTO2);
		if (r2 > 0)
			System.out.println("2번 잘 저장됨");
	}
}