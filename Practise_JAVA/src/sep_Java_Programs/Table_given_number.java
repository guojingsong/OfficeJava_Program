package sep_Java_Programs;

import java.util.Scanner;

public class Table_given_number {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter number -- > ");
		   int num = sc.nextInt();
		   int table;
		   for(int i=1;i<=14;i++){
			   table = num*i;
			   System.out.println(table);
		   }
	}
}
