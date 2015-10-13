package eNumeration;

import java.util.EnumSet;

public class MainClass {
	public static void main(String[] args) {
		for(ENums people: ENums.values())
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getAge() );
		
		System.out.println("\nAnd now for the range of constants:\n");
		
		for(ENums people: EnumSet.range(ENums.lemon, ENums.kellogs))
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getAge());
	}	
}
