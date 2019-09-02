package practise_package;

public class Number_of_A_String {

	public static void main(String[] args) {
		String s="manoj kushwaha aaa";
		int c=0;
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'){
				c++;
			}
		}
		if(c>0){
			System.out.println("Number of A --> " + c);
		}
	}
}
