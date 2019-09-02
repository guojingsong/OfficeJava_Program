package practise_package;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random r=new Random();
		int ran = r.nextInt(190);
		System.out.println(ran);
	}

}
