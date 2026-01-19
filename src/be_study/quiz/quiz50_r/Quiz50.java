package be_study.quiz.quiz50_r;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Quiz50 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String jsonString = "{\r\n" + "\"id\": 1,\r\n" + "\"name\": \"John Doe\",\r\n" + "\"contacts\": [\r\n" + "{\r\n"
				+ "\"type\": \"email\",\r\n" + "\"value\": \"john.doe@example.com\"\r\n" + "},\r\n" + "{\r\n"
				+ "\"type\": \"phone\",\r\n" + "\"value\": \"01023456789\"\r\n" + "}\r\n" + "],\r\n"
				+ "\"address\": {\r\n" + "\"street\": \"123 Main Street\",\r\n" + "\"city\": \"Seoul\",\r\n"
				+ "\"zipcode\": \"12345\"\r\n" + "},\r\n" + "\"orders\": [\r\n" + "{\r\n"
				+ "\"orderId\": \"ORD-001\",\r\n" + "\"date\": \"2024-07-09\",\r\n" + "\"items\": [\r\n" + "{\r\n"
				+ "\"id\": 1,\r\n" + "\"name\": \"Smartphone\",\r\n" + "\"quantity\": 2\r\n" + "},\r\n" + "{\r\n"
				+ "\"id\": 2,\r\n" + "\"name\": \"Laptop\",\r\n" + "\"quantity\": 1\r\n" + "}\r\n" + "]\r\n" + "},\r\n"
				+ "{\r\n" + "\"orderId\": \"ORD-002\",\r\n" + "\"date\": \"2024-07-10\",\r\n" + "\"items\": [\r\n"
				+ "{\r\n" + "\"id\": 3,\r\n" + "\"name\": \"Headphones\",\r\n" + "\"quantity\": 1\r\n" + "}\r\n"
				+ "]\r\n" + "}\r\n" + "]\r\n" + "}";

		JSONParser jsonParser = new JSONParser();
		JSONObject obj = (JSONObject) jsonParser.parse(jsonString);

		CustomerDTO customerDTO = new CustomerDTO();

		customerDTO.setId(objectToInt(obj.get("id")));
		customerDTO.setName(objectToString(obj.get("name")));

		JSONArray contactsArr = (JSONArray) obj.get("contacts");
		List<Contact> contacts = new ArrayList<Contact>();

		for (int i = 0; i < contactsArr.size(); i++) {
			JSONObject contactObject = (JSONObject) contactsArr.get(i);

			Contact contact = new Contact();
			contact.setType(objectToString(contactObject.get("type")));
			contact.setValue(objectToString(contactObject.get("value")));
			contacts.add(contact);
		}
		customerDTO.setContacts(contacts);

		JSONObject addresJsonObject = (JSONObject) obj.get("address");
		Address address = new Address();

		address.setStreet(objectToString(addresJsonObject.get("street")));
		address.setCity(objectToString(addresJsonObject.get("city")));
		address.setZipcode(objectToString(addresJsonObject.get("zipcode")));

		customerDTO.setAddress(address);

		JSONArray ordersArray = (JSONArray) obj.get("orders");
		List<Order> orders = new ArrayList<Order>();

		for (int i = 0; i < ordersArray.size(); i++) {
			JSONObject orderObject = (JSONObject) ordersArray.get(i);

			Order order = new Order();
			order.setOrderId(objectToString(orderObject.get("orderId")));
			order.setDate(objectToString(orderObject.get("date")));

			JSONArray itemsArray = (JSONArray) orderObject.get("items");
			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < itemsArray.size(); j++) {
				JSONObject itemObject = (JSONObject) itemsArray.get(j);
				Item item = new Item();

				item.setId(objectToInt(itemObject.get("id")));
				item.setName(objectToString(itemObject.get("name")));
				item.setQuantity(objectToInt(itemObject.get("quantity")));
				items.add(item);
			}
			order.setItems(items);

			orders.add(order);
		}
		customerDTO.setOrders(orders);
	}

	public static int objectToInt(Object obj) {
		return Integer.parseInt(obj.toString());
	}

	public static String objectToString(Object obj) {
		if (obj != null) {
			return obj.toString();
		}else return ""; 
	}

}
