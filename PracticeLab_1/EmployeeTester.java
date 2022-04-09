public class EmployeeTester
{
	public static void main (String [] args)
	{
		final double increase= 0.25;
		// Create two instances of the Employee class
		Employee jas = new Employee();
		Employee abc = new Employee("Alice", "Cason", 4000);
		
		//set first name, last name and salary for employee jas
		jas.setFirst("James");
      jas.setLast ("Chris");
      jas.setSal (6000);
		//add the additional information
		
		//display the name and salary of both Employee objects
		System.out.println("jas Employee first name:  " + jas.getFirst());
      System.out.println("abc Employee first name:  " + abc.getFirst());
		//complete the code
		
		//Determine the year to date salary for both employee
		System.out.print(abc.getFirst() +" 's salary:  ");
		int mo = 9;
		System.out.println(abc.getSalary());
		System.out.println(abc.ytdSalary(mo));
		
		//set and display salary with increase
		abc.setSalary(abc.getSalary()+abc.getSalary()*increase);
		System.out.println(abc.getSalary());
		
		
		
	}//end method main
} //end class EmployeeTester

