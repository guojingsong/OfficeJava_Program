package sep_Java_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountEach_charInString {

	public static void main(String[] args) {
		String str = "Manoj Mkushwaha";
		numberOfCharIn_String(str);

	}
	
	public static void numberOfCharIn_String(String str){
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char[] Character =str.toCharArray();
		for (char c : Character) {
			if(!map.containsKey(c)){
				map.put(c, 1);
			}else{
				map.put(c, map.get(c)+1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet(); 
		for(Map.Entry<Character,Integer> entry : entrySet){
			if(entry.getValue()>1){
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}
	}

}
