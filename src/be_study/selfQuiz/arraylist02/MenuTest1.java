package be_study.selfQuiz.arraylist02;

import java.util.ArrayList;

public class MenuTest1 {
    public static void main(String[] args) {

        // ArrayList<Menu> 생성하기
    	ArrayList<Menu> menuList = new ArrayList<Menu>();
    	menuList.add(new Menu("짜장",5000));
    	menuList.add(new Menu("짬뽕",6000));
    	menuList.add(new Menu("탕수육",12000));
        // "짜장"(5000), "짬뽕"(6000), "탕수육"(12000) 추가하기

        // 짬뽕 가격을 7000으로 바꾸기 (set 사용 X → 리스트에서 찾아서 직접 변경)
    	menuList.get(1).price = 7000;
        // 모든 메뉴 출력(for-each)
    	for(Menu m:menuList) {
    		System.out.println(m);
    	}
    }
}