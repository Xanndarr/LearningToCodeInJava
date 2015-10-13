package switchStatements;

public class SwitchStatements {
	public static void main(String[] args) {
		int age;
		age = 3;
		//Switch statements act as If statements, but with less code.
		switch (age) {
		case 1:
			System.out.println("You can crawl");
			break;
		case 2:
			System.out.println("You can talk");
			break;
		case 3:
			System.out.println("You can eat solid foods on your own!");
			break;
		default:
			System.out.println("I do not know your age");
			break;
		}
	}
}
