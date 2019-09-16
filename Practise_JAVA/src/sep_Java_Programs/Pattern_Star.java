package sep_Java_Programs;

import java.util.Scanner;

public class Pattern_Star {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number --- > ");
		int num=sc.nextInt();
		int n=1;
		for(int i=num;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(i);
				n++;
			}
			System.out.println();
		}

	}

}
