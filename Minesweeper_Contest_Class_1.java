import java.util.Scanner;
public class Minesweeper_Contest_Class_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initializing Scanner and Declaring User Input Variables; "n" and "m"
		
		Scanner userInput = new Scanner (System.in);
		int numMinefield = 0;
		int n = userInput.nextInt();
		int m = userInput.nextInt();
		
		
		//While loop to repeat this process over and over again
		while (userInput.hasNext()) {
			//In Java, the hasNext() method only returns true if there is another token in its input, which is perfect for taking multiple inputs on the same line, or separately
			numMinefield++;
			userInput.nextLine();
			
			char[][] charVar = new char [n][m];
			//Declaring a new 2-D Array to store multiple values in a single variable; more notably "n" and "m"
			
			String stringVar = null;
			//Declaring an empty String variable
			
			for (int i = 0; i < n; i++) {
				stringVar = userInput.nextLine();
				charVar[i] = stringVar.toCharArray();
				
			}
			
			int arr[][] = new int [n][m];
			int[][] numCollection = {{1, 0}, {0, 1}, {1, 1}, {1, -1}, {-1, 0}, {0, -1}, {-1, -1}, {-1, 1}};
			int x = 0;
			int y = 0;
			
			//Nested For loop to cycle through numbers, and determine the exact amount of mines relative to each square's location
			
			for (int i =0; i < charVar.length; i++) {
				for (int j = 0; j < charVar[i].length; j++) {
					
					
					if (charVar[i][j] == '*') {
						arr[i][j] =-10000;
						for (int k = 0; k < numCollection.length; k++) {
							x = i + numCollection[k][0];
							y = j + numCollection[k][1];
							
							if (x >= 0 && x < n & y >=0 && y < m) {
								arr[x][y]++;
								
							}
						}
						
					}
				}
				
			}
			
			//Printing the amount based on the results and calculations within the nested for loop
			
			//Formatting the output using printF is equal to other ways of Java formatting. %d specifies that the specific variable is an integer (rather the field #) plus a new line (\n)
			System.out.printf("Field# %d:\n", numMinefield);
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if(arr[i][j]<0) {
						System.out.print('*');
					}
					else if(arr[i][j]==0) {
						System.out.print('0');
					}
					else {
						System.out.print(arr[i][j]);
					}
								
				}
				//This helps print the final result in the specific formatting order entered by the user in the beginning
				
				System.out.println();
			}
		}
	}
}
