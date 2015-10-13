package toStringAndComposition;

public class MainClassToString {
	private int day, month, year;
	//Constructor....This will run as soon as the class is called. Takes three params, d,m,y
	public MainClassToString(int d, int m,int y){
		//Changes variables day, month and year to the values that the user put on the mainObj in initial class
		day = d;
		month = m;
		year = y;
		//Every time this constructor is created, this is output.
		//However, instead of entering a string variable, we allowed the parameter to output "this"
		//"this" asks Java for a String representation of this class. Java always looks to the Public String toString()
		//class when it is called.
		System.out.printf("The constructor for this is %s\n", this);
	}
	//This says, that any time you need a string representation of this object, then this is what is returned.
	public String toString(){
		//Simple return of a string with three decimal values, with params day, month, year etc.
		return String.format("%d/%d/%d", day, month, year);
	}
}
