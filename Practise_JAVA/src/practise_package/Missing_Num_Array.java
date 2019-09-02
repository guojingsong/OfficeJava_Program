package practise_package;

public class Missing_Num_Array {

	public static void main(String[] args) {
	int n[] ={1,2,3,4,6};
	int sum=0,sum1=0;
     for(int i=0;i<n.length;i++){
    	 sum = sum+n[i];
     }
     System.out.println(sum);
     for(int j=1;j<=6;j++){
    	 sum1 = sum1+j; 
     }
     System.out.println(sum1);
     System.out.println(sum1-sum);
	}
}
