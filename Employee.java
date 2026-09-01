/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/14/26
PROGRAM NAME: Employee.java


DESCRIPTION:  Static & Final Variables:

    - Copy the sample Program below, including the comments in the below program that explain what static and final variables are, and how they are used.

    - Add employee_three with an ID of 789
    - Show the idNumber and numberEmployees of employee_three after it has been created
    - Save and submit it as Employee.java


*/

class Employee
{
	static int numberEmployees; // static variable shared b/w all instances/objects, changes for all if changed
	int idNumber; // instance/object variable - each instance has its own numberEmployees
	
	Employee(int newID)
	{
		idNumber = newID;
		numberEmployees++; // changing static variable changes it for all instances..counts each time a new object (employee) is created
	}
	
	public String toString()
	{
		return "idNumber = " + idNumber + ", numberEmployees = " + numberEmployees;
	}
	
	public static void main(String[] args)
	{
		System.out.println("The value of numberEmployees = " + Employee.numberEmployees);
		
		// Notice above how numberEmployeees can be "seen" and "used"
		// before  we have created any instance below (employee_one and employee_two)
		Employee employee_one = new Employee(123);
		Employee employee_two = new Employee(456);
		//		^^^^^^^^^^^	INSTANCES /OBJECTS of the employee_one and employee_two
		
		// Notice how both employee_one and employee_two have the same value for numberEmployees?
		// This is bc numberEmployees is a static variable and is "shared" b/w all instances/objects
		// then the static variable value changes for all other instances:
		System.out.println("employee_one = " + employee_one);
		System.out.println("employee_two = " + employee_two);
		
		//creating a new employee w/ default constructor
		Employee employee_three = new Employee(789);
		// ^^     ^^^^^^^^^^^     ^^^^^^^^^^^
		//'class name'  | 'name of object created' | = new + 'method being used to create new instance/object'
		
		//showing newly created instance/object (employee in this case)
		System.out.println("employee_three = " + employee_three);
	}
	
}
/*

PS C:\Users\joann\Desktop\CSIS24-JAVA I\W3 Methods, Types of Variables> javac Employee.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W3 Methods, Types of Variables> java Employee
The value of numberEmployees = 0
employee_one = idNumber = 123, numberEmployees = 2
employee_two = idNumber = 456, numberEmployees = 2
employee_three = idNumber = 789, numberEmployees = 3

*/
