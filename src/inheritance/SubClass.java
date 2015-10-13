package inheritance;

public class SubClass{
	
	public static void outputs() {
		//
		SuperClass getVariable = new SuperClass();
		//
		int int2 = getVariable.getInt();
		String string2 = getVariable.getString();
		Double double2 = getVariable.getDouble();
		//
		System.out.println(int2 + ", " + string2 + ", " + double2 + "!");
		//
	}	
	
}
