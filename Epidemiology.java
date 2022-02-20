import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner (System.in);
		
		
		int P = sc.nextInt();
		int N = sc.nextInt();
		int R = sc.nextInt();
		
		
		int infected_people = N;
		int infected_last_day = N;
		int time = 0;
		
		while (infected_people <= P) {
			time = time + 1;
			infected_people += infected_last_day * R;
			infected_last_day *= R;
			
		}
		
		System.out.println(time);

    }
}
