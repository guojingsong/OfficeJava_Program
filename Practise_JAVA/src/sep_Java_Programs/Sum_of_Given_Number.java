package sep_Java_Programs;

import java.util.Scanner;

public class Sum_of_Given_Number {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number -- > ");
	   int num = sc.nextInt();
	   int sum=0;
	   for(int i=0;i<=num;i++){
		   sum=sum+i;
	   }
	   System.out.println(sum);
	   
			   

	}

}
