package timeClass;

public class TellingTheTime {
	//main class to tell the time
	public static void main(String[] args) {
		//this creates an object for the "TimeClass" class
		TimeClass timeClassObject = new TimeClass();
		//Prints military time, before values are set
		System.out.println(timeClassObject.toMilitary());
		//calls the set time method in the TimeClass using the parameters (hours, minutes, seconds)
		timeClassObject.setTime(13, 27, 6);
		//Prints the new time
		System.out.println(timeClassObject.toMilitary());
	}
}
