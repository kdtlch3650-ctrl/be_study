package be_study.quiz.quiz50;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/****************************************/
//이거 틀린 코드임 (틀린부분많음)!!!! Quiz_r 참조
/****************************************/
public class Quiz50 {

	String jsonString = "{\r\n" + "\"id\": 1,\r\n" + "\"name\": \"John Doe\",\r\n" + "\"contacts\": [\r\n" + "{\r\n"
			+ "\"type\": \"email\",\r\n" + "\"value\": \"john.doe@example.com\"\r\n" + "},\r\n" + "{\r\n"
			+ "\"type\": \"phone\",\r\n" + "\"value\": \"01023456789\"\r\n" + "}\r\n" + "],\r\n" + "\"address\": {\r\n"
			+ "\"street\": \"123 Main Street\",\r\n" + "\"city\": \"Seoul\",\r\n" + "\"zipcode\": \"12345\"\r\n"
			+ "},\r\n" + "\"orders\": [\r\n" + "{\r\n" + "\"orderId\": \"ORD-001\",\r\n"
			+ "\"date\": \"2024-07-09\",\r\n" + "\"items\": [\r\n" + "{\r\n" + "\"id\": 1,\r\n"
			+ "\"name\": \"Smartphone\",\r\n" + "\"quantity\": 2\r\n" + "},\r\n" + "{\r\n" + "\"id\": 2,\r\n"
			+ "\"name\": \"Laptop\",\r\n" + "\"quantity\": 1\r\n" + "}\r\n" + "]\r\n" + "},\r\n" + "{\r\n"
			+ "\"orderId\": \"ORD-002\",\r\n" + "\"date\": \"2024-07-10\",\r\n" + "\"items\": [\r\n" + "{\r\n"
			+ "\"id\": 3,\r\n" + "\"name\": \"Headphones\",\r\n" + "\"quantity\": 1\r\n" + "}\r\n" + "]\r\n" + "}\r\n"
			+ "]\r\n" + "}";

	public Quiz50DTO GetDTO() {
		
		Quiz50DTO quiz50DTO = null;
		

		try {
			quiz50DTO = new Quiz50DTO();
			
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonString);
			
			quiz50DTO.id = (int) jsonObj.get("id");
			quiz50DTO.name = (String) jsonObj.get("name");
			
			JSONArray contacts = (JSONArray) jsonObj.get("contacts");
			List<ContactsList> contactsArr = new ArrayList<>();
			
			for (int i = 0; i < contacts.size(); i++) {
				JSONObject contactsObj = (JSONObject) contacts.get(i);
				ContactsList contactsList = new ContactsList();
				contactsList.type = (String) contactsObj.get("type");
				contactsList.value = (String) contactsObj.get("value");
				
			}
			quiz50DTO.contacts = contactsArr;

			JSONObject addressObj = (JSONObject) jsonObj.get("address");
			AddressDTO address = new AddressDTO();
			address.street = (String) addressObj.get("address");
			address.city = (String) addressObj.get("city");
			address.zipcode = (String) addressObj.get("zipcode");
			
			quiz50DTO.address = address;

			JSONArray orders = (JSONArray) jsonObj.get("orders");
			List<OrdersList> orderslist = new ArrayList();
			
			
			for (int i = 0; i < orders.size(); i++) {
				JSONObject ordersObj = (JSONObject) orders.get(i);
				OrdersList order = new OrdersList();
				order.orderId = (String) ordersObj.get("orderId");
				order.date = (String) ordersObj.get("date");
				
				JSONArray items = (JSONArray) ordersObj.get("items");
				List<ItemList> itemlist = new ArrayList();				
				
				for (int j = 0; j < orders.size(); j++) {
					JSONObject itemsObj = (JSONObject) items.get(i);
					ItemList item = new ItemList();
					item.Item_id = (int) itemsObj.get("id");
					item.name = (String) itemsObj.get("name");
					item.quantity = (int) itemsObj.get("quantity");
				}
			}

		} catch (

		Exception e) {

		}
		
		return quiz50DTO;
	}

}
