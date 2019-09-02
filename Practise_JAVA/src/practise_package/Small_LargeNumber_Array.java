package practise_package;

public class Small_LargeNumber_Array {

	public static void main(String[] args) {
		int a[] = {2,543,21,68,-435,689,23,325};
		int larg = a[0];
		int small = a[0];
        for(int i=0;i<a.length;i++){
        	if(a[i] > larg){
        		larg = a[i];
        	}
        else if (a[i] < small){
        	    small =a[i];
            }
        }
        System.out.println("All array values --- > " + a.toString());
        System.out.println(small);
        System.out.println(larg);
	}

}
