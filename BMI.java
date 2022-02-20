import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);
		
		double weight = sc.nextDouble();
		double height = sc.nextDouble();
		
		double BMI = (weight) / (height * height);
		
		if (BMI > 25) {
			System.out.println("Overweight");
		} else if (BMI < 18.5) {
			System.out.println("Underweight");
		} else {
			System.out.println("Normal weight");
		}
		

    }
}
