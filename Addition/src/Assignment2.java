// Assignment 2 for Software Dev class
import java.util.Scanner;  // program uses class Scanner

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int var1; // first variable to operate on
		int var2; // second variable
		int sum; // sum of variables stored here
		int diff; // difference of variables stored here
		int prod; // product of variables stored here
		int quot; // quotient of variables stored here
		
		System.out.print("Enter first integer "); // prompt
		var1 = input.nextInt(); // read first integer from keyboard
		
		System.out.print("Enter second integer "); // prompt
		var2 = input.nextInt(); // read second integer from keyboard
		
		sum = var1 + var2;
		diff = var1 - var2;
		prod = var1 * var2;
		quot = var1 / var2;
		
		System.out.printf("Sum is %d%n" , sum); // adds the variables
		System.out.printf("Difference is %d%n" , diff); // subtracts the variables
		System.out.printf("Product is %d%n" , prod); // multiplies the variables
		System.out.printf("Quotient is %d%n" , quot); // divides the variables
		
	} // end of main method

} // end of Assignment2 class
