package be_study.exp;

public class Exp02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[3];
		
		try {
			arr = null;
			arr[5] = 10;
		}
//		catch(Exception e) {
//			
//		}//catch (ArrayIndexOutOfBoundsException e) 
//		//더 상위인 예외 클래스가 위에 있어서 얘는 실행 될 수 가 없다
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBoundsException catch block");
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("NullPointerException catch block");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception catch block");
		}
	}

}
