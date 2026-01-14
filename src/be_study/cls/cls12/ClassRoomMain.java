package be_study.cls.cls12;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassRoomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassRoom croom1 = new ClassRoom();
		croom1.floor = 7;
		croom1.roomNumber = 3;
		croom1.area = 65.7;
		croom1.hasWhiteBoard = true;
		
		WhiteBoard wb = new WhiteBoard();
		wb.sizeX = 1200;
		wb.sizeY = 1000;
		wb.price = 80000;
		wb.isMagnetic = true;
		
		croom1.setWhiteBoard(wb); //croom1에 세팅한 WhiteBoard wb를 넣는다
	
		AirCon ac = new AirCon();
		croom1.airCon = ac;
		
		ArrayList<Desk> deskList = new ArrayList<Desk>();
//		deskList.add(new Desk());
		for (int i = 0; i < 10; i++) {
			Desk d = new Desk();
			d.sizeX =800;
			d.sizeY = 600;
			d.color = "blue";
			
			deskList.add(d);
		}
		
		for (int i = 0; i < 5; i++) {
//			Desk d= new Desk(1200,600,"black");
//			deskList.add(d);
			
			deskList.add(new Desk(1200,600,"black"));
		}
		
		croom1.setDeskList(deskList);
		
		
//		croom1.deskList.add(new Desk(2000,1200,"oak"));
		
		croom1.addDesk(new Desk(2000,1200,"oak"));
		
		ClassRoom cr2 = new ClassRoom(wb, ac);
		cr2.addDesk(new Desk(1200,600,"black"));
		
	}

}
