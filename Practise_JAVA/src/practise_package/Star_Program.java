package practise_package;

import java.util.Scanner;

public class Star_Program {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Some Number ---> ");
		//int N = s.nextInt();
		for(int i=10;i>=0;i--){
			for(int j=i;j>=0;j--){
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
