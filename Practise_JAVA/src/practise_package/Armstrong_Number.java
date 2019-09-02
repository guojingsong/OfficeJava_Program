package practise_package;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		// 153  (1*1*1)+(5*5*5)+(3*3*3) = 153;  // 370 //371
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number -- > ");
		int num = s.nextInt();
		
		int r,sum=0,temp;
	    temp=num;
	    while(num>0){
	    	r=num%10;
	    	sum=(r*r*r)+sum;
	    	num=num/10;
	    }
	    if(temp==sum){
	    	System.out.println("Armstrong");
	    }else{
	    	System.out.println("Not Armstrong");
	    }
	}
}
