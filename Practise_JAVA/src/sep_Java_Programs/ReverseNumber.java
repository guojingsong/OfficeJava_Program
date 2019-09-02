package sep_Java_Programs;

public class ReverseNumber {

	public static void main(String[] args) {
		String s="manojkushwaha";
		for(int i=s.length()-1;i>=0;i--){
			char Reverse_Value = s.charAt(i);
			System.out.print(Reverse_Value);
		}
		
		System.out.println();
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
		
		int n=123456; int digit,sum=0;
		while(n>0){
			digit=n%10;
			sum=sum*10+digit;
			n=n/10;
		}
		System.out.println(sum);
		
		int num=234;
		StringBuffer ss=new StringBuffer(String.valueOf(num));
		System.out.println(ss.reverse());
	}
}
