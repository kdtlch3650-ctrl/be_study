package be_study.quiz.quiz34;

import java.util.ArrayList;

public class KitchenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cup> cup = new ArrayList<Cup>();
		cup.add(new Cup(1,"흰색","도기"));
		cup.add(new Cup(1,"검정","도기"));
		cup.add(new Cup(1,"브라운","나무"));
		ArrayList<TrashCan> binArr = new ArrayList<TrashCan>();
		binArr.add(new TrashCan());
		binArr.add(new TrashCan());
		Kitchen kc = new Kitchen();
		kc.area = 30;
		kc.color = "black";
		kc.floor = 50;
		kc.fridge = new Fridge();
		kc.sink = new Sink();
		kc.stove = new Stove();
		kc.cup = cup;
		kc.binArr = binArr;
		
		kc.fridge.PowerOn();
		kc.fridge.setTemp(-3);
		System.out.println(kc.fridge.temp);
		kc.fridge.PowerOff();
		
		kc.stove.PowerOn();
		System.out.println(kc.stove.setTemp(3));
		kc.stove.PowerOff();
		
		kc.binArr.get(1).fillPercent();
		
		kc.binArr.get(1).fillup(40);
		
		kc.binArr.get(1).open();
		kc.binArr.get(1).fillup(40);
		kc.binArr.get(1).fillup(40);
		kc.binArr.get(1).fillup(40);
		kc.binArr.get(1).fillup(40);
		kc.binArr.get(1).clean();
		kc.binArr.get(1).fillPercent();
		kc.binArr.get(1).fillup(40);
		kc.binArr.get(1).close();
		
		System.out.println(kc.cup.get(0).color);
		kc.cup.get(0).color = "회색";
		System.out.println(kc.cup.get(0).color);
		System.out.println(kc.cup.get(1).color);
	
	}

}
