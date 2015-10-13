package constructors;

public class ClassTwo {
	private String girlName;
	
	public ClassTwo(String Name){
		girlName = Name;
	}
	
	public String getName(){
		return girlName;
	}
	
	public void finalOutput(){
		System.out.printf("The girls name was %s\n", getName());
	}
}
