package variableLengthArguments;

public class VariableLengthArguments {
	//Program averages all numbers input
	public static void main(String[] args) {
		//Prints calculated average. average() refers to the method below and the
		//numbers are what to average
		System.out.println(average(6,7,3,267,743,2));		
	}
	//the parameter for this is the type [int], then ... [this means we don't know how many numbers we're
	//putting into the method. The numbers is a random variable name.
	//Note: no void after static, because this method does return a value.
	public static int average(int...numbers){
		//start with total of 0
		int total = 0;
		//enhanced for loop to add all the values up.
		for (int x:numbers){
			total += x;
		}
		//returns average
		return total/numbers.length;
	}
}
