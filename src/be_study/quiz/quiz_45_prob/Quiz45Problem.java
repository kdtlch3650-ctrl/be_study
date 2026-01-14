package be_study.quiz.quiz_45_prob;


public class Quiz45Problem {
	static Person[] pArr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pArr = new Person[5];
//		pArr[0] = new Person("20이름",20);
//		pArr[1] = new Person("10이름",10);
//		pArr[2] = new Person("40이름",50);
//		pArr[3] = new Person("30이름",40);
//		pArr[4] = new Person("25이름",30);
		
		method8_main();
		Person[] pArr = method44_main();
		Person[] newArr = method44(pArr);
		for (Person person : newArr) {
			System.out.printf("이름 %s , 나이 %d\n",person.name,person.age);
		}
	}

	public static void method8_main() {
		int[] intArr = { 1, 2, 3, 4, 5 };

		for (int n : intArr) {
			System.out.print(n + " ");
		}
		System.out.println();
		method8(intArr);
		for (int n : intArr) {
			System.out.print(n + " ");
		}
	}

	public static void method8(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]++;
		}
	}
	
	static Person[] method36(Person[] a) {
		Person[] personclone = new Person[a.length];
		for (int i = 0; i < a.length; i++) {
			personclone[i] = new Person(a[i].name, a[i].age);
		}

		return personclone;
	}
	
	//------------------------------------------------------
	
	public static Person[] method44_main() {
		Person[] pArr = new Person[5];
		pArr[0] = new Person("20이름",20);
		pArr[1] = new Person("10이름",10);
		pArr[2] = new Person("40이름",50);
		pArr[3] = new Person("30이름",40);
		pArr[4] = new Person("25이름",30);
		return pArr;
	}
	
	public static Person[] method44(Person[] pArr) {
		Person[] newArr = method36(pArr);
		
		
		//i랑 i+1이랑 비교하기에 length까지 비교하면 크기 에러남 고로 -1
		for (int i = 0; i < newArr.length-1; i++) {
			//맨뒷 순자는 제일 큰 숫자로 고정해야하기에 수행횟수가 줄어들어야함 -i
			for (int j = 0; j < newArr.length-1-i; j++) {
				if(newArr[j].age>newArr[j+1].age) {
					Person temp = newArr[j];
					newArr[j] = newArr[j+1];
					newArr[j+1] = temp;
				}
			}
		}
		return newArr;
		
//		for (int i = newArr.length-2; i >=0; i--) {
//			for(int j=0; j<=i; j++) {
//				
//			}
//		}
		
		
	}
	
	
	
}
