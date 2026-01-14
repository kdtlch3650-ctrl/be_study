package be_study.db.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBSampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		findproduct();
//		selectDept();
//		selectDeptWhere();
//		findDeptByDeptnoPrint(20);
//		findDeptByDeptnoPrint(40);
//		findDeptByDeptnoPrint(10);

		Dept d1 = findDeptByDeptno(20);
		System.out.println(d1.toString());

		// 없는 데이터 찾기
		Dept d2 = findDeptByDeptno(70);
		if (d2 != null)
			System.out.println(d2.toString());

		Dept d3 = findDeptByDname("SALES");
		System.out.println(d3.toString());

		Dept d4 = findDeptByDname("DEEPSLEEP");
		if (d4 == null) {
			System.out.println("해당 부서명 데이터 없음");
		} else {
			System.out.println(d4.toString());
		}
		
		List<Dept> deptList = findDeptList();
		if(deptList == null) {
			System.out.println("데이터 없어");
		} else {
			for(Dept d : deptList) { //향상된 for문 deptList에서 하나씩 뽑아서 d에다 저장
				System.out.println(d.toString());
			}
		}
		
		List<Dept> deptList2 = findDeptList2();
//		if(deptList2.size() == 0) { //초기화 O 추가된 데이터가 X 비었다
//		}
		if( deptList2 != null && deptList2.size() > 0) {
			//조회된 데이터가 있는 경우 처리할 코드
			for(Dept d : deptList2) { 
				System.out.println(d.toString());
			}
		}
	}

	

	// readDept findDept findDeptList
	
}
