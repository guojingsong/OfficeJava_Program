package practise_package;
public class PerfactNumber {

	public static void main(String[] args) {
	int sum=0,n=14;
		for(int i=1;i<n;i++)
		{
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println(n + " perface number");
		}else
		{
			System.out.println(n+ " not ");
		}
	}
}
