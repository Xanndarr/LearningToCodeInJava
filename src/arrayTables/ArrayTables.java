package arrayTables;

public class ArrayTables {
	public static void main(String[] args) {
		//Program outputs all the values in an array sequentially
		System.out.println("Index\tValue");
		int anArray[] = {1,3,7,3,67};
		
		for (int counter = 0; counter < anArray.length; counter++){
			System.out.println(counter + "\t" + anArray[counter]);
		}
		
	}
}
