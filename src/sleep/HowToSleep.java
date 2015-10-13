package sleep;

public class HowToSleep {
	public static void main(String[] args) {
		
		for (int counter = 0; counter <= 9; counter++){
			System.out.println(counter + 1);
			//All needed for proper sleep
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException Ie) {
				System.out.println("Exception Occurred");
			}
			//
			
		}
		
	}
}
