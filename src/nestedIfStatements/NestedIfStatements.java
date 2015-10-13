package nestedIfStatements;

public class NestedIfStatements {
	
	public static void main(String[] args) {
		int age = 70;
		
		if(age < 50){
			System.out.println("You are pretty young");
		}else{
			System.out.println("You are pretty old");
			if(age > 75){
				System.out.println("You are really old!");
			}else{
				System.out.println("Don't worry, you aren't really that old!");
			}
		}
		
	}
	
}
