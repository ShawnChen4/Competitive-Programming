/* CCC 2007 J3
https://dmoj.ca/problem/ccc07j3
*/

import java.util.*;

public class Deal_or_no_deal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner (System.in);
		
		int numcases = sc.nextInt();
			
		ArrayList<Integer> briefcases = new ArrayList<Integer>();
		briefcases.add(0);
		briefcases.add(100);
		briefcases.add(500);
		briefcases.add(1000);
		briefcases.add(5000);
		briefcases.add(10000);
		briefcases.add(25000);
		briefcases.add(50000);
		briefcases.add(100000);
		briefcases.add(500000);
		briefcases.add(1000000);
		
		
		
			if (numcases == 1) {
				int case1 = sc.nextInt();
				int bankersoffer = sc.nextInt();
				sc.close();
				
				String finalAnswer = " ";
				
				
				int sumOfAllCases = 1691600;
				
				int sumOfOpenedCases = briefcases.get(case1);
				
				
				int sumOfUnopenedCases = sumOfAllCases - sumOfOpenedCases;
				
				int averageofUnopenedCases = sumOfUnopenedCases / (10 - numcases);
				
				
				if (averageofUnopenedCases < bankersoffer) {
					finalAnswer = "Deal";
					
				} else {
					finalAnswer = "No Deal";
					
				}
				
				System.out.println(finalAnswer);
				
				
				
				
				
			} else if (numcases == 2) {
				int case1 = sc.nextInt();
				int case2 = sc.nextInt();
				

				int bankersoffer = sc.nextInt();
				sc.close();
				
				String finalAnswer = " ";
				
				
				int sumOfAllCases = 1691600;
				
				int sumOfOpenedCases = briefcases.get(case1) + briefcases.get(case2);
				
				
				int sumOfUnopenedCases = sumOfAllCases - sumOfOpenedCases;
				
				int averageofUnopenedCases = sumOfUnopenedCases / (10 - numcases);
				
				
				if (averageofUnopenedCases < bankersoffer) {
					finalAnswer = "Deal";
					
				} else {
					finalAnswer = "No Deal";
					
				}
				
				System.out.println(finalAnswer);

				
				
			} else if (numcases == 3) {
				int case1 = sc.nextInt();
				int case2 = sc.nextInt();
				int case3 = sc.nextInt();
				
			
				

				int bankersoffer = sc.nextInt();
				sc.close();
				
				String finalAnswer = " ";
				
				
				int sumOfAllCases = 1691600;
				
				int sumOfOpenedCases = briefcases.get(case1) + briefcases.get(case2) + briefcases.get(case3);
				
				
				int sumOfUnopenedCases = sumOfAllCases - sumOfOpenedCases;
				
				int averageofUnopenedCases = sumOfUnopenedCases / (10 - numcases);
				
				
				if (averageofUnopenedCases < bankersoffer) {
					finalAnswer = "Deal";
					
				} else {
					finalAnswer = "No Deal";
					
				} 
				
				System.out.println(finalAnswer);

				
			} else if (numcases == 4) {
				int case1 = sc.nextInt();
				int case2 = sc.nextInt();
				int case3 = sc.nextInt();
				int case4 = sc.nextInt();
				

				
				int bankersoffer = sc.nextInt();
				sc.close();
				
				String finalAnswer = " ";
				
				
				int sumOfAllCases = 1691600;
				
				int sumOfOpenedCases = briefcases.get(case1) + briefcases.get(case2) + briefcases.get(case3) + briefcases.get(case4);
				
				
				int sumOfUnopenedCases = sumOfAllCases - sumOfOpenedCases;
				
				int averageofUnopenedCases = sumOfUnopenedCases / (10 - numcases);
				
				
				if (averageofUnopenedCases < bankersoffer) {
					finalAnswer = "Deal";
					
				} else {
					finalAnswer = "No Deal";
					
					
				}
				
				System.out.println(finalAnswer);

				
			} else if (numcases == 5) {
				int case1 = sc.nextInt();
				int case2 = sc.nextInt();
				int case3 = sc.nextInt();
				int case4 = sc.nextInt();
				int case5 = sc.nextInt();
				
			
				int bankersoffer = sc.nextInt();
				sc.close();
				
				String finalAnswer = " ";
				
				
				int sumOfAllCases = 1691600;
				
				int sumOfOpenedCases = briefcases.get(case1) + briefcases.get(case2) + briefcases.get(case3) + briefcases.get(case4) + briefcases.get(case5);
				
				
				int sumOfUnopenedCases = sumOfAllCases - sumOfOpenedCases;
				
				int averageofUnopenedCases = sumOfUnopenedCases / (10 - numcases);
				
				
				if (averageofUnopenedCases < bankersoffer) {
					finalAnswer = "Deal";
					
				} else {
					finalAnswer = "No Deal";
					
				}
				
				System.out.println(finalAnswer);

				
			} else if (numcases == 6) {
				
				int case1 = sc.nextInt();
				int case2 = sc.nextInt();
				int case3 = sc.nextInt();
				int case4 = sc.nextInt();
				int case5 = sc.nextInt();
				int case6 = sc.nextInt();
				
			
				
				int bankersoffer = sc.nextInt();
				sc.close();
				
				String finalAnswer = " ";
				
				
				int sumOfAllCases = 1691600;
				
				int sumOfOpenedCases = briefcases.get(case1) + briefcases.get(case2) + briefcases.get(case3) + briefcases.get(case4) + briefcases.get(case5) + briefcases.get(case6);
				
				
				int sumOfUnopenedCases = sumOfAllCases - sumOfOpenedCases;
				
				int averageofUnopenedCases = sumOfUnopenedCases / (10 - numcases);
				
				
				if (averageofUnopenedCases < bankersoffer) {
					finalAnswer = "Deal";
					
				} else {
					finalAnswer = "No Deal";
					
				}
				
				System.out.println(finalAnswer);

				
			} else if (numcases == 7) {
				
				int case1 = sc.nextInt();
				int case2 = sc.nextInt();
				int case3 = sc.nextInt();
				int case4 = sc.nextInt();
				int case5 = sc.nextInt();
				int case6 = sc.nextInt();
				int case7 = sc.nextInt();
				
	
				
				int bankersoffer = sc.nextInt();
				sc.close();
				
				String finalAnswer = " ";
				
				
				int sumOfAllCases = 1691600;
				
				int sumOfOpenedCases = briefcases.get(case1) + briefcases.get(case2) + briefcases.get(case3) + briefcases.get(case4) + briefcases.get(case5) + briefcases.get(case6) + briefcases.get(case7);
				
				
				int sumOfUnopenedCases = sumOfAllCases - sumOfOpenedCases;
				
				int averageofUnopenedCases = sumOfUnopenedCases / (10 - numcases);
				
				
				if (averageofUnopenedCases < bankersoffer) {
					finalAnswer = "Deal";
					
				} else {
					finalAnswer = "No Deal";
					
				}
				
				System.out.println(finalAnswer);

				
			} else if (numcases == 8 ) {
				int case1 = sc.nextInt();
				int case2 = sc.nextInt();
				int case3 = sc.nextInt();
				int case4 = sc.nextInt();
				int case5 = sc.nextInt();
				int case6 = sc.nextInt();
				int case7 = sc.nextInt();
				int case8 = sc.nextInt();
				
		
				int bankersoffer = sc.nextInt();
				sc.close();
				
				String finalAnswer = " ";
				
				
				int sumOfAllCases = 1691600;
				
				int sumOfOpenedCases = briefcases.get(case1) + briefcases.get(case2) + briefcases.get(case3) + briefcases.get(case4) + briefcases.get(case5) + briefcases.get(case6) + briefcases.get(case7) + briefcases.get(case8);
				
				
				int sumOfUnopenedCases = sumOfAllCases - sumOfOpenedCases;
				
				int averageofUnopenedCases = sumOfUnopenedCases / (10 - numcases);
				
				
				if (averageofUnopenedCases < bankersoffer) {
					finalAnswer = "Deal";
					
				} else {
					finalAnswer = "No Deal";
					
				}
				
				System.out.println(finalAnswer);

			} else if (numcases == 9) {
				int case1 = sc.nextInt();
				int case2 = sc.nextInt();
				int case3 = sc.nextInt();
				int case4 = sc.nextInt();
				int case5 = sc.nextInt();
				int case6 = sc.nextInt();
				int case7 = sc.nextInt();
				int case8 = sc.nextInt();
				int case9 = sc.nextInt();
				
			
				int bankersoffer = sc.nextInt();
				sc.close();
				
				String finalAnswer = " ";
				
				
				int sumOfAllCases = 1691600;
				
				int sumOfOpenedCases = briefcases.get(case1) + briefcases.get(case2) + briefcases.get(case3) + briefcases.get(case4) + briefcases.get(case5) + briefcases.get(case6) + briefcases.get(case7) + briefcases.get(case8) + briefcases.get(case9);
				
				
				int sumOfUnopenedCases = sumOfAllCases - sumOfOpenedCases;
				
				int averageofUnopenedCases = sumOfUnopenedCases / (10 - numcases);
				
				
				if (averageofUnopenedCases < bankersoffer) {
					finalAnswer = "Deal";
					
				} else {
					finalAnswer = "No Deal";	
				} 				
				System.out.println(finalAnswer);
			}
	}
}
