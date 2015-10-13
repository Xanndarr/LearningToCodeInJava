package manyMethodsAndInstances;

import java.util.Scanner;

public class IndexClass {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		SecondClass secondClassObject = new SecondClass();
		
		System.out.println("Please input girl's name: ");
		String tempVariable = userInput.nextLine();
		
		secondClassObject.setName(tempVariable);
		secondClassObject.finalOutput();
	}
	
}
