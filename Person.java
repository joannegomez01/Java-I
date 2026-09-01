/*

NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/14/26
PROGRAM NAME: Person.java


DESCRIPTION:


Methods:

Chapter 3: Developing Class Methods

Section 3.1: Type in the sample program ( Person.java ) below and get it working, Then:

   - Add a mutator/function changeAge (int newAge) to the program.
   - Change the properties/variables of the instance "someone" to your name and your age using methods changeName(...) and changeAge(...) . 
   - Create a new instance "you" with your name and your age using the explicit constructor Person("Your Name", num) where num is your age. [ Person you = new Person("Your Name", 23); ]
   - Test and show how your program runs at the bottom of your code using a multiline comment  
   - Save and submit it as Person.java
*/

class Person
{
	// data declaration section
	String name; // instance/object variable
	int age;     // instance/object variable
	
	// method/function definition section
	Person() // Default construtor - makes the same Person every time with default values
	{
		name = "Alex";
		age = 36;
	}
	
	Person(String newName, int newAge) // Explicit Constructor - makes a different Person ...(Makes new object with user's specified values)
	//				^^^			^^^  PARAMETERS = variables that accept the ARGUMENTS
	{
		name = newName;
		age = newAge;
	}
	
	void changeName(String newName) // mutator - A.K.A function... used to make changes to instance/object
	{
		name = newName;
	}
	
	public String toString()
	{
		return "person's name = " + name + " , age = " + age;
	}
	
	
	//~~~~~~~~~~~~~~~~~ ASSIGNMEMT ~~~~~~~~~~~~~
	// ~~~~~~~~~~~~ ADDED MUTATOR/FUNCTION TO CHANGE AGE FROM MAIN()  ~~~~~~~~~~~~~~~~
	void changeAge(int newAge)
	{
		age = newAge;
	}
	
	
	//~~~~~~~~~~~ INSTANCE CREATED~~~~~~~~~~~~~~~
	
	
	public static void main(String[] args)
	{
		// "me" and "someone" are each an "INSTANCE" of the Person class
		Person me = new Person(); // calls default constructor
		Person someone = new Person("Ellen", 56); // calls exsplict constructor
		//							 ^^^     ^^ ARGUMENTS = values that go into the PARAMETERS
		System.out.println(me); // alex 36
		me.changeName("Alex");
		System.out.println(me); // ALex 36
		System.out.println(someone); // Ellen 56
		
		System.out.println("\nChange of properties/variables of the instance 'someone' using methods:"); 
		someone.changeName("Joanne"); 
		someone.changeAge(24);
		System.out.println(someone);  
		
		System.out.println("\nCreatation of a new instance 'you' using the explicit constructor:"); 
		Person you = new Person("Joanne", 24);
		System.out.println(you); 
		
	}
	
}



/*
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W3 Methods, Types of Variables> javac Person.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W3 Methods, Types of Variables> java Person
person's name = Alex , age = 36
person's name = Alex , age = 36
person's name = Ellen , age = 56

Change of properties/variables of the instance 'someone' using methods:
person's name = Joanne , age = 24

Creatation of a new instance 'you' using the explicit constructor:
person's name = Joanne , age = 24

*/