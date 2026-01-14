package be_study.cls.cls10;

import java.util.ArrayList;

import be_study.cls.cls09.Temp;

public class ClassListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp t1 = new Temp();
		
		Temp[] tArr = new Temp[3];
		tArr[0] = new Temp();
		tArr[1] = new Temp();
		tArr[2] = new Temp();
		//배열 추가 불가!!!!!!
		
		ArrayList<Temp> tList = new ArrayList<Temp>();
		
		tList.add(new Temp());
		tList.add(new Temp());
		tList.add(new Temp());
		tList.add(new Temp());
		
		for(int i =0;i<tList.size();i++) {
			System.out.println(tList.get(i).num+ " ");
			// 				  (Temp       )
			tList.get(i).method();
		}
		System.out.println();
		
		for(Temp t : tList) {
			System.out.print(t.num+ " ");
			t.method();
		}
		System.out.println();
		
		printList(tList);
		
		ArrayList<Temp> returnList = generateList();
		printList(returnList);
	}
	
	public static void printList(ArrayList<Temp> tList) {
		System.out.println("========================================");
		for(Temp t : tList) {
			System.out.print(t.num+ " ");
			t.method();
		}
		System.out.println();
	}
	
	public static ArrayList<Temp> generateList() {
		
		ArrayList<Temp> list = new ArrayList<Temp>();
		list.add(new Temp());
		
		Temp t1 = new Temp();
		list.add(t1);
		return list;
	}

}
