package practise_package_2;

import java.util.Arrays;

public class Small_Max_Number {

	public static void main(String[] args) {
		int n[] ={23,54,657,43,547,3};
		System.out.println(Arrays.toString(n));
		int small=n[0];int large =n[0];
		for(int i=0;i<n.length;i++){
			if(small>n[i]){
				small=n[i];
			}
			else if(large<n[i]){
				large =n[i];
			}
		}
		System.out.println(small + " "+large);

	}

}
