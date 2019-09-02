package sep_Java_Programs;

import java.util.Arrays;

public class BobbleSorting {

	public static void main(String[] args) {
		int n[] = {122,43,3,56,273,57,3424,27};
		System.out.println(Arrays.toString(n));
		int temp;
		for(int i=0;i<n.length;i++){
			for(int j=i+1;j<n.length;j++)
			if(n[i]>n[j]){
				temp= n[j];
				n[j]=n[i];
				n[i]=temp;
			}
			System.out.print(n[i]+", ");
		}
    }
}
