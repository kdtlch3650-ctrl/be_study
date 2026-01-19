package be_study.quiz.quiz51_r;

public class Quiz51 {
	public static void main(String[] args) throws Exception {
		//1 API 요청하기 -> String Text 응답 받기
		ArpltnInforInqireSvcRepository repository = new ArpltnInforInqireSvcRepository();
//		repository.requestAPi_getMinuDustWeekFrcstDspth("2026-01-15");
		MinuDustWeekDTO minuDustWeekDTO = repository.getMinuDustWeekFrcstDspth("2026-01-15");
		//2 응답받은 텍스트 -> json 파싱 -> DTO
		
		//3 DTO -> DAO -> DB 저장
		MinuDustWeekDAO dao = new MinuDustWeekDAO();
		int result = dao.saveMinuDustWeekDAO(minuDustWeekDTO);
		if(result > 0) {
			System.out.println("1번 잘 저장됨");
		}
		
		
	}
}
