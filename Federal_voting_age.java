import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
		
		ArrayList<String> answer = new ArrayList<String>();
		
		
		
		
		int nums = sc.nextInt();
		
		for (int i = 0; i < nums; i ++) {
			
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			
			//Day to beat is 1989 2 27
			
			if (year < 1989) {
				answer.add("Yes");
				
			} else if (year == 1989) {
				if (month < 2) {
					answer.add("Yes");
				} else if (month == 2) {
					if (day <= 27) {
						answer.add("Yes");
					} else {
						answer.add("No");
					}
				} else {
					answer.add("No");
				}
			} else {
				answer.add("No");
			}
			
		}
		
		for (int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i));
		}
		
        
        

    }
}
