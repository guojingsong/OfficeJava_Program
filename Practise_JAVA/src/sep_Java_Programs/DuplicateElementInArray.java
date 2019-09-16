package sep_Java_Programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		String duplicate[] = new String[]{"java","manoj","java","manoj","java"};
        
		Set nonDuplicateSet = new HashSet<>();
		Set DuplicateSet = new HashSet<>();	
		
		for (String str : duplicate) {
			if(nonDuplicateSet.contains(str)){
				nonDuplicateSet.add(str);
			}else{
				DuplicateSet.add(str);
			}
		}
		System.out.println(DuplicateSet);
	}

}
