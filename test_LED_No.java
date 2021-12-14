//Shawn Chen HW #5: LCD Display (Programming By Contract)
import java.util.*;
import java.lang.*;


public class test_LED_No {
	
	static int nLines = 0;
	static int nColumns = 0;
	
	static char[][] lcdNumber = new char [23][12];
	static char[][][] lcdNumbers = new char [8][23][12];
	
	public static void setLcdsize(int size) {
		nLines = size * 2 + 3;
		nColumns = size + 2;
		
	}
	
	public static void clearLcd() {
		for (int i = 0; i < nLines; i++) {
			for (int j = 0; j < nColumns; j++) {
				lcdNumber[i][j] = ' ';
				
				
			}
		}
	}
	
	public static void drawLine(int lineNumber) {
		for (int j = 1; j < nColumns - 1; j++) {
			lcdNumber[lineNumber][j] = '-';
			
		}
	}
	
	public static void drawFirstLine() {
		drawLine(0);
	}
	
	public static void drawMiddleLine() {
		drawLine(nLines / 2);
	}
	
	public static void drawLastLine() {
		drawLine(nLines - 1);
		
	}
	
	public static void drawFirstColumn(int columnNumber) {
		for (int i = 1; i < nLines/2; i++) {
			lcdNumber[i][columnNumber] = '|';
		}
	}
	
	public static void drawLastColumn (int columnNumber) {
		for (int i = (nLines/2) + 1; i < nLines-1; i++) {
			lcdNumber[i][columnNumber] = '|';
		}
	}
	
	public static void drawFirstLeftColumn() {
		drawFirstColumn(0);
	}
	
	public static void drawLastLeftColumn() {
		drawLastColumn(0);
	}
	
	public static void drawFirstRightColumn() {
		drawFirstColumn(nColumns -1);
	}
	
	public static void drawLastRightColumn() {
		drawLastColumn(nColumns - 1);
	}
	
	public static void printLcd(int position) {
		for (int i = 0; i < nLines; i++) {
			for (int j = 0; j < nColumns; j++) {
				lcdNumbers[position][i][j] = lcdNumber[i][j];
				
			}
		}
	}
	
	
	public static void printZero(int position) {
		clearLcd();
		drawFirstLine();
		drawFirstLeftColumn();
		drawFirstRightColumn();
		drawLastLeftColumn();
		drawLastRightColumn();
		drawLastLine();
		printLcd(position);
		
	}
	
	public static void printOne(int position) {
		clearLcd();
		drawFirstRightColumn();
		drawLastRightColumn();
		printLcd(position);
		
	}
	
	public static void printTwo(int position) {
		clearLcd();
		drawFirstLine();
		drawFirstRightColumn();
		drawMiddleLine();
		drawLastLeftColumn();
		drawLastLine();
		printLcd(position);
	}
	
	
	public static void printThree(int position) {
		clearLcd();
		drawFirstLine();
		drawFirstRightColumn();
		drawMiddleLine();
		drawLastRightColumn();
		drawLastLine();
		printLcd(position);
		
	}
	
	public static void printFour(int position) {
		clearLcd();
		drawFirstLeftColumn();
		drawFirstRightColumn();
		drawMiddleLine();
		drawLastRightColumn();
		printLcd(position);
		
	}
	
	public static void printFive (int position) {
		clearLcd();
		drawFirstLine();
		drawFirstLeftColumn();
		drawMiddleLine();
		drawLastRightColumn();
		drawLastLine();
		printLcd(position);
	}
	
	public static void printSix(int position) {
		clearLcd();
		drawFirstLine();
		drawFirstLeftColumn();
		drawMiddleLine();
		drawLastLeftColumn();
		drawLastRightColumn();
		drawLastLine();
		printLcd(position);
		
	}
	
	public static void printSeven(int position) {
		clearLcd();
		drawFirstLine();
		drawFirstRightColumn();
		drawLastRightColumn();
		printLcd(position);
	}
	
	public static void printEight(int position) {
		clearLcd();
		drawFirstLine();
		drawFirstLeftColumn();
		drawFirstRightColumn();
		drawMiddleLine();
		drawLastLeftColumn();
		drawLastRightColumn();
		drawLastLine();
		printLcd(position);
	}
	
	public static void printNine(int position) {
		clearLcd();
		drawFirstLine();
		drawFirstLeftColumn();
		drawFirstRightColumn();
		drawMiddleLine();
		drawLastRightColumn();
		drawLastLine();
		printLcd(position);
	}
	

	public static void printNumber(int n, int position) {
		
		if (n == 0) {
			printZero(position);
		} else if (n == 1) {
			printOne(position);
		} else if (n == 2) {
			printTwo(position);
		} else if (n == 3) {
			printThree(position);
			
		} else if (n == 4) {
			printFour(position);
		} else if (n == 5) {
			printFive(position);
			
		} else if (n == 6) {
			printSix(position);
		} else if (n == 7) {
			printSeven(position);
		} else if (n == 8) {
			printEight(position);
		} else if (n == 9) {
			printNine(position);
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 0;
		
		ArrayList<Character> nums = new ArrayList<Character>();
		Scanner sc = new Scanner (System.in);
		size = sc.nextInt();	
		int num = sc.nextInt();
		
				
		while (size != 0 || num !=0 ) {
			String s = String.valueOf(num);

			char k = ' ';

			
			setLcdsize(size);
			int length = s.length();
			
			for (int i = 0; i < length; i++) {
				k = s.charAt(i);
				nums.add(k);
				
				
			}
			
			
			
			
			for (int position = 0; position < nums.size(); position++) {
				int n = nums.get(position) - '0';
				
				printNumber(n, position);
				
			}
			
			
			
			for (int i = 0; i < nLines; i++) {
				for (int n = 0; n < length; n++) {
					for (int j = 0; j < nColumns; j++) {
						System.out.printf("%c", lcdNumbers[n][i][j]);
					}
					if (n < length - 1) {
						System.out.printf(" ");
						
						
						
					}
					
				}
				System.out.printf("\n");

			}
			System.out.printf("\n");
			nums.clear();
			size = sc.nextInt();
			num = sc.nextInt(); 
			
		}

	}


}
