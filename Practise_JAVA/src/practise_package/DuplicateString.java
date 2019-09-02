package practise_package;

public class DuplicateString {

	public static void main(String[] args) {
		int c=0;
		String s[]={"A","a","a","B","B","a"};
		for(int i=0;i<s.length;i++){
			for(int j=i+1;j<s.length;j++){
				if(s[i].equals(s[j])){
					c++;
					System.out.println(s[i]);
				}
			}
		}
		if(c>0){
			System.out.println(c);
		}

	}

}
