package be_study.quiz.quiz51;

import java.util.List;

public class DustDTO {
	String searchDate;
	String informCode;
	List<Item> items;
	
	public String getSearchDate() {
		return searchDate;
	}
	public void setSearchDate(String searchDate) {
		this.searchDate = searchDate;
	}
	public String getInformCode() {
		return informCode;
	}
	public void setInformCode(String informCode) {
		this.informCode = informCode;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}			
	
	
}

class Item{
	
	String informOverall;
	String informGrade;
	String dataTime;
	String imageUrl3;
	
	public String getInformOverall() {
		return informOverall;
	}
	public void setInformOverall(String informOverall) {
		this.informOverall = informOverall;
	}
	public String getInformGrade() {
		return informGrade;
	}
	public void setInformGrade(String informGrade) {
		this.informGrade = informGrade;
	}
	public String getDataTime() {
		return dataTime;
	}
	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}
	public String getImageUrl3() {
		return imageUrl3;
	}
	public void setImageUrl3(String imageUrl3) {
		this.imageUrl3 = imageUrl3;
	}
	
	
}
