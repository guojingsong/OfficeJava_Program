package sep_Java_Programs;

public class Large_Small_number {

	public static void main(String[] args) {
		int n[] = {2,43,65,324,587,943,24};
		int s=n[0];int l=n[0];
		for(int i=0;i<n.length;i++){
			if(s>n[i]){
				s=n[i];
			}
			if(l<n[i]){
				l=n[i];
			}
		}
		System.out.println(s+"    "+ l);

	}

}
