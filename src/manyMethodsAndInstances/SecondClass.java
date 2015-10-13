package manyMethodsAndInstances;

public class SecondClass {
	private String girlName;
	
	public void setName(String Name){
		girlName = Name;
	}
	
	public String getName(){
		return girlName;
	}
	
	public void finalOutput(){
		System.out.printf("The girls name was %s", getName());
	}
}
