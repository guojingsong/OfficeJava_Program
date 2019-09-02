package practise_package;

public class Palindrom_Number {

	public static void main(String[] args) {
		int n =371;
		int rev,sum=0; int temp;
		temp = n;
		while(n!=0){
			rev=n%10;
			sum=sum*10+rev;
			n=n/10;
		}
		
/*		while(n>0){
			rev=n%10;
			sum=(rev*rev*rev)+sum;
			n=n/10;
		}*/
		if(temp==sum){
			System.out.println("Palindrom OR ArmStrong" );
		}else{
			System.out.println("Not");
		}

	}

}
