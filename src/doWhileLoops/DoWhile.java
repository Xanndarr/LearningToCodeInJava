package doWhileLoops;

public class DoWhile {
	public static void main(String[] args) {
		int counter = 0;
		
		//Executes "do" first, then checks for condition to meet "while"
		do{
			System.out.println(counter);
			counter++;
		}while(counter <= 10);
	}
}
