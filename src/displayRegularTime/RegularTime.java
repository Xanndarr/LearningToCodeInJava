package displayRegularTime;

public class RegularTime {
	public static void main(String[] args) {
		//Declares timeClassObject to use methods from TimeClass class
		TimeClass timeClassObject = new TimeClass();
		
		//Prints the times before changed
		System.out.println(timeClassObject.toMilitary());
		System.out.println(timeClassObject.toRegular());
		
		//Changes the time
		timeClassObject.setTime(13, 27, 6);
		
		//Prints times after changed
		System.out.println(timeClassObject.toMilitary());
		System.out.println(timeClassObject.toRegular());
	}
}
