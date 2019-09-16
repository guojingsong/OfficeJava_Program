package sep_Java_Programs;

import java.util.Scanner;

public class String_Is_Pallindrom {

	public static void main(String[] args) {
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String by keyboard ---> " );
		String str = sc.nextLine();
		
		for(int i=str.length()-1;i>=0;i--){
			reverse=reverse+str.charAt(i);
		}
		if(str.equalsIgnoreCase(reverse)){
			System.out.println("Pallindrom");
		}else{
			System.out.println("not");
		}
    }
}
