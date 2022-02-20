import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        		ArrayList<Integer> apple = new ArrayList<Integer>();
		ArrayList<Integer> banana = new ArrayList<Integer>();

		Scanner sc = new Scanner (System.in);
		
		
		for (int i = 0; i < 3; i++) {
			apple.add(sc.nextInt());
		}
		
		
		for (int i = 0; i < 3; i++) {
			banana.add(sc.nextInt());
		}
		
		
		int appleOne = apple.get(0);
		int appleTwo = apple.get(1);
		int appleThree = apple.get(2);
		
		int bananaOne = banana.get(0);
		int bananaTwo = banana.get(1);
		int bananaThree = banana.get(2);
		
		
		int appleScore = appleOne * 3 + appleTwo * 2 + appleThree * 1;
		int bananaScore = bananaOne * 3 + bananaTwo * 2 + bananaThree * 1;
		
		
		
		
		if (appleScore > bananaScore) {
			System.out.println("A");
		} else if (bananaScore > appleScore) {
			System.out.println("B");
		} else{
			System.out.println("T");
		}
        

    }
}
