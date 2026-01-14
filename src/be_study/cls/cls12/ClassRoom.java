package be_study.cls.cls12;

import java.util.ArrayList;

public class ClassRoom {

	int floor; //몇층
	int roomNumber; //몇호실?
	double area; //30펑
	boolean hasWhiteBoard; //화이트보드 존재여부

	WhiteBoard whiteBoard;
	
	AirCon airCon;
	
//	Desk[] deskArr;
	ArrayList<Desk> deskList;
	
	
	public ClassRoom() {
		floor = 0;
		roomNumber = 0;
		area = 0;
		hasWhiteBoard = false;
		whiteBoard = null;
		airCon = null;
		deskList = null;
		
				
	}
	
	public ClassRoom(int floor,int roomNumber) {
		this.floor = floor;
		this.roomNumber = roomNumber;
	}
	
	public ClassRoom(WhiteBoard wb, AirCon ac) {
		whiteBoard = wb;
		airCon = ac;
		deskList = new ArrayList<Desk>();
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setDeskList(ArrayList<Desk> deskList) {
		this.deskList = deskList;
	}
	public void setWhiteBoard(WhiteBoard whiteBoard) {
		this.whiteBoard = whiteBoard;
	}
	
	//책상 한개를 넘기면 이 교실의 deskList에 추가해주는 기능
	public void addDesk(Desk desk) {
		if(deskList == null) {
		deskList = new ArrayList<Desk>();
		}
		
		deskList.add(desk);
	}
}
