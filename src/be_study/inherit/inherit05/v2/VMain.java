package be_study.inherit.inherit05.v2;

import java.util.ArrayList;
import java.util.List;

public class VMain {

	public static void main(String[] args) {
		
		
		Cleaner c1 = new Cleaner();
		Cleaner c2 = new DustCleaner();
		Cleaner c3 = new WindowCleaner();
		Cleaner c4 = new FloorCleaner();
		DustCleaner dc = new DustCleaner();
//		dc.removeDust();
		
		List<Cleaner> list =new ArrayList<Cleaner>();
		
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		
		
		//동일한 사용방법으로 다양한 실행 결과 도출
		//다형성 활용
		for(Cleaner c : list) {
			c.removeDust();
			c.washWindow();
			c.cleanFloor();
		}
		// TODO Auto-generated method stub
//		ArrayList<DustCleaner> dustlist = new ArrayList<DustCleaner>();
//		dustlist.add(new DustCleaner());
//		dustlist.add(new DustCleaner());
//		dustlist.add(new DustCleaner());
//		
//		ArrayList<WindowCleaner> windowList = new ArrayList<WindowCleaner>();
//		windowList.add(new WindowCleaner());
//		windowList.add(new WindowCleaner());
//		windowList.add(new WindowCleaner());
//		
//		ArrayList<FloorCleaner> floorList = new ArrayList<FloorCleaner>();
//		floorList.add(new FloorCleaner());
//		floorList.add(new FloorCleaner());
//		floorList.add(new FloorCleaner());
//		
//		for(int i =0 ; i<dustlist.size();i++) {
//			dustlist.get(i).removeDust();
//		}
//		
//		for(int i =0 ; i<windowList.size();i++) {
//			windowList.get(i).washWindow();
//		}
//		
//		for(FloorCleaner fc : floorList) {
//			fc.cleanFloor();
//		}
		
	}

}
