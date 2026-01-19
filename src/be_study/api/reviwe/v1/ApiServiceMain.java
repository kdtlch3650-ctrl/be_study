package be_study.api.reviwe.v1;


//	2.MidFcstInfoServiceRepository repository = new MidFcstInfoServiceRepository();
//	try {
//	String result = repository.requestApi_qetMidTa();
//	} catch (Exception e) {}
//	6_2.매개변수 넣어주기
//	9. DAO를 통해 저장
//	10. 잘 저장 되었으면 SQL 에서 확인
public class ApiServiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//API 데이터 요청 -> 결과 값 응담
		MidFcstInfoServiceRepository repository = new MidFcstInfoServiceRepository();
		
		//파싱 데이터 매개변수로 불러오기
		//6_2.매개변수 넣어주기
		MidTaDTO midTaDTO = repository.getMidta("202601150600", "11B10101");
		System.out.println(midTaDTO);
		MidTaDTO midTaDTO2 = repository.getMidta("202601150600", "11B20201");
		System.out.println(midTaDTO2);
		
//		9. DAO를 통해 저장
		MidFcstDAO midFcstDAO = new MidFcstDAO();
		
		int r1 = midFcstDAO.saveMidTa(midTaDTO);
		if(r1 > 0)
			System.out.println("1번 잘 저장됨");
		
		int r2 = midFcstDAO.saveMidTa(midTaDTO2);
		if(r2 > 0)
			System.out.println("2번 잘 저장됨");
		
	}

}
