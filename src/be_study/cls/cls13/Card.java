package be_study.cls.cls13;

public class Card {
	int id;
	String type;
	String owner;
	String brand;

	public Card(int id, String type, String owner, String brand) {
		super();
		this.id = id;
		this.type = type;
		this.owner = owner;
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
