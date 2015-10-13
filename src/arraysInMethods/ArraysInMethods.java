package arraysInMethods;

public class ArraysInMethods {
	public static void main(String[] args) {
		//Simple Array
		int anArray[] = {3,4,5,6,7};
		//Call method, changeArray, using th above array as the argument
		changeArray(anArray);
		
		//Enhanced For Loop to output changed array
		for (int y:anArray){
			System.out.println(y); 
		}
	}
	//public gives other files access to this method
	//void means it doesn't return a value
	//changeArray(int x[]): changeArray is the name of the method. int shows us which type of data is
	//in the array we want to change. x is a random name for the variable used. we use [] after the x
	//because we are using an array
	public static void changeArray(int x[]){
		//this for loop just takes every value in the arrya we want to change and adds five to it.
		for (int counter = 0; counter < x.length; counter++){
			x[counter] += 5;
		}
	}
}
