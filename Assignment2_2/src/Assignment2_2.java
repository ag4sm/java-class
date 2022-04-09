import java.util.Scanner;  // program uses class Scanner

/* William Scoville - netid:  wscovill
 * January 24, 2017
 * 
 * Assignment 2.2 Cash Register
 */

public class Assignment2_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		double item1; // First item in cash Register
		double item2; // Second item in cash Register
		double item3; // Third item in cash Register
		final double tax = .06; // Sales Tax to be used in calculating tax
		double taxtotal; //stores the calculated tax
		double sub; // sub total of 3 items before tax calculation
		double total; // stores total after tax calculation
		
		System.out.print("Enter your first item price:  "); // prompt for first item
		item1 = input.nextFloat(); // stores input for first item in veriable item1
		
		System.out.print("Enter your second item price:  "); // prompt for second item
		item2 = input.nextFloat(); //  stores input for second item in variable item2
		
		System.out.print("Enter your third item price:  "); // prompt for third item
		item3 = input.nextFloat(); //  stores input for third item in variable item3
		
		sub = item1 + item2 + item3;  // adds the 3 items together and stores the result in the subtotal variable
		taxtotal = sub *tax; // calculates sales tax from subtotal
		total = taxtotal + sub; // calculates total cost
		
		System.out.printf("Item 1 price: %.2f%n", item1); // display item 1 price entered
		System.out.printf("Item 2 price: %.2f%n", item2); // display item 2 price entered
		System.out.printf("Item 2 price: %.2f%n", item3); // display item 3 price entered
		System.out.printf("The subtotal of the 3 items is:  %.2f%n", sub); // print the sub total of the items
		System.out.printf("The sales tax is 6%% which is:  %.2f%n", taxtotal); // prints the sales tax and shows the calculated tax amount
		
		System.out.printf("The total is %.2f%n" , total);
		
	} // end of method main

} // end of class
