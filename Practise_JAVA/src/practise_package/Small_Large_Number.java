package practise_package;

public class Small_Large_Number {

	public static void main(String[] args) {
		int n[]={2,5,3,3534,6,35,6,65,-322,32,79,8};
		/*int s=n[0];
		int l=n[0];
		for(int i=0;i<n.length;i++){
             if(s>n[i]){
            	 s=n[i];
             }if(l<n[i]){
            	 l=n[i];
             }
		}
		System.out.println(s+" "+l);*/
		
		int m1=0,m2=0;
		for(int i=0;i<n.length;i++){
		    if(m1>n[i]){
		    	m2=m1;
		    	m1=n[i];
		    }if(m2>n[i]){
		    	m2=n[i];
		    }
		}
		System.out.println(m1+"   "+m2);
		
		
	}
}
