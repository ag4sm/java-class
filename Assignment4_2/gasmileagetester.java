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

public class gasmileagetester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int miles = 0;
		int gallons = 0;
		double totalmiles = 0;
		double mpg = 0;
		double total = 0;
		int counter = 0;
		double average = 0;
			
		Scanner input = new Scanner(System.in);

		/* Get input so it can do initial evaluation in WHILE loop */
		System.out.println("Enter miles driven for the trip or 0 to quit:");
		miles = input.nextInt(); // takes input of miles driven ans stores it in variable miles
			
		System.out.println("Enter gallons used for the trip or Enter to quit:");
		gallons = input.nextInt();  //takes input of gallons used and stores in variable gallons
						
		while (miles > 0 && gallons > 0) {
			
			// We have input so do some calculating
			mpg = (double) miles / gallons;
					
			System.out.printf("The total mpg for this trip is:  %.2f%n%n", mpg);

			totalmiles = totalmiles + miles;
			total = (double) total + mpg;
			counter++;

			System.out.println("Enter miles driven for the trip or 0 to quit:");
			miles = input.nextInt(); // takes input of miles driven and stores it in variable miles
					
			System.out.println("Enter gallons used for the trip or 0 to quit:");
			gallons = input.nextInt();  //takes input of gallons used and stores in variable gallons
								
			}

		/* Decide if any trips were taken */
		if (counter > 0) {
			
			average = (double) total / counter;
					
			System.out.printf("Your total miles for all trips:  %s%n", totalmiles);
					
			System.out.printf("Your total miles per gallon for all trips: %s mpg%n", total);
					
			System.out.printf("The average mpg for all trips is: %.2s mpg%n", average);
				}else{
					
					// Message to user if no trips were entered
					System.out.printf("Your took no trips! :(");
				}
			}
	}

/*
 * 
 * Run 1 Output 
 * 
 * Enter miles driven for the trip or 0 to quit:
 *
300
Enter gallons used for the trip or Enter to quit:
18
The total mpg for this trip is:  16.67

Enter miles driven for the trip or 0 to quit:
700
Enter gallons used for the trip or 0 to quit:
19
The total mpg for this trip is:  36.84

Enter miles driven for the trip or 0 to quit:
450
Enter gallons used for the trip or 0 to quit:
8
The total mpg for this trip is:  56.25

Enter miles driven for the trip or 0 to quit:
685
Enter gallons used for the trip or 0 to quit:
13
The total mpg for this trip is:  52.69

Enter miles driven for the trip or 0 to quit:
831
Enter gallons used for the trip or 0 to quit:
28
The total mpg for this trip is:  29.68

Enter miles driven for the trip or 0 to quit:
0
Enter gallons used for the trip or 0 to quit:
0
Your total miles for all trips:  2966.0
Your total miles per gallon for all trips: 192.12965105070367 mpg
The average mpg for all trips is: 38 mpg
 * 
 * 
 * Run 2 Output
 * 
 * Enter miles driven for the trip or 0 to quit:
400
Enter gallons used for the trip or Enter to quit:
16
The total mpg for this trip is:  25.00

Enter miles driven for the trip or 0 to quit:
600
Enter gallons used for the trip or 0 to quit:
17
The total mpg for this trip is:  35.29

Enter miles driven for the trip or 0 to quit:
500
Enter gallons used for the trip or 0 to quit:
15
The total mpg for this trip is:  33.33

Enter miles driven for the trip or 0 to quit:
200
Enter gallons used for the trip or 0 to quit:
10
The total mpg for this trip is:  20.00

Enter miles driven for the trip or 0 to quit:
0
Enter gallons used for the trip or 0 to quit:
0
Your total miles for all trips:  1700.0
Your total miles per gallon for all trips: 113.62745098039215 mpg
The average mpg for all trips is: 28 mpg
 * 
 * 
 * */