package be_study.quiz.quiz30_2;

public class SalaryMan {

	int salary = 1000000;

	SalaryMan() {

	}

	SalaryMan(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	}

	int getAnnualGross() {
		return (salary * 12) + (salary * 5);
	}

}
