package practise_package;

public class Factorial_Pro {

	public static void main(String[] args) {
       fact(5);
	}
	
	public static void fact(int n){
		int f=1;
		for(int i=1;i<=n;i++){
			f = f*i;
		}
		System.out.println(f);
	}

}
