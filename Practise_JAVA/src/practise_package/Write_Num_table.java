package practise_package;

import java.util.Scanner;

public class Write_Num_table {

	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter Number --> ");
	   int n=s.nextInt();
	   
	   for(int i=1;i<=10;i++){
		   int T = n*i;
		   System.out.println(T);
	   }
	}
}
