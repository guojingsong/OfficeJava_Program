package sep_Java_Programs;

import java.util.Arrays;

public class BobbleSorting {

	public static void main(String[] args) {
		int n[] = {120,43,1,56,2273,57,-24,27};
		System.out.println("Print Arrays value ---- > "+Arrays.toString(n));
		System.out.println();
		
		int s=n[0],l=n[0];
		for(int i=0;i<n.length;i++){
			if(s>n[i]){
				s=n[i];
			}
			else if(l<n[i]){
				l=n[i];
			}
		}
		System.out.println("Print small and  large value in array");
		System.out.println(s+" --- "+l);
	
		int m1=0,m2=0;
		for(int i=0;i<n.length;i++){
			if(m1<n[i]){
				m2=m1;
				m1=n[i];
			}
			else if(m2<n[i]){
				m2=n[i];
			}
			
		}
		System.out.println("Print max1 and  max2 value in array");
		System.out.println(m1+"   -   "+ m2);
		
		for(int i=n.length-1;i>=0;i--){
			System.out.print(n[i]+",");
		}
		System.out.println();
		System.out.println("Bobble sorting ");
		int temp;int sum=0;
		for(int i=0;i<n.length;i++){
			for(int j=i+1;j<n.length;j++){
				if(n[i]>n[j]){
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
			
			System.out.print(n[i]+",");
			sum=sum+n[i];
		}
		    System.out.println();
		    System.out.println("Sum of all Arrays number ");
			System.out.println(sum);
		}
}

