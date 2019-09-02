package practise_package_2;

import java.util.Random;
import java.util.Scanner;

public class Basic_Program {

	public static void main(String[] args) {
		//Fact, Palindrom, Armstrong, table, Reverse String, Reverse integer, 
		//Arrange the Arrays in order
	   int fact=1;
		Scanner s=new Scanner(System.in);
	   System.out.println("Enter Number...");
	   int x = s.nextInt();
	   for(int i=1;i<=x;i++){
		   fact=fact*i;
	   }
	   System.out.println(fact);
      }
}
