package inheritance;

import java.util.Scanner;

public class SuperClass {
	//
	static private int int1 = 0;
	static private String string1 = null;
	static private Double double1 = 0.0;
	//
	public int getInt(){
		return int1;
	}	
	public String getString(){
		return string1;
	}	
	public Double getDouble(){
		return double1;
	}
	//
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please input an integer: ");
		int1 = userInput.nextInt();
		
		System.out.println("Please input a string: ");
		string1 = userInput.nextLine();
		
		System.out.println("Please input a double: ");
		double1 = userInput.nextDouble();
		
		SubClass.outputs();
	}
}
