package personalPractice;

import java.util.Random;

public class RandomNumberGenerator {
	public static void main(String[] args) {
		Random rand=new Random(6);
		for(int i=0;i<37;i++)
			System.out.println(rand.nextInt(45));
	}
}