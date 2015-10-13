package introductionToArrays;

public class Arrays {
	public static void main(String[] args) {
		//Integer array that contains 10 values called "integerArray"
		int integerArray[] = new int[10];
		//Computers start arrays at 0. Syntax: integerArray[indexNumber] = Value
		integerArray[0] = 54;
		integerArray[1] = 12;
		integerArray[2] = 456;
		integerArray[3] = 111;
		integerArray[4] = 102;
		integerArray[5] = 752;
		integerArray[6] = 10;
		integerArray[7] = 24;
		integerArray[8] = 22;
		integerArray[9] = 65;
		
		//Outputs value at index 6 of the "integerArray" array, which is 10
		System.out.println(integerArray[6]);
		
		//Array initialiser:
		//Does the same thing as before, but with less code.
		int integerArray2[] = {2,4,5,7,9};
		//Use in same way as before:
		System.out.println(integerArray2[4]);
		
	}
}
