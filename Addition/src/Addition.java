// Fig 2.7 Interger Addition
import java.util.Scanner;

public class Addition 
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1; //first interger to input
		int number2; //secon interger to input
		int sum; //sum of numbers 1 and 2
		
		System.out.print("Enter first number: ");  //prompt
		number1 = input.nextInt(); //read first interger from user
		
		System.out.print("Enter second number: ");  //prompt
		number2 = input.nextInt();  //read second number from user
		
		sum = number1 + number2;  //add numbers then store total in sum
		
		System.out.printf("The sum is:  %d%n" , sum);  //display the sum
	}

}
