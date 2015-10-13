package gettingUsersInput;

//Imports the commands needed for this scanner
import java.util.Scanner;

public class UsingScannersForUserInput {
	public static void main(String[] args) {
		//This declares "randomVariable" as a Scanner which stores what the user enters
		Scanner randomVariable = new Scanner(System.in);
		//Prints the contents of the scanner, "randomVariable" after the user has input something
		System.out.println(randomVariable.nextLine());
	}
}
