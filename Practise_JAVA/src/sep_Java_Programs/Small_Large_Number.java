package sep_Java_Programs;

public class Small_Large_Number {

	public static void main(String[] args) {
		int n[] = {432,12,5,6,43,32554,67,3};
		int s=n[0];int l=n[0];
		for(int i=0;i<n.length;i++){
				if(s>n[i]){
					s=n[i];
				}if(l<n[i]){
					l=n[i];
				}
			}
			System.out.println(s+"    "+l);
	}
}
