package oops;

public class Car {
	
	int mod;
	int wheel;
	static String name= "manoj static";
	static String sss = "Static String";
	
	public Car(){
		System.out.println(mod);
		System.out.println(wheel);
		System.out.println(name);
		System.out.println("This is Construction method");
	}
	
	public void c1(){
		mod = 2019;
		wheel = 6;
		name = "nameCar";
		System.out.println("C1 Method");
		System.out.println("C1 Method -- > " + mod + " " + wheel + "  "+ name);
	}
	
	public void c2(){
		mod = 2020;
		wheel = 4;
		name = "C2_BMW";
		System.out.println("C2 Method -- > " + mod + " " + wheel + "  "+ name);
	}
}
