package be_study.quiz.quiz32;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// q11
		Person ps = new Person();
		ps.age = 30;
		ps.name = "이찬희";
		System.out.printf("이름 %s, 나이 %d", ps.name, ps.age);
		System.out.println("\n====================================");

		// q12
		ps.hello();
		System.out.println("\n====================================");

		// q13
		System.out.printf(ps.nameReturn(ps));
		System.out.println("\n====================================");

		// q14
		ps.classReturn(ps);
		System.out.printf("이름 %s, 나이 %d", ps.name, ps.age);
		System.out.println("\n====================================");

		// q15
		Person ps1 = new Person("일찬희", 1);
		Person ps2 = new Person("이찬희", 2);
		System.out.print(ps1.age > ps2.age ? ps1.age + "가 더크다" : ps2.age + "가 더크다");
		System.out.println("\n====================================");

		// q16
		System.out.println(ps.age + "증가 1");
		ps.ageUp(ps);
		System.out.println(ps.age);

		// q17
		Person psRreference = new Person("변경해봐", 999);
		Person psafter = psRreference;
		System.out.println("원본");
		System.out.printf("이름 %s, 나이 %d", psRreference.name, psRreference.age);
		psafter.age = 111;
		psafter.name = "변경했다";
		System.out.printf("\n이름 %s, 나이 %d", psRreference.name, psRreference.age);
		System.out.println("\n====================================");
		System.out.println("변경본");
		System.out.printf("이름 %s, 나이 %d", psafter.name, psafter.age);
		System.out.println("\n====================================");

		// q18
		Person ps01 = new Person("일찬희", 1);
		Person ps02 = new Person("이찬희", 2);
		Person ps03 = new Person("삼찬희", 3);
		Person[] psArr = { ps01, ps02, ps03 };
		System.out.printf("1번 이름 : %s\n", psArr[0].name);
		System.out.printf("2번 이름 : %s\n", psArr[1].name);
		System.out.printf("3번 이름 : %s", psArr[2].name);
		System.out.println("\n====================================");

		// q19
		ps.helloPrint(psArr);
		System.out.println("\n====================================");

		// q20

		System.out.print(ps.maxAge(psArr));
		System.out.println("\n====================================");

		// q21
		Person[] personArr = ps.rtPersonArr(5);

		// q22
		System.out.print(ps.ageAvg(psArr));
		System.out.println("\n====================================");

		// q23
		ps.age10(psArr);
		System.out.printf("1번 나이 : %d\n", psArr[0].age);
		System.out.printf("2번 나이 : %d\n", psArr[1].age);
		System.out.printf("3번 나이 : %d", psArr[2].age);
		System.out.println("\n====================================");

		// q24
		String[] nameArr = ps.nameString(psArr);
		for (int i = 0; i < nameArr.length; i++) {
			System.out.println(nameArr[i]);
		}
		System.out.println("\n====================================");

		// q25
		Person putps = new Person("넣는다", 1);
		psArr[0] = putps;
		System.out.printf("1번 이름 : %s\n", psArr[0].name);
		System.out.println("\n====================================");

		// q26
		personArr[2] = putps;
		for (int i = 0; i < personArr.length; i++) {
			System.out.println(i + "번 null검사");
			if (personArr[i] == null) {
				System.out.println("없는디?");
			} else {
				System.out.println("============");
				System.out.println("===사쿠라네?===");
				System.out.println("============");
			}
		}
		System.out.println("\n====================================");

		// q27
		Person nameLee = ps.nameSearching(psArr, "이찬희");
		System.out.printf("이름 : %s\n", nameLee.name);
		System.out.println("\n====================================");

		// q28
		Person[] personArrEven = ps.rtPersonArr(7);
		for (int i = 2; i < personArrEven.length; i += 2) {
			personArrEven[i] = new Person("무명", i * 10);
		}
		for (int i = 0; i < personArrEven.length; i++) {
			System.out.println(i + "번 null검사");
			if (personArrEven[i] == null) {
				System.out.println("없는디?");
			} else {
				System.out.println("============");
				System.out.println("===사쿠라네?===");
				System.out.println("============");
			}
		}
		System.out.println("\n====================================");

		// q29
		Person newPerson = ps.nameString(psArr[1]);
		System.out.printf("이름 %s, 나이 %d", newPerson.name, newPerson.age);
		System.out.println("\n====================================");

		// q30
		Person[] personArrAge = { new Person("10대", 10), new Person("20대", 20), new Person("30대", 30),
				new Person("40대", 40) };
		Person[] personArrAge30 = ps.age30(personArrAge);
		for (int i = 0; i < personArrAge30.length; i++) {
			System.out.printf("이름 %s, 나이 %d", personArrAge30[i].name, personArrAge30[i].age);
		}
		System.out.println("\n====================================");

		// q31
		int[] inta = { 1, 2, 3, 4, 5 };
		ps.intpersonprint(personArrAge);
		System.out.println();
		ps.intpersonprint(inta);
		System.out.println("\n====================================");

		// q32
		ps.intpersonprint(personArrAge, inta);
		System.out.println("\n====================================");

		// q33
		int[] ageint = ps.ageInt(personArrAge);
		for (int i = 0; i < ageint.length; i++) {
			System.out.print(ageint[i] + " ");
		}
		System.out.println("\n====================================");

		// q34
		Person[] intage = ps.ageInt(ageint);
		for (int i = 0; i < intage.length; i++) {
			System.out.print(intage[i].age + " ");
		}
		System.out.println("\n====================================");

		// q35
		Person personClone = ps.personClone(psArr[1]);
		System.out.printf("이름 %s, 나이 %d", personClone.name, personClone.age);
		System.out.println("\n====================================");

		// q36
		Person[] personArrClone = ps.personArrClone(psArr);
		for (int j = 0; j < personArrClone.length; j++) {
			System.out.printf("이름 %s, 나이 %d\n", personArrClone[j].name, personArrClone[j].age);
		}
		System.out.println("\n====================================");

		// q37
		intage[2].name = "이름이있다";
		intage[0].name = "이름이있다";

		ps.nullname(intage);
		System.out.println("\n====================================");

		// q38
		Person[] personcloneCut = ps.personArrCloneCut(psArr, 2);
		for (int j = 0; j < personcloneCut.length; j++) {
			System.out.printf("이름 %s, 나이 %d\n", personcloneCut[j].name, personcloneCut[j].age);
		}
		System.out.println("\n====================================");

		// q39
		Person personInitialize = new Person("이름", 99);
		ps.personInitialize(personInitialize);
		System.out.printf("이름 %s, 나이 %d\n", personInitialize.name, personInitialize.age);
		System.out.println("\n====================================");
		
		//q40
		ps.personArrCompare(personInitialize,80);
		System.out.println("\n====================================");
		
		//q41
		Person[] newpersonArr = ps.newpersonArr(5);
		for (int j = 0; j < newpersonArr.length; j++) {
			System.out.printf("이름 %s, 나이 %d\n", newpersonArr[j].name, newpersonArr[j].age);
		}
		System.out.println("\n====================================");
		
		//q42
		ps.arrhelloPrint(psArr);
		System.out.println("\n====================================");

		//q43
		Person fiveLee = new Person("오찬희",50);
		ps.personSave0(psArr,fiveLee);
		for (int j = 0; j < psArr.length; j++) {
			System.out.printf("이름 %s, 나이 %d\n", psArr[j].name, psArr[j].age);
		}
		System.out.println("\n====================================");
		
		//q44
		Person[] q44 = { new Person("20대", 20), new Person("10대", 10),new Person("40대", 40) , new Person("30대", 30),
				};
		Person[] q44_return = ps.arrUp(q44);
		for (int j = 0; j < q44_return.length; j++) {
			System.out.printf("이름 %s, 나이 %d\n", q44_return[j].name, q44_return[j].age);
		}
		
		//q45
		Person maintest = new Person("테스트",99);
		ps.personChange(maintest);
		System.out.printf("이름 %s, 나이 %d\n", maintest.name, maintest.age);
		
	}

}
