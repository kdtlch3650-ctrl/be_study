package be_study.quiz.quiz51;

public class ApiServiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DustFrcstDspthRepository repository = new DustFrcstDspthRepository();
		
		
			DustDTO dustDTO = repository.getDust("2026-01-01", "PM10");
			
			DustDAO dustDAO = new DustDAO();
			
			int r1 = dustDAO.saveDust(dustDTO);
			if(r1 > 0)
				System.out.println("1번 잘 저장됨");
	}

}
