package toStringAndComposition;

public class Composition {
	//String named name
	private String name;
	//Object called birthday that refers to the main constructor in the MainClassToString class
	private MainClassToString birthday;
	//Main Constructor for Composition class. It takes a string variable argument and an object argument
	//that references the constructor in the MainClassToString class
	public Composition(String theName, MainClassToString theBirthday){
		name = theName;
		birthday = theBirthday;
	}
	//ToString used again whenever we need a string representation of this class.
	public String toString(){
		//Two strings, name and birthday. However, birthday is a reference to the constructor in the
		//MainClassToString class. So, this jumps back to the private var birthday which then goes back to
		//the MainClassToString class which then returns the string representation of that class.
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}
}
