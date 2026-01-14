package be_study.cls.cls10;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList 개념
		String[] sArr1 = new String[4];
		sArr1[0] = "A";
		sArr1[1] = "B";
		sArr1[2] = "C";
		sArr1[3] = "D";
//		sArr1[4] = "E"; 4번을 추가할 수 없음

		String[] sArr2 = new String[5];
		for (int i = 0;i<sArr1.length;i++) {
			sArr2[i] = sArr1[i];
			
		}
		sArr2[4] = "E";
		//4번을 위해 배열을 늘려 새로만듬
		
		for(String s : sArr2) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		System.out.println("============Array==============");
		//ArrayList
		//ArayList<저장할 타입> 변수명 = new ArrayList<저장할 타입>();
		
		ArrayList<String> sList = new ArrayList<String>();
		sList.add("A");//리스트에 값 추가 .add
		sList.add("B");
		sList.add("C");
		sList.add("D");
		sList.add("E");
		sList.add("F");
		
		
		for(String s : sList) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//List의 길이 list.size
		//배열의 길이 배열.length
		for(int i = 0;i<sList.size();i++) {
			//List의 특정인덱스 위치값 접근 .get(index)
			//배열                     arr[index]
			System.out.print(sList.get(i)+" ");
		}
		
		if(sList.contains("B"))System.out.println("contains가 true면 B가 있다");
		else System.out.println("List에 B가 없다.");
		
		
		
		
		
		if(sList.contains("G") == false) {
			sList.add("G");
		}
		
		for(int i = 0;i<sList.size();i++) {
			//List의 특정인덱스 위치값 접근 .get(index)
			//배열                     arr[index]
			System.out.print(sList.get(i)+" ");
		}
		System.out.println();
		
		
		
		
		
		//arr[2] = "H";
		//list.get(2) ??
		
		//list의 특정위치에 값을 저장 set
		sList.set(2, "H");
		for(int i = 0;i<sList.size();i++) {
			//List의 특정인덱스 위치값 접근 .get(index)
			//배열                     arr[index]
			System.out.print(sList.get(i)+" ");
		}
		System.out.println();
		
		
		
		
		//삭제 remove(index) remove(값)
		sList.remove(2); // 자리위치
		sList.remove("F"); // 값 검색 삭제
		for(int i = 0;i<sList.size();i++) {
			//List의 특정인덱스 위치값 접근 .get(index)
			//배열                     arr[index]
			System.out.print(sList.get(i)+" ");
		}
		System.out.println();
		//길이 자체가 짧아짐
		
	}

}
