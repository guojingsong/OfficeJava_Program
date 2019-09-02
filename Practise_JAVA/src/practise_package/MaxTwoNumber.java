package practise_package;

public class MaxTwoNumber {
	public static void main(String[] args) {
		int n[] = {1,2,3,4,6};
		int m1=0,m2=0;
		for(int num:n){
			if(num>m1){
				m2=m1;
				m1=num;
			}else if(num>m2){
				m2=num;
			}
		}
		System.out.println(m1+" "+m2);
	}
}
