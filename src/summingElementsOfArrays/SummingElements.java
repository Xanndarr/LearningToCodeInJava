package summingElementsOfArrays;

public class SummingElements {
	public static void main(String[] args) {
		//Program adds all values of an array together
		int anArray[] = {1,3,6,2,5};
		int total = 0;
		
		for (int counter = 0; counter < anArray.length; counter++) total += anArray[counter];
		System.out.println(total);
	}
}
