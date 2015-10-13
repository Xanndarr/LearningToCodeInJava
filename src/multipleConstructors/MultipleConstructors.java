package multipleConstructors;

public class MultipleConstructors {
	private int hour;
	private int minute;
	private int second;
	//**************************************************************************************************
	//Constructor with the same name as  the class file
	//Takes no arguments
	//Note: the computer runs this first
	public MultipleConstructors(){
		//uses these numbers as defaults for time. However, we have 3 0's so, we have to make more
		//constructors just in case the user enters 3 variables/parameters.
		this(0,0,0);
	}
	//Takes the 1 argument, hour as an integer
	public MultipleConstructors(int h){
		//makes the program store the users value as h, but forces the m and s args which aren't here to be 0
		this(h,0,0);
	}
	//Takes 2 arguments, hour as an integer and minute as an integer
	public MultipleConstructors(int h, int m){
		//makes program use "this" h and m val for variables h and m
		this(h,m,0);
	}
	//Same purpose as others, but with all three vals.
	public MultipleConstructors(int h, int m, int s){
		setTime(h,m,s);
	}
	//**************************************************************************************************
	//method to set the time
	public void setTime(int h, int m, int s){
		//calls more methods that set the hour, minute and second. This is not really necessary and the
		//contents of the setH,M,S methods can be compiled into the setTime method
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	//simply makes sure the hour val is valid
	public void setHour(int h){
		hour = ((h>=0 && h<24) ?h : 0);
	}
	//makes sure the minute val is valid
	public void setMinute(int m){
		minute = ((m>=0 && m<60) ?m : 0);
	}
	//makes sure the second val is valid
	public void setSecond(int s){
		second = ((s>=0 && s<60) ?s : 0);
	}
	//**************************************************************************************************
	//because the variables hour, minute and second are private, the MainClass needs some way of reading
	//them. However, the variables are still private so the MainClass cannot edit them.
	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public int getSecond(){
		return second;
	}
	//**************************************************************************************************
	//Method to format the time in military style
	public String toMilitaryTime(){
		//returns a string in the format of 2digits:2digits:2digits with the parameters of hour, minute
		//and second. However, the get methods may not be needed and the variables hour, minute and
		//second could be used themselves.
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
}
