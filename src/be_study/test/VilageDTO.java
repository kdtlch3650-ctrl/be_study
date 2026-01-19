package be_study.test;

import java.util.List;

public class VilageDTO {
	String base_date;
	List<Item> items;
	public String getBase_date() {
		return base_date;
	}
	public void setBase_date(String base_date) {
		this.base_date = base_date;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "VilageDTO [base_date=" + base_date + ", items=" + items + "]";
	}	
	
	
}

class Item{
	String fcstDate;
	String fcstTime;
	int nx;
	int ny;
	public String getFcstDate() {
		return fcstDate;
	}
	public void setFcstDate(String fcstDate) {
		this.fcstDate = fcstDate;
	}
	public String getFcstTime() {
		return fcstTime;
	}
	public void setFcstTime(String fcstTime) {
		this.fcstTime = fcstTime;
	}
	public int getNx() {
		return nx;
	}
	public void setNx(int nx) {
		this.nx = nx;
	}
	public int getNy() {
		return ny;
	}
	public void setNy(int ny) {
		this.ny = ny;
	}
	@Override
	public String toString() {
		return "Item [fcstDate=" + fcstDate + ", fcstTime=" + fcstTime + ", nx=" + nx + ", ny=" + ny + "]";
	}
//	public String toString() {
//		return "Item [fcstDate=" + fcstDate + ", fcstTime=" + fcstTime;
//	}
	 
	
	
	
}
