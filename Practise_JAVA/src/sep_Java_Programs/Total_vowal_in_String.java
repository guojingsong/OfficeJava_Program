package sep_Java_Programs;

import java.util.Scanner;

public class Total_vowal_in_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String --->" );
		String str = sc.nextLine();
		
		int count=0;
		char[] ch = str.toCharArray();
		for (char c:ch) {
			switch(c){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
					break;
		}
	}
		System.out.println("Number of vowal is in String --  > " + count);
   }
}
