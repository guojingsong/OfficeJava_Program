package practise_package;

import java.util.Arrays;
public class SumOf_100 {

	public static void main(String[] args) {
		int n=50;
		int su=0;
		for(int i=0;i<=n;i++){
			su=su+i;
		}
		System.out.println(su);
	
		for(int i=1;i<=n;i++){
			if(i%2==0)
			System.out.print(i+"|");
		}	
		System.out.println();
		
		int aa[] ={32,43,54,65,23,5};
		System.out.println(Arrays.toString(aa));
		for(int i=aa.length-1;i>=0;i--)
		{
			System.out.print(aa[i]+",");
		}
		System.out.println();
		
		int temp;
		for(int i=0;i<aa.length;i++){
			for(int j=i+1;j<aa.length;j++){
				if(aa[i]>aa[j]){
					temp = aa[i];
					aa[i]=aa[j];
					aa[j]=temp;
				}
			}
			System.out.print(aa[i]+",");
		}
		System.out.println();
		
		int num=100; int sum=0;
		for(int i=1;i<=num;i++){
			sum=sum+i;
		}
		System.out.println(sum);
   
		String s = "32wr324 32432  324 #^%$&b87 &^*&^9n";
		String newS=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(newS);
		
		String ss = "manojkushwaha";
		for(int i=ss.length()-1;i>=0;i--){
			System.out.print(ss.charAt(i));
		}
		System.out.println();
		StringBuffer sb=new StringBuffer(ss);
		System.out.println(sb.reverse());
		
		int num1=12345,digit, rev=0;
		String str = String.valueOf(num1);
		StringBuffer sss=new StringBuffer(str);
		System.out.println(sss.reverse());
		
		while(num1!=0){
			digit = num1%10;
			rev=rev*10+digit;
			num1=num1/10;
		}
		System.out.println(rev);
	}
}
