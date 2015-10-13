package eNumeration;

public enum ENums {
	tom("nice", "16"),
	lemon("sour", "15"),
	cake("tasty", "105"),
	jamtart("nom", "24"),
	kellogs("crunchy", "245"),
	ziggy("furry", "8");
	
	private final String desc;
	private final String year;
	
	ENums(String description, String age) {
		desc = description;
		year = age;
	}
	
	public String getDesc(){
		return desc;
	}
	public String getAge(){
		return year;
	}
	
}
