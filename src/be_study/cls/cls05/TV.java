package be_study.cls.cls05;

public class TV {
String name;
int makeYear;
int inch;

TV(String name,int makeYear,int inch){
	this.name = name;
	this.makeYear = makeYear;
	this.inch = inch;
}

void show() {
	System.out.printf("%s제품 %d년형 %d인치 TV",name,makeYear,inch);
}
}
