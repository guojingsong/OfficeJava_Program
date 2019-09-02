package practise_package;

import java.util.Scanner;

public class Palindrom_Num {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number -- > ");
		int num = s.nextInt();
		
		int r,sum=0,temp;
		temp=num;
		while(num>0){
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum){
			System.out.println("Palindrom Number");	
		}else{
			System.out.println("Number is not Paalindrom");
		}
	}
}
