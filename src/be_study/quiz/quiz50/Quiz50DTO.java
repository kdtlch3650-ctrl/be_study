package be_study.quiz.quiz50;

import java.util.List;

public class Quiz50DTO {
	int id;
	String name;
	List<ContactsList> contacts;
	AddressDTO address;
	List<OrdersList> orders;
}

class ContactsList{
	String type;
	String value;
}

class AddressDTO{
	String street;
    String city;
    String zipcode;	
}

class OrdersList{
	String orderId;
	String date;
	List<ItemList> items;
}

class ItemList{
	int Item_id;
	String name;
	int quantity;	
}