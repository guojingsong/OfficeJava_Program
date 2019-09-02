package practise_package;

public class Delete_Pro {

	public static void main(String[] args) {
/*		table(15);
		star(10);
		System.out.println("");
		star_Reverse(9);
		System.out.println("");
		Prizme(7);
		fabonaci(10);
		factorial(5);
		trangal_2(7);
		trangal(8);
		prizme_Reverse(7);
		System.out.println(" ");
		
		*/
		
		pri(9);
		pri_rev(8);
		
	}
	
	public static void pri_rev(int n){
		for(int i=n-1;i>=0;i--){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}for(int j=i;j>=0;j--){
				System.out.print("* ");
			}System.out.println();
		}
	}
	
	public static void table(int n){
		for(int i=1;i<=10;i++){
			int t = i*n;
			System.out.println(t);
		}
	}
	
	public static void factorial(int n){
		int f=1;
		for(int i=1;i<=n;i++){
			f = i*f;
		}
		System.out.println(f);
	}

	
	public static void fabonaci(int n){
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int i=2;i<=n;i++){
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		System.out.println();
	}
	
	public static void star(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void star_Reverse(int n){
		for(int i=n;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void Prizme(int n){
		for(int i=1;i<=n;i++){
			for(int j=n-1;j>=i;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void prizme_Reverse(int n){
		for(int i=n;i>=1;i--){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pri(int n){
		for(int i=1;i<=n;i++){
			for(int j=n-i;j>=1;j--){
				System.out.print(" ");
			}for(int j=1;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
	}
	
	
	
	public static void trangal(int n){
        for(int i=n;i>=1;i--){
        	for(int j=1;j<=n-i;j++){
        		System.out.print(" ");
        	}
        	for(int j=i;j>=1;j--){
        		System.out.print("* ");
        	}
        	System.out.println();
        }
	}
	
	public static void trangal_2(int n){
		for(int i=0;i<=n;i++){
			for(int j=n-i;j>=1;j--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
