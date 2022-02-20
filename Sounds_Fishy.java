import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
		
		int depth1 = sc.nextInt();
		int depth2 = sc.nextInt();
		int depth3 = sc.nextInt();
		int depth4 = sc.nextInt();
		
		if (depth4 > depth3 && depth3 > depth2 && depth2 > depth1) {
			System.out.println("Fish Rising");
		} else if (depth1 == depth2 && depth2 == depth3 && depth3 == depth4 && depth4 == depth1) {
			System.out.println("Fish At Constant Depth");
			
		} else if (depth4 < depth3 && depth3 < depth2 && depth2 < depth1) {
			System.out.println("Fish Diving");
		} else {
			System.out.println("No Fish");
		}
        
        

    }
}
