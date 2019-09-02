package practise_package;

import java.util.Arrays;

public class Small_Large_Num {

	public static void main(String[] args) {
		int n[] = {243,87,2,543,5,768,32,9,93};
		System.out.println(Arrays.toString(n));
	int small=n[0];
		int large=0;
		for(int i=0;i<n.length;i++){
				if(n[i]>large){
					large = n[i];
				}else if(n[i]<small){
					small = n[i];
				}
			}
		System.out.println("Small Number -- > " +small +"   "+large);

		int temp;
		for(int i=0;i<n.length;i++){
			for(int j=i+1;j<n.length;j++){
				if(n[i]>n[j]){
					temp = n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
			System.out.print(n[i]+",");
		}

		System.out.println();

		
		
		
		
		}
}
