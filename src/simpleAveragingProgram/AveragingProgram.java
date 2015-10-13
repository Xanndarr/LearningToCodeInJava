package simpleAveragingProgram;

import java.util.Scanner;

public class AveragingProgram {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int total = 0, counter = 0;
		int mark, average;
		
		while (counter < 10){
			mark = userInput.nextInt();
			total = total + mark;
			counter++;
		}
		
		average = total / 10;
		System.out.println("Your average is " + average);
	}
}
