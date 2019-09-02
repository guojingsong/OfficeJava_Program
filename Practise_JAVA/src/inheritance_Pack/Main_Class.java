package inheritance_Pack;

public class Main_Class{

	public static void main(String[] args) {
		BMW_Car bm=new BMW_Car();
		bm.start_BMW();
        CarClass c =new BMW_Car();
        CarClass.start();
        
		bm.AC();
		bm.Patrol();
		bm.AC();
		
		
		
	}

}
