package randomNumberGenerator;
//import for random number generators.
import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random dice = new Random();
		int number;
		
		for(int counter = 1; counter <= 10; counter++){
			//This makes the number equal to a random number from 0-5. Then it adds one to this value.
			//This simulates a dice's possibilities. I.e. you can have 0 on a dice, but we need 6 instead.
			//So adding one to all of them solves this problem.
			number = dice.nextInt(6) + 1;
			System.out.println(number);
		}
		
	}
}
