package be_study.inherit.inherit05.v1;

import java.util.ArrayList;

public class VMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<DustCleaner> dustlist = new ArrayList<DustCleaner>();
		dustlist.add(new DustCleaner());
		dustlist.add(new DustCleaner());
		dustlist.add(new DustCleaner());
		
		ArrayList<WindowCleaner> windowList = new ArrayList<WindowCleaner>();
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());
		
		ArrayList<FloorCleaner> floorList = new ArrayList<FloorCleaner>();
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());
		
		for(int i =0 ; i<dustlist.size();i++) {
			dustlist.get(i).removeDust();
		}
		
		for(int i =0 ; i<windowList.size();i++) {
			windowList.get(i).washWindow();
		}
		
		for(FloorCleaner fc : floorList) {
			fc.cleanFloor();
		}
		
	}

}
