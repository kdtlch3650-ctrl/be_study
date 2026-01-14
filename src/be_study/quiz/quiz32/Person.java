package be_study.quiz.quiz32;

class Person {
	String name;
	int age;

	Person() {

	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void hello() {
		System.out.println(name + " : Hello!");

	}

	String nameReturn(Person a) {

		return a.name;
	}

	Person classReturn(Person a) {
//		a.name = "삼찬희";
//		a.age = 300;
//		return a;
//		아니면
		Person p = new Person("삼찬희",300);
		return p;
	}

	void ageUp(Person a) {
		a.age++;
	}

	void helloPrint(Person[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i].hello();
		}
	}

	int maxAge(Person[] a) {
		int maxage = 0;
		for (int i = 0; i < a.length; i++) {
			if (maxage < a[i].age) {
				maxage = a[i].age;
			}
		}
		return maxage;
	}

	// q21
	Person[] rtPersonArr(int a) {
		Person[] personArr = new Person[a];
		return personArr;
	}

	// q22
	int ageAvg(Person[] a) {
		int avgage = 0;
		for (int i = 0; i < a.length; i++) {
			avgage += a[i].age;
		}
		return avgage;
	}

	void age10(Person[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i].age = 10;
		}
	}

	String[] nameString(Person[] a) {
		String[] namestring = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			namestring[i] = a[i].name;
		}
		return namestring;
	}

	Person nameSearching(Person[] a, String str) {
		for (int i = 0; i < a.length; i++) {

			if (a[i].name.equals(str)) {
				return a[i];
			}
		}
		return null;
	}

	// q29
	Person nameString(Person a) {
//		1)
//		Person newPs = new Person("뉴찬희", 30);
//		newPs.name = a.name;
//		return newPs;
//		2)
//		Person newPs = new Person();
//		newPs.name = a.name;
//		return newPs;
//		3)
		return new Person(a.name,0);
	}

	// q30
	Person[] age30(Person[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (30 <= a[i].age) {
				count++;
			}
		}
		Person[] age30minValue = new Person[count];
		int age30a = 0;
		for (int i = 0; i < a.length; i++) {
			if (30 <= a[i].age) {
				age30minValue[age30a] = a[i];
				age30a++;
			}
		}
		return age30minValue;
	}

	// q31
	void intpersonprint(Person[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("이름 %s, 나이 %d \n", a[i].name, a[i].age);
		}
	}

	void intpersonprint(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

	// q32
	void intpersonprint(Person[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("이름 %s, 나이 %d \n", a[i].name, a[i].age);
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	}

	// q33
	int[] ageInt(Person[] a) {
		int[] intA = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			intA[i] = a[i].age;
		}
		return intA;
	}

	// q34
	Person[] ageInt(int[] a) {
		Person[] personA = new Person[a.length];
		for (int i = 0; i < a.length; i++) {
			personA[i] = new Person(null, a[i]);
			
		}
		return personA;
	}

	// q35
	Person personClone(Person a) {
		Person personclone = new Person();
		personclone.age = a.age;
		personclone.name = a.name;

		return personclone;
	}

//q36
	Person[] personArrClone(Person[] a) {
		Person[] personclone = new Person[a.length];
		for (int i = 0; i < a.length; i++) {
			personclone[i] = new Person(a[i].name, a[i].age);
		}

		return personclone;
	}

//q37
	void nullname(Person[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].name == null) {
				System.out.printf("나는 이름이없고, 나이가 %d이다.\n", a[i].age);
			}
		}
	}

	// q38
	Person[] personArrCloneCut(Person[] a, int b) {
		Person[] personclone = new Person[b];
		for (int i = 0; i < b; i++) {
			personclone[i] = new Person(a[i].name, a[i].age);
		}

		return personclone;
	}

	// q39
	Person personInitialize(Person a) {
		a.age = 0;
		a.name = null;

		return a;
	}

	// q40
	void personArrCompare(Person a, int b) {

		System.out.printf("%s의 나이 %d : 입력값 %d \n", a.name, a.age, b);

	}

	// q41
	Person[] newpersonArr(int b) {
		Person[] newpersonArr = new Person[b];
		for (int i = 0; i < b; i++) {
			newpersonArr[i] = new Person();
		}

		return newpersonArr;
	}

	// q42
	void arrhelloPrint(Person[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i].hello();
		}
	}

	// q43
	void personSave0(Person[] a, Person b) {
		a[0] = b;
	}

	// q44
	Person[] arrUp(Person[] arr) {
		Person[] newArr = new Person[arr.length];
	    for (int i = 0; i < arr.length; i++) {
	        newArr[i] = arr[i];
	        }

	    for (int i = 0; i < newArr.length - 1; i++) {
	        for (int j = 0; j < newArr.length - 1 - i; j++) {
	            if (newArr[j].age > newArr[j + 1].age) {
	                Person temp = newArr[j];
	                newArr[j] = newArr[j + 1];
	                newArr[j + 1] = temp;
	            }
	        }
	    }
	    return newArr;
	}
	
	//q45
	void personChange(Person a) {
		a.age = 66;
		a.name = "트스테";
	}

}