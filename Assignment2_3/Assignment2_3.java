// Assignment 2.3 
// William "Josh" Scoville
// IT 5413 Spring 2017
// 2-4-17
// Calculate and store the area and perimeter of a rectangle

import java.util.Scanner; // imports the Scanner class

public class Assignment2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int area; // area variable to store the area after calculation
		int length; // length variable to store the length as entered
		int width; // width variable to store the width as entered
		
		int perm;  // perimeter variable of rectangle
		
		System.out.println("What is the length of the rectangle?");
		length = input.nextInt(); // takes the length from the keyboard and stores it as variable length
		
		System.out.println("What is the width of the rectangle?");
		width = input.nextInt(); // takes the width from the keyboard and stores it in width variable
		
		area = length * width; // calbulates the area and stores it in variable area
		
		System.out.printf("The area of the rectangle is:  %s%n", area);
		
		perm = (length + width) * 2; // calculates the perimeter from measurements and stores it in variable perm
		
		System.out.printf("The perimeter of the rectangle is:  %s%n", perm);
		
	} // end main method

}  // end class
