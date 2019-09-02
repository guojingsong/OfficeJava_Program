package practise_package;

public class Pro {

	public static void main(String[] args) {
		//s(8);	
		//s1(8);
		StringReverce("suraj");
		System.out.println();
		fabon(10);
		System.out.println();
		facto(4);
		swap(10, 15);
		palindrom(1234321);
		palindrom(12343);
		armstrongNumber(371);
		System.out.println();
		armstrongNumber(372);
		
	}
	
	public static void palindrom(int n){
		int r,sum=0,temp;
		temp=n;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}if(temp==sum){
			System.out.println("Palindrom number--- > " + temp);
		}else{
			System.out.println("Not palindrom  number--- > " + temp);
		}
		System.out.println();
	}
	
	public static void armstrongNumber(int n){
		int r,sum=0,temp;
		temp=n;
		while(n>0){
			r=n%10;
			sum=(r*r*r)+sum;
			n=n/10;
		}if(temp==sum){
			System.out.println("Armstrong Number --- > " + temp);
		}else{
			System.out.println("Not Armstrong Number ----> " + temp);
		}
	}
	
	public static void s(int n){
		for(int i=0;i<=n;i++){
			for(int j=n-i;j>=1;j--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void s1(int n){
		for(int i=n;i>=0;i--){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}for(int j=i;j>=0;j--){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void fabon(int n){
	 int n1=0,n2=1,n3;
	 System.out.print(n1+" "+n2);
	 for(int i=0;i<=n;i++){
		 n3=n1+n2;
		 System.out.print(" "+n3);
		 n1=n2;
		 n2=n3;
	 }
	}
	
	public static void facto(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		   System.out.println(fact);
		}
	
	public static void swap(int a, int b ){
		   a=a+b;
		   b=a-b;
		   a=a-b;
		   System.out.println("A -- > " + a+"  "+ " B --> " +b);
	}
	
	public static void StringReverce(String s){
		for(int i=s.length()-1;i>=0;i--){
		 char reverseValue = s.charAt(i);
		 System.out.print(reverseValue);
	}
	
		System.out.println();
		StringBuffer sb=new StringBuffer(s);
		System.out.print(sb.reverse());
	}

}
