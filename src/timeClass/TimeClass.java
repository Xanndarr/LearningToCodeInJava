package timeClass;

public class TimeClass {
	//declares private variables for hour minute and second
	private int hour, minute, second;
	//method to set the time.
	public void setTime(int h, int m, int s){
		//if the number entered for hour is <24 and >0, then that number is used. Else, 0 is used
		hour = ((h>=0 && h<24)? h : 0);
		//if the number entered for minutes is <60 and >0, then that number is used. Else, 0 is used
		minute = ((m>=0 && m<60)? m : 0);
		//if the number entered for seconds is <60 and >0, then that number is used. Else, 0 is used
		second = ((s>=0 && s<60)? s : 0);
	}
	
	//method to convert the time into military format.
	public String toMilitary(){
		//returns value of a formatted string. The string is formatted to:
		//					 "hour[2d.p.]:minute[2d.p.]:second[2d.p.]"
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
}
