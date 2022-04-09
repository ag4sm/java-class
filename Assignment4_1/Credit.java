// William "Josh" Scoville
// Feb. 24, 2017

import java.util.Scanner;
public class Credit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score; // creates the variable to save the entered score
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your credit score?:");
		score = input.nextInt(); //takes input from the keyboard and places it in variable score
		
		System.out.printf("Your credit score is:  %d%n%n", score);
		
		if (score >= 720) {
			System.out.println("Your interest rate is 5.56%");		
		} else if (score >= 690) {
			System.out.println("Your interest rate is 6.38%");
		} else if (score >= 660){
			System.out.println("Your interest rate is 7.12%");
		} else if (score >= 625){
			System.out.println("Your interest rate is 9.34%");
		} else if (score >= 590){
			System.out.println("Your interest rate is 12.45%");
		} else {
			System.out.println("No credit issued");
		}
		
		input.close(); // close the scanner
		
	} // end main method

} // end class

/*
 
(2 runs of the probram follow)

What is your credit score?:
611
Your credit score is:  611

Your interest rate is 12.45%


 What is your credit score?:
634
Your credit score is:  634

Your interest rate is 9.34%

 */