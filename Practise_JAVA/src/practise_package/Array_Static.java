package practise_package;

public class Array_Static {

	public static void main(String[] args) {
		int[] a= {32,43,2,5,325,24};
        int b[] = new int[5];
        b[0]=1; b[1]=4; b[2]=10; b[3]=14; b[4]=15;
        for(int i=0;i<a.length;i++){
        	System.out.print(a[i] +", ");
        }
        System.out.println("");
        for(int j=a.length-1;j>=0;j--){
        	System.out.print(a[j]+", ");
        }
	}
}
