package displayRegularTime;

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
	
	//method to convert time into regular format
	public String toRegular(){
		//returns formatted string.
		//"%d:%02d:%02d %s" means that the format is decimal:2d.p. decimal:2d.p. decimal with a string at the end.
		//Then the parameters come next:
		//First one: ((hour == 0 || hour == 12) ?12:hour%12) If the hour value is 0 or 12 then display 12 for hour. If it isn't then display the remainder of the hour divided by 12
		//minute and second are fine as they are
		//the last param is whether to use AM or PM. If the hour is less than 12, then AM is used, else PM is used.
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ?12:hour%12), minute, second, (hour < 12 ? "AM" : "PM"));
	}
	
}
