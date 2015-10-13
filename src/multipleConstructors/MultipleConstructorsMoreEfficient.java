package multipleConstructors;

public class MultipleConstructorsMoreEfficient {
	private int hour, minute, second;
	
	public MultipleConstructorsMoreEfficient(){this(0,0,0);}
	public MultipleConstructorsMoreEfficient(int h){this(h,0,0);}
	public MultipleConstructorsMoreEfficient(int h, int m){this(h,m,0);}
	public MultipleConstructorsMoreEfficient(int h, int m, int s){setTime(h,m,s);}
	
	public void setTime(int h, int m, int s){
		hour = ((h>=0 && h<24) ?h : 0);
		minute = ((m>=0 && m<60) ?m : 0);
		second = ((s>=0 && s<60) ?s : 0);
	}
	
	public String toMilitaryTime(){return String.format("%02d:%02d:%02d", hour, minute, second);}
}
