package sep_Java_Programs;

import java.util.Scanner;

public class Flowed_Num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ---> " );
		int num = sc.nextInt();
		int increase=1;
		
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print(increase+" ");
				increase++;
				
			}
			System.out.println();
		}

	}

}
