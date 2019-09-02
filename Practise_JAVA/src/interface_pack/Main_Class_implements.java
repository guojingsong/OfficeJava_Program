package interface_pack;

public class Main_Class_implements implements Emp,Student{

	public static void main(String[] args) {
		Main_Class_implements m=new Main_Class_implements();
		m.E_Age();
		System.out.println(i);
		System.out.println(name);
		
		System.out.println(name_E);

	}

	@Override
	public void E_name() {
		System.out.println("E_name");
	}

	@Override
	public void E_Sal() {
		System.out.println("E_Sal");
		
	}

	@Override
	public void E_Age() {
		System.out.println("E_Age");
		
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
