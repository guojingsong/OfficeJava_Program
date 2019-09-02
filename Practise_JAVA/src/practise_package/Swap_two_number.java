package practise_package;

public class Swap_two_number {

	public static void main(String[] args) {
		int a=6;
		int b=14;
/*		a=a^b;
		b=a^b;
		a=a^b;*/
		
		int temp = a;
		a=b;
		b=temp;
		/*
		a=a+b;
		b=a-b;
		a=a-b;*/
		System.out.print(a+" "+b);

	}

}
