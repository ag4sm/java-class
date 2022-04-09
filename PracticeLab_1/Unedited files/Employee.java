/* Name
*  Date
* 
* Modifies for Emolpyee Class on pg 101.
* Create a class called Employee that include three 
* instance variables - first name (type String), last name
* (type String), and monthly salary. Create a constructor
* that initializes the three instance variables.  Write set 
* and get methods for each of the instance variables.  If the
* salary is not positive, do not set a value.  In addition, write
* a method named ytdSalary which will accept the month (as an 
* integer and returns the year to date salary.  Give each employee
* a 2.5% increase and display their new monthly salary
*
* Create a tester class to demonstrate the capabilities of the Employee Class
* Create two instances of the employee class.
*/
public class Employee
{
	//Instance variables
	private String first;
	private String last;
	private double salary;
	
	//empty constructor
	
	public Employee()
	{
		//fill in the code to set default values to the instance variables
		first="";
	}
	
	//Constructor initializing instance variables with arguments
	public Employee(String f, String l, double sal)
	{
		first=f;
		//complete
				
	}
	
	public void setFirst(String f)
	{
		first = f;
	}
	
	public void setLast (String l)
	{
		//complete the code to set the lastname
	}
	
	public void setSalary (double sal)
	{
		//somplete the code to set the salary
	}
	
	public String getFirst()
	{
		return first;
	}
		
	//add the two additional methods getLast() and getSalary
	
	public double ytdSalary(int months)
	{
		double yearToDateSal;
		
		yearToDateSal = salary * months;
		
		return yearToDateSal;
	}
}//end Class
	
	