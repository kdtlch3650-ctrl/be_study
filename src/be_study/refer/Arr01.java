package be_study.refer;

public class Arr01 {
	public static void main(String[] args) {

		//배열 변수에 Arr 붙여서 구분해주자
		int[] scoreArr = { 100, 50, 75, 80, 40 };
		//index 번호표       [0] [1] [2]...[n] 0부터 시작한다.	

		
		int sum = getSum(scoreArr);
		
		double avg = getAvg(scoreArr, sum);
		
		System.out.printf("총점 : %d 평균: %f\n",sum ,avg );
		
		
		int[] pointArr = null;
//		pointArr = new int[] {30,12,10,5,1};
		
		pointArr = new int[5];
		
		pointArr[0]=30;
		pointArr[1]=12;
		pointArr[2]=10;
		pointArr[3]=5;
		pointArr[4]=1;
//		pointArr[5]=1;
//		ArrayIndexOutOfBoundsException 인덱스 범위를 벗어났다!!
		
		for(int i = 0 ; i<5;i++) {
			pointArr[i] = i+1;
		}
		
		for(int i = 1 ; i<=5;i++) {
			pointArr[i-1] = i;
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(pointArr[i]+"");
		}
		
		System.out.println(pointArr); //주소를 출력
//		System.out.println(pointArr[1]); //1인덱스의 값을 출력
		
		//new 연산자로 배열을 처음 생성하면 자동으로 기본값으로 초기화
		//참조 타입은 null값 나머지는 0  String은 참조타임
		
		int[] intArr = new int[6];
		double[] doubleArr =new double[12];
		String[] stringArr = new String[30];
		boolean[] booleanArr = new boolean[17];
		
		for (int i=0;i<6; i++) {
			System.out.print(intArr[i]+" ");
		}
		System.out.println();
		
		for (int i=0;i<12; i++) {
			System.out.print(doubleArr[i]+" ");
		}
		System.out.println();
		
		for (int i=0;i<30; i++) {
			System.out.print(stringArr[i]+" ");
		}
		System.out.println();
		
		for (int i=0;i<7; i++) {
			System.out.print(booleanArr[i]+" ");
		}
		System.out.println();
		
//		booleanArr.length 길이 값 반환
		for (int i=0;i<booleanArr.length; i++) {
			System.out.print(booleanArr[i]+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	public static int getSum(int scoreArr[]) {
		int sum = 0;
		for (int i = 0; i < scoreArr.length; i++) {
			sum += scoreArr[i];
		}
		return sum;
	}
	
	public static double getSum(double scoreArr[]) {
		double sum = 0;
		for (int i = 0; i < scoreArr.length; i++) {
			sum += scoreArr[i];
		}
		return sum;
	}
	
	public static double getAvg(int scoreArr[], int sum) {		
		double avg = (double) sum / scoreArr.length;		
		return avg;		
	}
	
	public static double getAvg(double scoreArr[],double sum) {		
		double avg = (double) sum / scoreArr.length;		
		return avg;		
	}
}
