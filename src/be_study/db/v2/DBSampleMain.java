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
				
		DeptDAO deptDAO = new DeptDAO();
		
		//Insert 저장
		int r1 = deptDAO.saveDept(70, "COMPUTER", "SEOUL");
		if (r1 > 0) {
			System.out.println("저장이 잘 됐나보다~");
		}
		//객체로 모아 넘기기
		Dept saveD1 = new Dept();
		//saveD1.setDeptno(70); //70번 겹쳐서 안된다!
		saveD1.setDeptno(90);
		saveD1.setDname("QA");
		saveD1.setLoc("BUSAN");
		
		int r2 = deptDAO.saveDept(saveD1);
		if (r2 > 0) {
			System.out.println("r2도 저장이 잘 됐나보다~");
		}
		
		//객체 여러개 리스트 형태로 저장
		List<Dept> saveDeptList = new ArrayList<Dept>();
		saveDeptList.add(new Dept(81,"DNAME81","LOC81"));
		saveDeptList.add(new Dept(82,"DNAME82","LOC82"));
		saveDeptList.add(new Dept(83,"DNAME83","LOC83"));
		
		//리스트를 객체별 저장
		int r3 = 0;
		for(Dept d : saveDeptList) {
			int result = deptDAO.saveDept(d);
			r3 += result;
			if(result >0) {
				System.out.println("dept 저장 잘됨");
			}
		}
		System.out.println("총 몇개 저장되었나 저장된 행 수 : "+ r3);
		
		//Delete 삭제
		int rd1 = deptDAO.removeDept(70);
		int rd2 = deptDAO.removeDept(81);
		int rd3 = deptDAO.removeDept(82);
		int rd4 = deptDAO.removeDept(83);
		
		//Dept rmd = new Dept(90, "name", "loc"); Dept로 넘기면 90만 뽑아 작동함
		Dept rmd = new Dept(90, null, null);
		int rd5 = deptDAO.removeDept(rmd);
		
		if(rd1 > 0) {
			System.out.println("deptno 70번 삭제됨");
		}
		
		if(rd5 > 0) {
			System.out.println("deptno 90번 삭제됨");
		}
		
		/**********************************************/
		//Update 처리
		//사전에 존재하는 데이터
		//INSERT INTO dept (deptno, dname, loc) VALUES (50, 'COMPUTER', 'SEOUL');
		
		Dept update = new Dept(50, "DEVELOP","SEOUL");
		int ru1 = deptDAO.modifyDept(update);
		if(ru1 >0) {
			System.out.println("업뎃 성공~");
		}
		
		update = new Dept(50, "INFRA","BUSAN");
		ru1 = deptDAO.modifyDept(update);
		if(ru1 >0) {
			System.out.println("업뎃 성공~");
		}
		
		//Update 처리
		//기존 데이터 조회 -> 바꾸고 싶은 부분만 변경 (유지할 데이터는 기존값 그대로) -> 다시 Update 시도
		Dept ud1 = deptDAO.findDeptByDeptno(50);
		//ud1 -> 활용 -> 표시
		// 수정할 사항 변경 -> 수정 시도
		//LOC "BUSAN" -> "INCHEON"
		ud1.setLoc("INCHEON");
		
		int ru2 = deptDAO.modifyDept(ud1); //키값 50 으로 조건 -> LOC 수정, DNAME 기존값 그대로
		if(ru2 > 0) {
			System.out.println("ru2 업데이트 잘됨");
		}
		
		
		
		Dept d1 = deptDAO.findDeptByDeptno(20);
		System.out.println(d1.getDeptno() + " " + d1.getDname() + " " + d1.getLoc());
		System.out.println(d1.toString());
		
		Dept d2 = deptDAO.findDeptByDeptno(70);
		if(d2 != null)
			System.out.println(d2.toString());
		
		Dept d3 = deptDAO.findDeptByDname("SALES");
		System.out.println(d3.toString());
		
		Dept d4 = deptDAO.findDeptByDname("DEEPSLEEP");
		if(d4 == null) {
			System.out.println("해당 부서명 데이터 없음");
		} else {
			System.out.println(d4.toString());
		}
		
		List<Dept> deptList = deptDAO.findDeptList();
		
		if(deptList == null) {
			System.out.println("데이터 없음");
		} else { //데이터 있음
			
			for(Dept d : deptList) {
				System.out.println(d.toString());
			}
		}
		
		ProductDAO productDAO = new ProductDAO();
		Product p = productDAO.findProductByPCode(103);
		System.out.println(p.toString());

		List<Product> pList = productDAO.findProductList();
		for(Product pd : pList) {
			System.out.println(pd.toString());
		}
		
	}	
	

}







