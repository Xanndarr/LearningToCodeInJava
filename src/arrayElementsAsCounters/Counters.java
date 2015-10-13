package arrayElementsAsCounters;

import java.util.Random;

public class Counters {
	public static void main(String[] args) {
		//Program stores how many times each number has been thrown on a virtual dice
		Random ranNumObj = new Random();
		//Need seven index values in array, because computer starts at 0, but need 1 through 6 as well
		//for the dice.
		int freqArray[] = new int[7];
		
		for(int roll = 1; roll < 1000; roll++){
			//++freqArray is a pre-incrementer and adds 1 to the index where that number was rolled.
			//I.e. If 3 is rolled in the [1 + ranNumObj.nextInt(6)] then the index 3 of the array will
			//have 1 added to it.
			//ranNumObj.nextInt(6) normally gives values 0-5, but we add 1 before, giving 1-6
			++freqArray[1 + ranNumObj.nextInt(6)];
		}
		
		//Outputs a table showing how many times each number has been rolled
		System.out.println("Number\tFrequency");		
		for (int numberRolled = 1; numberRolled < freqArray.length; numberRolled++){
			System.out.println(numberRolled + "\t" + freqArray[numberRolled]);
		}
		
	}
}
