/*
 * Exercise 4.17 on page 147.  Develop a Java application that will input the miles driven
 * and gallons used (both as integers) for each trip.  The program should calculate
 * and display the miles per gallon obtained for each trip and print the combined
 * miles per gallon obtained for all trips up to this point.  All averaging calculations 
 * should produce floating point results.  Use class Scanner and sentinel-controlled 
 * repetition to obtain data from the user.
 * 
 * William "Josh" Scoville
 * March 1, 2017
 */
import java.util.Scanner;

public class gasmileage {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int miles = 1;
		int gallons = 1;
		double totalmiles = 0;
		double mpg = 0;
		double total = 0;
		int counter = 0;
		double average = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter miles driven for the trip or 0 to quit:");
		miles = input.nextInt(); // takes input of miles driven ans stores it in variable miles
		
		System.out.println("Enter gallons used for the trip or Enter to quit:");
		gallons = input.nextInt();  //takes input of gallons used and stores in variable gallons
		
		mpg = miles / gallons;
		System.out.printf("The total mpg for this trip is:  %s mpg%n", mpg);
				
		while (miles > 0 && gallons > 0) {
			
			mpg = miles / gallons;
			totalmiles = totalmiles + miles;
			total = (double) total + mpg;
			counter++;
					
			System.out.println("Enter miles driven for the trip or 0 to quit:");
			miles = input.nextInt(); // takes input of miles driven and stores it in variable miles
			
			System.out.println("Enter gallons used for the trip or 0 to quit:");
			gallons = input.nextInt();  //takes input of gallons used and stores in variable gallons
			
			if (gallons > 0) {
				mpg = miles / gallons;
			}
			
			System.out.printf("The total mpg for this trip is:  %s%n%n", mpg);

		}
		
		average = (double) total / counter;
		
		System.out.printf("Your total miles for all trips:  %s%n", totalmiles);
		
		System.out.printf("Your total miles per gallon for all trips: %s mpg%n", total);
		
		System.out.printf("The average mpg for all trips is: %.2s mpg%n", average);
	}

}
