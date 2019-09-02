package inheritance_Pack;

import interface_pack.Student;

public class CarClass implements Student{
	
	public static void start(){
		System.out.println("Start Method");
	}
	
	public void stop(){
		System.out.println("Car stop method");
	}
	
	public void AC(){
		System.out.println("Car AC Method");
	}
	
	public void Patrol(){
		System.out.println("Car Patrol method");
	}

	@Override
	public void S_name() {
		System.out.println("S_name");
		
	}

	@Override
	public void S_Age() {
		System.out.println("S_Age");	
	}

	@Override
	public void S_Address() {
		System.out.println("S_Address");
		
	}
}
