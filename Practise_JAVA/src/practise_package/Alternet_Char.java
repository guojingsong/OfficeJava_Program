package practise_package;

import java.util.Arrays;

public class Alternet_Char {

	public static void main(String[] args) {
		int fact=1;
		for(int i=1;i<=5;i++){
			fact=fact*i;
		}
		System.out.println(fact);
		System.out.println();
		
		int table,nu=7;
		for(int i=1;i<=5;i++){
			table=nu*i;
			System.out.println(table);
		}

		System.out.println();
		
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);

		for(int i=1;i<10;i++){
			n3=n1+n2;
		  System.out.print(" "+n3);
		  n1=n2;
		  n2=n3;
		}
		System.out.println();
	
		String s="manoj kushwaha Rsystems";
		for(int i=0;i<s.length();i+=2){
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		int n=12345; int rev=0;
		
		while(n>0){
			int digit = n%10;
		    rev=rev*10+digit;
		    n=n/10;
		}
		System.out.println(rev);
		int c=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'){
				c++;
			}
		}
		if(c>0)
		System.out.println(c);
		
		int temp;
		int a[] = {32,4335,7,35,67,3,543};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		System.out.print(a[i]+",");
	   }
	}

}
