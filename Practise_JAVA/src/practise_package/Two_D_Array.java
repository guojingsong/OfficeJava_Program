package practise_package;

public class Two_D_Array {

	public static void main(String[] args) {
		int[][] a= new int[3][4];
		a[0][0] = 80;
		a[0][1] = 01;
		a[0][2] = 02;
		a[0][3] = 03;

		a[1][0] = 10;
		a[1][1] = 11;
		a[1][2] = 12;
		a[1][3] = 13;
		
		a[2][0] = 20;
		a[2][1] = 21;
		a[2][2] = 22;
		a[2][3] = 23;
		int row=a.length;
		int col=a[0].length;
		System.out.println(row);
		System.out.println(col);
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println(" -----------");
        
		for(int i=a.length-1;i>=0;i--){
			for(int j=a[0].length-1;j>=0;j--){
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		// Two D Object array
		
		Object[][] o=new Object[2][3];
		o[0][0] = 'A';
		o[0][1] = "manoj";
		o[0][2] = 123.724;
		
		o[1][0] = 'B';
		o[1][1] = "narendra";
		o[1][2] = 223.724;
		
		for(int i=0;i<o.length;i++){
			for(int j=0;j<o[0].length;j++){
				System.out.print(o[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
