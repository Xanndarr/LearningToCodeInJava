package enhancedForLoops;

public class EnhancedLoops {
	public static void main(String[] args) {
		//Program adds the contents of the array using an "Enhanced For Loop"
		int anArray[] = {1,5,3,8,9};
		int total = 0;
		
		//In param one, "int" is the type and "x" is the identifier.
		//Enhanced for loops only take two arguments: the type of data then x and the name of the array
		
		for(int x: anArray)total += x;		
		System.out.println(total);
		
	}
}
