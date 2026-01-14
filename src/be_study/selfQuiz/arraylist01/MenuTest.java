package be_study.selfQuiz.arraylist01;

import java.util.ArrayList;


public class MenuTest {
    public static void main(String[] args) {

        // 1. ArrayList 생성
        ArrayList<Menu> list = new ArrayList<>() ;    // TODO

        // 2. 메뉴 3개 추가하기 (짜장 5000, 짬뽕 6000, 탕수육 12000)
        list.add(new Menu("짜장",5000)) ;    // TODO
        list.add(new Menu("짬뽕",6000)) ;    // TODO
        list.add(new Menu("탕수육",12000)) ;    // TODO

        // 3. 두 번째 메뉴(인덱스 1)의 가격을 7000으로 수정
        list.set(1, new Menu("짬뽕",7000)) ;    // TODO

        // 4. 첫 번째 메뉴(인덱스 0)의 이름 출력
        System.out.println( list.get(0).name );    // TODO

        // 5. "짜장" 메뉴가 리스트에 존재하는지 contains()로 확인
        boolean check = list.contains( new Menu("짜장", 5000) );
        System.out.println(check);
        // 결과가 false인 이유를 주석으로 간단히 설명해라.   //
        //새로운 Menu 클래스를 생성하여 비교 하였기에 이름과 가격이 같아도 다른 주소를 참조한다.
        //고로 false가 나온다

        // 6. 세 번째 메뉴 삭제
        list.remove(2) ;    // TODO

        // 7. 전체 메뉴 출력 (for-each 사용)
        for (Menu m : list) {
            System.out.println(m.name + " : " + m.price);
        }

        // 8. 모든 메뉴 비우기
        list.clear(); ;    // TODO

        // 9. 비어있는지 확인
        System.out.println(list.isEmpty());
    }
}