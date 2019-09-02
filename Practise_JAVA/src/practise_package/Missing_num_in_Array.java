package practise_package;

public class Missing_num_in_Array {

	public static void main(String[] args) {
		int s1=0,s2=0;
		int a[] ={1,2,3,5,6};
		for(int i=0;i<a.length;i++){
			s1=s1+a[i];
		}
		for(int j=1;j<=6;j++){
			s2=s2+j;
		}
		System.out.println(s2-s1);
	}
}
