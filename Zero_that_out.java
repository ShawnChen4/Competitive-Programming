import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
		
		int nums = sc.nextInt();
		
		ArrayList<Integer> boss = new ArrayList<Integer>();
		
		for (int i = 0; i < nums; i++) {
			
			int input = sc.nextInt();
			if (input == 0) {
				boss.remove(boss.size() - 1);
			} else {
				boss.add(input);
			}
			
			
		}
		
		int sum = 0;
		
		for (int i = 0; i < boss.size(); i++) {
			
			sum += boss.get(i);
			
		}
		
		System.out.println(sum);
		
		
	
        
        

    }
}
