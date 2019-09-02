package practise_package;

public class SwapString {

	public static void main(String[] args) {
		String s1="manoj";
		String s2="sarita";
        
		s1 =s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println(s1+" "+s2);
		
	    String a = "Manoj";  
        String b = "You";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
	}
}
