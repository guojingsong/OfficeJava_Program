package practise_package;

public class Max_two_number {

	public static void main(String[] args) {
		int n[]={2,5,5,52,4,3,89,5,589,-5543,34};
		int m1=0;
		int m2=0;
		for(int i=0;i<n.length;i++){
				if(m1<n[i]){
					m2=m1;
					m1=n[i];
				}else if(m2<n[i]){
					m2=n[i];
				}
			}
		System.out.println(m1+" "+m2);

        /*int m1=0,m2=0;

        for(int num:n){
        		if(num>m1){
        			m2=m1;
        			m1=num;
        		}else if(num >m2){
        			m2=num;
        	}
        }
        System.out.println(m1+" "+m2);*/
	 	
	}

}
