package multipleConstructors;

public class MainClass {
	public static void main(String[] args) {
		MultipleConstructors noArgs = new MultipleConstructors();
		MultipleConstructors oneArg = new MultipleConstructors(5);
		MultipleConstructors twoArgs = new MultipleConstructors(5, 13);
		MultipleConstructors threeArgs = new MultipleConstructors(5, 13, 43);
		
		System.out.printf("%s\n", noArgs.toMilitaryTime());
		System.out.printf("%s\n", oneArg.toMilitaryTime());
		System.out.printf("%s\n", twoArgs.toMilitaryTime());
		System.out.printf("%s\n", threeArgs.toMilitaryTime());
		//*********************************************************************************************
		System.out.println();
		//Just a display for my more efficient version
		MultipleConstructorsMoreEfficient noArgs2 = new MultipleConstructorsMoreEfficient();
		MultipleConstructorsMoreEfficient oneArg2 = new MultipleConstructorsMoreEfficient(5);
		MultipleConstructorsMoreEfficient twoArgs2 = new MultipleConstructorsMoreEfficient(5, 13);
		MultipleConstructorsMoreEfficient threeArgs2 = new MultipleConstructorsMoreEfficient(5, 13, 43);
		
		System.out.printf("%s\n", noArgs2.toMilitaryTime());
		System.out.printf("%s\n", oneArg2.toMilitaryTime());
		System.out.printf("%s\n", twoArgs2.toMilitaryTime());
		System.out.printf("%s\n", threeArgs2.toMilitaryTime());
		
	}
}
