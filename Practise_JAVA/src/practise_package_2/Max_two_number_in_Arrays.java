package practise_package_2;

import java.util.Random;

public class Max_two_number_in_Arrays {

	public static void main(String[] args) {
/*		
		Random ra= new Random();
		int ssss = ra.nextInt(123);
		System.out.println(ssss);
		
		int a=12345; int rev=0;int digit;
		while(a>0){
			digit = a%10;
			rev=(rev*10)+digit;
			a=a/10;
		}
		System.out.println(rev);
		
		String s = Integer.toString(rev);
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
		String n = "1000";
		int num = Integer.parseInt(n);
		System.out.println(num+100);*/
				
		
		int n[] ={23,54,657,43,547,3};
		int temp;
		for(int i=0;i<n.length;i++){
		  for(int j=i+1;j<n.length;j++){
			  if(n[i]>n[j]){
				  temp = n[j];
				  n[j] = n[i];
				  n[j]=temp;
			  }
		  }
		  System.out.print(n[i]+",");
		}
		System.out.println("");
		
		
		int m1=0;int m2=0;
		for(int i=0;i<n.length;i++){
			if(m1<n[i]){
				m2=m1;
				m1=n[i];
			}else if(m2<n[i]){
				m2=n[i];
			}
		}
		System.out.println(m1+"  "+m2);
	}
}
