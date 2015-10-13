package elseIfStatements;

public class ElseIf {	
	public static void main(String[] args) {		
		int age = 55;
		
		if (age >= 60){
			System.out.println("You are a senior citizen");
		}else if (age >= 50) {
			System.out.println("You are in your 50s");
		}else{
			System.out.println("You are a youngen'");
		}
	}	
}
