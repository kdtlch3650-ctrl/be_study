package be_study.quiz.quiz30_2;

public class Computer {

	public String[] osType = { "윈도우10", "애플 OS X", "안드로이드" };
	public String os;
	public int memory;
	
	Computer(int num,int memory){
		this.os = this.osType[num];
		this.memory = memory;
	}
	
	void print() {
		System.out.printf("운영체제: %s, 메인메모리: %d\n",this.os,this.memory);
	}
}
