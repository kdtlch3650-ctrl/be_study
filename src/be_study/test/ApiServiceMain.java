package be_study.test;

public class ApiServiceMain {

	public static void main(String[] args) {
		VilageFcstInfoServiceRepository repository = new VilageFcstInfoServiceRepository();

		try {
			String result = repository.requestApi_getVilTa("20260116");
			String result2 = repository.requestApi_getVilTa("20260115");
			System.out.println("");
		} catch (Exception e) {
		}
		VilageDTO vilageDTO = repository.getVilage("20260116");

		VilageDAO vilageDAO = new VilageDAO();
		
		VilageDTO vilageDTO2 = repository.getVilage("20260115");

		VilageDAO vilageDAO2 = new VilageDAO();

		int r1 = vilageDAO.saveVilageDAO(vilageDTO);
		
		if (r1 > 0)
			System.out.println("1번 잘 저장됨");
		
		int r2 = vilageDAO2.saveVilageDAO(vilageDTO2);
		
		if (r2 > 0)
			System.out.println("2번 잘 저장됨");
	}

}
