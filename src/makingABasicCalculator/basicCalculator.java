package makingABasicCalculator;

//Imports commands needed for Scanners
import java.util.Scanner;

public class basicCalculator { 
	public static void main(String[] args) {
		//Declares a new scanner for taking user input
		Scanner input = new Scanner(System.in);
		//Declares three new variables for holding numbers in our calculator 
		double num1, num2, ans;
		//Prints out text
		System.out.println("Please input your first number: ");
		//Takes the user input and stores it in the variable, "num1"
		num1 = input.nextDouble();
		//Prints out text
		System.out.println("Please input your second number: ");
		//Takes the user input and stores it in the variable, "num2"
		num2 = input.nextDouble();
		//Calculates the answer to num1 + num2
		ans = num1 + num2;
		//Prints the answer
		System.out.println(ans);
	}

}
