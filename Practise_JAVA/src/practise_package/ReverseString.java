package practise_package;

public class ReverseString {

	public static void main(String[] args) {
		//reverNumber(12345);
		//removeJunk_Char();
		duplicateString();
		int s=0,s1=0;
		int a[] = {1,2,3,4,6};
		for(int i=0;i<a.length;i++){
			s=s+a[i];
		}
			for(int j=1;j<=6;j++){
				s1=s1+j;
			
		}
			System.out.println(s1-s);
		
	}
	
	public static void duplicateString(){
		String a[] = {"manoj","manoj","java","JAVA","C#","Manoj"};
		System.out.println(a.length);
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i].equals(a[j])){
					System.out.println("Duplicate Number --- > " + a[i]);
				}
			}
		}
	}
	
	public static void reversString(String s){
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
	}
	
	public static void removeJunk_Char(){
		String s = "32423dfsds ! / @ f42df 3432 fds #@^%(&() dsfds";
		s = s.replaceAll("[^A-Za-z@]", "");
		System.out.println(s);
	}
	
	public static void reverNumber(int n){
		int rev =0, digit;
		while(n>0){
			digit = n%10;
			rev = rev*10+digit;
			n=n/10;
		}
		System.out.println(rev);
		
		System.out.println();
		
		long num =123456;
		String numString = String.valueOf(num);
		StringBuffer sb=new StringBuffer(numString);
		System.out.println(sb.reverse());

	}

}
