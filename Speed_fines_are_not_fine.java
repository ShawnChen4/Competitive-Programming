import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        		Scanner sc = new Scanner (System.in);
		
		int speedLimit = sc.nextInt();
		int carSpeed = sc.nextInt();
		
		if (carSpeed <= speedLimit) {
			System.out.println("Congratulations, you are within the speed limit!");
		} else {
			
			int diff = carSpeed - speedLimit;
			
			if (diff <= 20 && diff >= 1) {
				
				System.out.println("You are speeding and your fine is $100.");
				
			} else if (21 <= diff && diff <= 30 ) {
				
				System.out.println("You are speeding and your fine is $270.");

				
			} else if (diff >= 31) {
				System.out.println("You are speeding and your fine is $500.");

			}
			
			
		}
		

    }
}
