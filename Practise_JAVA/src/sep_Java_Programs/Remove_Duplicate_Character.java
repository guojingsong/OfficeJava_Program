package sep_Java_Programs;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_Character {

	public static void main(String[] args) {
		String str = "manoj Kushwaha Kushwaha";
		System.out.println(removeDuplicateCharInString(str));
		
		for(int i=str.length()-1;i>=0;i--){
		   System.out.print(str.charAt(i));
		}
	}
	
	
	public static String removeDuplicateCharInString(String str){
		
		Set<Character> s=new HashSet<>();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++){
			Character c=str.charAt(i);
			if(!s.contains(c)){
				s.add(c);
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
