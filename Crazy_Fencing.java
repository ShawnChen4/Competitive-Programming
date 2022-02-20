import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
		
		ArrayList<Integer> length = new ArrayList<Integer>();
		ArrayList<Integer> width = new ArrayList<Integer>();
		
		double area = 0;
		
		int numlength = sc.nextInt();
		
		for (int i = 0; i < numlength + 1; i++) {
			
			length.add(sc.nextInt());
			
		}
		
		for (int i = 0; i < numlength; i++) {
			
			width.add(sc.nextInt());
			
		}
		
		for (int i = 0; i < numlength; i++) {
			area += ((length.get(i) + length.get(i + 1)) * width.get(i)) / 2.0;
		}
		
		System.out.println(area);
        
        

    }
}
