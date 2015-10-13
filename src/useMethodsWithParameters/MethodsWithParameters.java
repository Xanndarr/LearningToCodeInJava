package useMethodsWithParameters;

import java.util.Scanner;

public class MethodsWithParameters {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		SecondClass secondClassObject = new SecondClass();
		
		System.out.println("Input your name: ");
		String test = userInput.nextLine();
		//You don't need to use the same variable as in parameters in SecondClass!
		secondClassObject.simpleMessage(test);
	}
	
}
