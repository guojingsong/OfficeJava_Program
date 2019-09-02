package practise_package;

public class Prizme_Program {
	public static void main(String[] args){
		trangal(10);
		trangal_2(9);
		
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

