package be_study.quiz.quiz48;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Quiz48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jsonString = ""
				+ "{"
				+ "\"도서관\": {"
				+ "\"위치\": \"서울특별시 강남구\","
				+ "\"운영시간\": {"
				+ "\"평일\": [\"09:00\", \"21:00\"],"
				+ "\"주말\": [\"10:00\", \"18:00\"]"
				+ "},"
				+ "\"책목록\": ["
				+ "{"
				+ "\"제목\": \"자바 프로그래밍\","
				+ "\"저자\": \"홍길동\","
				+ "\"출판연도\": 2023,"
				+ "\"가격\": 25000,"
				+ "\"대출가능\": true,"
				+ "\"카테고리\": [\"프로그래밍\", \"자기계발\"]"
				+ "},"
				+ "{"
				+ "\"제목\": \"데이터 분석 입문\","
				+ "\"저자\": \"김철수\","
				+ "\"출판연도\": 2022,"
				+ "\"가격\": 28000,"
				+ "\"대출가능\": false,"
				+ "\"카테고리\": [\"데이터\", \"분석\"]"
				+ "}"
				+ "],"
				+ "\"특별서비스\": {"
				+ "\"키오스크\": true,"
				+ "\"스터디룸\": {"
				+ "\"개수\": 5,"
				+ "\"예약 가능\": true,"
				+ "\"비용\": {"
				+ "\"1시간당\": 5000,"
				+ "\"하루\": 30000"
				+ "}"
				+ "}"
				+ "}"
				+ "}"
				+ "}";
		try {
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonString);

		JSONObject library = (JSONObject) jsonObj.get("도서관");
		System.out.println("위치 : "+library.get("위치"));
		JSONObject operatingHours = (JSONObject) library.get("운영시간");
		System.out.println("운영시간 : ");
		JSONArray weekday = (JSONArray) operatingHours.get("평일");
		System.out.println("\t"+"평일 : "+weekday.get(0)+"~"+weekday.get(1));
		JSONArray weekend = (JSONArray) operatingHours.get("주말");
		System.out.println("\t"+"주말 : "+weekend.get(0)+"~"+weekend.get(1));
		
		JSONArray bookList = (JSONArray) library.get("책목록");
		System.out.println("책목록 : ");
		JSONObject bookListObj = (JSONObject) bookList.get(0);		
		System.out.println("   "+"제목 : "+bookListObj.get("제목"));
		System.out.println("\t"+"저자 : "+bookListObj.get("저자"));
		System.out.println("\t"+"출판연도 : "+bookListObj.get("출판연도"));
		System.out.println("\t"+"가격 : "+bookListObj.get("가격"));
		System.out.println("\t"+"대출가능 : "+bookListObj.get("대출가능"));
		JSONArray category = (JSONArray) bookListObj.get("카테고리");
		System.out.println("\t"+"카테고리 : "+category.get(0)+","+category.get(1));
		
		System.out.println("");
		
		JSONObject bookListObj2 = (JSONObject) bookList.get(1);		
		System.out.println("   "+"제목 : "+bookListObj2.get("제목"));
		System.out.println("\t"+"저자 : "+bookListObj2.get("저자"));
		System.out.println("\t"+"출판연도 : "+bookListObj2.get("출판연도"));
		System.out.println("\t"+"가격 : "+bookListObj2.get("가격"));
		System.out.println("\t"+"대출가능 : "+bookListObj2.get("대출가능"));
		JSONArray category2 = (JSONArray) bookListObj2.get("카테고리");
		System.out.println("\t"+"카테고리 : "+category2.get(0)+","+category.get(1));
		
		JSONObject specialService = (JSONObject) library.get("특별서비스");
		System.out.println("특별서비스");
		System.out.println("\t"+"키오스크 : "+specialService.get("키오스크"));
		JSONObject studyRoom = (JSONObject) specialService.get("스터디룸");
		System.out.println("\t"+"개수 : "+studyRoom.get("개수"));
		System.out.println("\t"+"예약 가능 : "+studyRoom.get("예약 가능"));
		JSONObject cost = (JSONObject) studyRoom.get("비용");
		System.out.println("\t"+"1시간당 : "+cost.get("1시간당"));
		System.out.println("\t"+"하루 : "+cost.get("하루"));
		
		
		}catch(Exception e){
			
		}
	}

}
