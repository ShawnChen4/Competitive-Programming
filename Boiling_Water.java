import java.io.*;
import java.util.*;

public class Main {
    
    
    public static void main(String[] args) {
        
       
		
		Scanner sc = new Scanner (System.in);
		
		int B = sc.nextInt();
		
		int P = 5 * B - 400;
		
		System.out.println(P);
		
		if (P < 100) {
			System.out.println("1");
		} else if (P > 100) {
			System.out.println("-1");
		} else if (P == 100) {
			System.out.println("0");
		}

    }
}
