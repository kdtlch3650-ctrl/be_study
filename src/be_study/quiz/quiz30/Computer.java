package be_study.quiz.quiz30;

public class Computer {

	public String[] osType = { "윈도우10", "애플 OS X", "안드로이드" };
	public String os;
	public int memory;
	
	Computer(int num,int memory){
		this.os = this.osType[num];
		this.memory = memory;
	}

	public static void main(String[] args) {
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		pc.print();
		apple.print();
		galaxy.print();
	}
	
	void print() {
		System.out.printf("운영체제: %s, 메인메모리: %d\n",this.os,this.memory);
	}
}
