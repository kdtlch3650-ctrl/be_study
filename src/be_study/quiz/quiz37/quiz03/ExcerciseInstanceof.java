package be_study.quiz.quiz37.quiz03;

class ExcerciseInstanceof {
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
	} // main
	static void action(Robot robo) {
//		robo.dance();
//		robo.draw();
//		robo.sing();
		if(robo instanceof DanceRobot) {
			DanceRobot dRobo = (DanceRobot)robo;
			dRobo.dance();
		}
		if(robo instanceof SingRobot) {
			SingRobot sRobo = (SingRobot)robo;
			sRobo.sing();
		}
		if(robo instanceof DrawRobot) {
			DrawRobot drRobo = (DrawRobot)robo;
			drRobo.draw();
		}
		
	}
}
