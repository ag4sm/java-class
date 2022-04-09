import java.util.Scanner;

public class GradebookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		Gradebook myGradebook = new Gradebook();
		
		System.out.println("Please enter a course name:  ");
		String nameOfCourse = input.nextLine();
		System.out.println();
		
		myGradebook.displayMessage(nameOfCourse);
	}

}
