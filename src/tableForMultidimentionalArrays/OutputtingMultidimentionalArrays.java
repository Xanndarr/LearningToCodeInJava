package tableForMultidimentionalArrays;

public class OutputtingMultidimentionalArrays {
	public static void main(String[] args) {
		//Creates two multidimentional arrays
		int firstArray[][] ={{1,2,3},{4,5,6}};
		int secondArray[][] = {{11,12,13},{14},{15,16,17}};
		//Calls the display method to display values in the arrays
		System.out.println("This is the first array: ");
		display(firstArray);
		System.out.println("This is the second array: ");
		display(secondArray);
	}
	//same as before when printing one dim array, but this time, we need two "[]"
	public static void display(int x[][]){
		//first for goes down one row every execution
		for(int row = 0; row < x.length; row++){
			//second for goes one along one each column and prints the value at that index with a tab
			for(int column = 0; column < x[row].length; column++){
				//Here we use print so all the values for one row are on the same line like a table
				System.out.print(x[row][column] + "\t");
			}
			//still in the first for: Just puts the next row down a line
			System.out.println();
		}
	}
}
