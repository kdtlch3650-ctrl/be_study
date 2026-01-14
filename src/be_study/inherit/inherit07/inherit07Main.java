package be_study.inherit.inherit07;

import java.util.ArrayList;

public class inherit07Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d =new Driver();
		Taxi t = new Taxi();
		Bus b = new Bus();
		
		d.drive(t);
		
		Vehicle v1 = new Taxi();
		Vehicle v2 = new Bus();
		Vehicle v3 = new Vehicle();
		
		d.drive(v1);
		d.drive(v2);
		d.drive(v3);
		
		System.out.println("=====================");
		
		ArrayList<Vehicle> vc01 = new ArrayList<Vehicle>();
		vc01.add(new Taxi());
		vc01.add(new Bus());
		vc01.add(new Vehicle());
		
		for (Vehicle v : vc01) {
			v.run();
		}
		
		
		Taxi t2 = takeTaxi();
		Bus b2 = takeBus();
		
		Vehicle v10 = takeTaxi();
		Vehicle v11 = takeBus();
	}
	public static Taxi takeTaxi() {
		return new Taxi();
	}
	
	public static Bus takeBus() {
		return new Bus();
	}
	
	public static Vehicle takeBus2() {
		return new Bus();
	}

}
