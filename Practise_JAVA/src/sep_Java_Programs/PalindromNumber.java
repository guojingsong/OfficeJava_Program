package sep_Java_Programs;

public class PalindromNumber {

	public static void main(String[] args) {
		int n=371;
		int sum=0;int rev;
		int temp=n;
		while(n>0){
			rev=n%10;
			sum=(rev*rev*rev)+sum;
			n=n/10;
		}
		if(sum==temp){
			System.out.println("Number is palindrom");
		}else{
			System.out.println("Not");
		}
	}

}
