package be_study.codeTest;

public class Day9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = "";
		String rsp = "205";
		char[] charRsp = new char[rsp.length()];
		for (int i = 0; i < rsp.length(); i++) {
			charRsp[i] = rsp.charAt(i);
			switch (charRsp[i]) {
			case '2':
				charRsp[i] = '0';
				break;
			case '0':
				charRsp[i] = '5';
				break;
			case '5':
				charRsp[i] = '2';
				break;
			default:
				break;
			}
			answer += charRsp[i];
		}

		System.out.println(answer);
	}
}
