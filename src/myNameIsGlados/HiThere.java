package myNameIsGlados;

import java.util.Scanner;

public class HiThere {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hi there, my name is gLaDoS. Whats your name?: ");
		String name = userInput.nextLine();
		System.out.println("Hello there " + name);
		System.out.println("And how old are you, " + name + "?");
		int age = userInput.nextInt();
		age = age * 4;
		System.out.println("NO WAY!");
		System.out.println("I'm exactly 4 times older than you! I'm " + age + "!");
		System.out.println("Hey, do you wanna do some maths?");
		//Not working past here!
		String response = userInput.nextLine();
		if (response.equals("y") || response.equals("yes")) {
			System.out.println("THis is yes");
		}else if (response.equals("n") || response.equals("no")) {
			System.out.println("OK then, i'll see you later!");
			System.exit(0);
		}
	}
}
