package practise_package;

import java.util.Random;

public class Star_Pattern {

	public static void main(String[] args) {
		int sum=0;
		int n[] = {2,12,5,4,2};
		for(int i=0;i<n.length;i++){
			sum=sum+n[i];
		}
		System.out.println(sum);
		
		String a="manoj";
		String b="sar";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a+"  "+b);
		
		System.out.println();
		
		int d=1234;
		String g =String.valueOf(d);
		StringBuffer sb=new StringBuffer(g);
		System.out.println(sb.reverse());
		
		Random r= new Random();
		int ran=r.nextInt(20);
		System.out.println(ran);
		
		/*for(int i=0;i<=6;i++){
			for(int j=6-i;j>=0;j--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=6;i>=0;i--){
			for(int j=0;j<=6-i;j++){
				System.out.print(" ");
			}
			for(int j=i;j>=0;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<=7;i++){
			for(int j=i;j>=0;j--){
				System.out.print("@ ");
			}
			System.out.println();
		}
		
		for(int i=6;i>=0;i--){
			for(int j=0;j<=i;j++){
				System.out.print("& ");
			}
			System.out.println();
		}*/
	}

}
