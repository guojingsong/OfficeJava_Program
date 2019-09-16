package sep_Java_Programs;

import java.util.Scanner;

public class Prime_GivenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number --- > ");
		int num=sc.nextInt();
        boolean prime = true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				prime =false;
				break;
			}
		}
			if(prime==true){
				System.out.println("Given Number is Prime");	
			}else{
				System.out.println("Given Number is not Prime");	 
				}
      }

}
