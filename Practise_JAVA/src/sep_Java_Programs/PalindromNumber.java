package sep_Java_Programs;

public class PalindromNumber {

	public static void main(String[] args) {
		int n=153;
		int rev,temp,sum=0;
		
		//ArmStrong Number
		temp=n;
		while(n>0){
			rev=n%10;
			sum=(rev*rev*rev)+sum;
			n=n/10;
		}
		if(temp==sum){
			System.out.println("Armstrong");
		}else{
			System.out.println("not");
		}
		//Palindrome Number
		int num=12321;
		int r,t,s=0;
		t=num;
		while(num>0){
		r=num%10;
		s=(s*10)+r;
		num=num/10;
	}
		System.out.println(s);
		if(t==s){
		System.out.println("Palindrome");
		}else{
		System.out.println("not");
		}
    }		
}	

