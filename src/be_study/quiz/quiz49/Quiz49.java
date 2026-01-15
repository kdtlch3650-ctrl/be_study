package be_study.quiz.quiz49;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Quiz49 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jsonString = "{\r\n"
				+ "\"employees\": [\r\n"
				+ "{\r\n"
				+ "\"id\": 1,\r\n"
				+ "\"name\": \"홍길동\",\r\n"
				+ "\"position\": \"개발자\",\r\n"
				+ "\"salary\": 50000,\r\n"
				+ "\"skills\": [\"Java\", \"Python\", \"SQL\"]\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"id\": 2,\r\n"
				+ "\"name\": \"김철수\",\r\n"
				+ "\"position\": \"디자이너\",\r\n"
				+ "\"salary\": 40000,\r\n"
				+ "\"skills\": [\"Photoshop\", \"Illustrator\"]\r\n"
				+ "}\r\n"
				+ "],\r\n"
				+ "\"company\": {\r\n"
				+ "\"name\": \"주식회사 ABC\",\r\n"
				+ "\"address\": \"서울시 강남구\",\r\n"
				+ "\"established\": \"1990-01-01\",\r\n"
				+ "\"departments\": [\r\n"
				+ "{\r\n"
				+ "\"name\": \"개발부\",\r\n"
				+ "\"employees\": [1, 3, 5]\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"name\": \"디자인부\",\r\n"
				+ "\"employees\": [2, 4]\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "},\r\n"
				+ "\"projects\": [\r\n"
				+ "{\r\n"
				+ "\"title\": \"사내 시스템 개발\",\r\n"
				+ "\"budget\": 100000,\r\n"
				+ "\"team\": [1, 3]\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"웹 디자인 프로젝트\",\r\n"
				+ "\"budget\": 80000,\r\n"
				+ "\"team\": [2, 4]\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}";
		
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonString);

			JSONArray employees = (JSONArray) jsonObj.get("employees");
			
			JSONObject employeesObj1 = (JSONObject) employees.get(0);
			System.out.println(employeesObj1.get("id"));
			System.out.println(employeesObj1.get("name"));
			System.out.println(employeesObj1.get("position"));
			System.out.println(employeesObj1.get("salary"));
			JSONArray skills = (JSONArray) employeesObj1.get("skills");
			System.out.println(skills.get(0));
			System.out.println(skills.get(1));
			System.out.println(skills.get(2));
			
			JSONObject employeesObj2 = (JSONObject) employees.get(1);
			System.out.println(employeesObj2.get("id"));
			System.out.println(employeesObj2.get("name"));
			System.out.println(employeesObj2.get("position"));
			System.out.println(employeesObj2.get("salary"));
			JSONArray skills2 = (JSONArray) employeesObj2.get("skills");
			System.out.println(skills2.get(0));
			System.out.println(skills2.get(1));
			
			JSONObject company = (JSONObject) jsonObj.get("company");
			System.out.println(company.get("name"));
			System.out.println(company.get("address"));
			System.out.println(company.get("established"));
			JSONArray departments = (JSONArray) company.get("departments");
			JSONObject departmentsObj1 = (JSONObject) departments.get(0);
			System.out.println(departmentsObj1.get("name"));
			JSONArray companyEmployees = (JSONArray) departmentsObj1.get("employees");
			System.out.println(companyEmployees.get(0));
			System.out.println(companyEmployees.get(1));
			System.out.println(companyEmployees.get(2));

			JSONObject departmentsObj2 = (JSONObject) departments.get(1);
			System.out.println(departmentsObj2.get("name"));
			JSONArray companyEmployees2 = (JSONArray) departmentsObj2.get("employees");
			System.out.println(companyEmployees2.get(0));
			System.out.println(companyEmployees2.get(1));

			JSONArray projects = (JSONArray) jsonObj.get("projects");
			
			JSONObject projectsObj1 = (JSONObject)projects.get(0);
			System.out.println(projectsObj1.get("title"));
			System.out.println(projectsObj1.get("budget"));
			JSONArray team = (JSONArray) projectsObj1.get("team");
			System.out.println(team.get(0));
			System.out.println(team.get(1));
			
			JSONObject projectsObj2 = (JSONObject)projects.get(1);
			System.out.println(projectsObj2.get("title"));
			System.out.println(projectsObj2.get("budget"));
			JSONArray team2 = (JSONArray) projectsObj2.get("team");
			System.out.println(team2.get(0));
			System.out.println(team2.get(1));
			
		}catch (Exception e){
		}
	}
}
