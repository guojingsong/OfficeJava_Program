package practise_package;

public class StringClass {

	public static void main(String[] args) {
		String str = "manoj Kushwaha MCA";
		String str1 = "Manoj Kushwaha MCA";		
		String str2 = "Manoj not Kushwaha";
		
		for(int i=5;i<=10;i++){
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		
		int hashcodeValue = str1.hashCode();
		System.out.println(hashcodeValue);
		
		int indexof_K = str.indexOf('K');
		int String_Index = str.indexOf("MCA");
		
		System.out.println(indexof_K);
		System.out.println(String_Index);
		
		if(hashcodeValue == 996659480){
			System.out.println("No Problem -- > " + str1);
		} else{
			System.out.println("hashcode ka value ---> Not equale to 996659480 " + hashcodeValue);
		}
		
		
		
		/*System.out.println(str.length());
		System.out.println(str.charAt(4));
		System.out.println(str.indexOf("K"));
		
		StringBuffer sb =new StringBuffer(str);
		System.out.println(sb.reverse());
		
		System.out.println();
		
		int result = str.compareTo(str1);
		System.out.println(result);
		
		
		result = str.compareTo(str1);
		System.out.println("New Result --- > " + result);
		if(result ==0){
			System.out.println("Both strings are same :) ");
		}else{
			System.out.println("String not same --- > :(");
		}

		System.out.println(str.compareTo("manoj Kushwaha"));
		System.out.println(str2.compareToIgnoreCase("manoj not kushwaha"));
		
       // Concat String
		
		System.out.println(str.concat(" New ---- > "+ str2));
		boolean res = str.endsWith("Kushwaha");
		boolean endWith_ = str1.endsWith("kushwaha");
		System.out.println("str value --- > " + str +" -- "+ res);
		System.out.println("str1 value --- > " + str1 +" -- "+ endWith_);*/
	}
}
