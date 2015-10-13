package toStringAndComposition;

public class InitialClass {
	public static void main(String[] args) {
		//Simple object created called mainObj that calls the constructor MainClassToString in the
		//MainClassToString class.
		MainClassToString mainObj = new MainClassToString(01, 12, 2012);
		//Object created that calls the main constructor from Composition class
		Composition compObj = new Composition("Tom", mainObj);
		//Prints the result of the compObj object
		System.out.println(compObj);
	}
}
