import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
		
		ArrayList<Integer> treats = new ArrayList<Integer>();
		
		for (int i = 0; i < 3; i++) {
			
			treats.add(sc.nextInt());
			
		}
		
		
		
		int sum = (treats.get(0)) + (2 * treats.get(1)) + (3 * treats.get(2));
		
		if (sum >= 10) {
			System.out.println("happy");
		} else {
			System.out.println("sad");
			
		}
    }
}
