package be_study.inherit.inherit02;

import be_study.inherit.inherit01.Parent;

public class HideSChild extends Parent{

	public HideSChild() {
		super(0);
	}

	public HideSChild(int money) {
		super(money);
	}

	public void showMoney() {
		System.out.println(money);
	}
	
}
