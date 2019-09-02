package inheritance_Pack;

public class BMW_Car extends CarClass{
	
	public void start_BMW(){
		stop();
		System.out.println("Self Start in BMW");
	}
	
	public void wifi(){
		System.out.println("Wifi in BMW");
	}
	
	public void Back_Camera(){
		System.out.println("Back_Camera in BMW");
	}
	
	public void Lock(){
		AC();
		System.out.println("Self Lock in BMW");
	}
	
	
	
}
