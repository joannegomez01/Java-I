/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/14/26
PROGRAM NAME: Names.java


DESCRIPTION:  Show "Hello World" in a GUI Dialog Box

The below example demonstrates two new concepts:

   - How to have one Java file use another Java file (two separate files, saved in the same directory/folder).
   - How to swap values between two variables.

Type up the below example programs, which swap the fist and last names of instance "me" using a method swap().
save as two different files, and run both by compiling and running UseNames.java.  Save and submit Names.java and UseNames.java

*/


class Names
{
	// data declaration section
	String first, middle, last;
	
	// method definition section
	Names() // default constructor - makes the same names everytime
	{
		first = "Alex";
		middle =  "Veselinov";
		last = "Stoykov";
	}
	
	Names(String newF, String newM, String newL) // Explicit Constructor - makes different Names
	{//				^^         ^^          ^^  PARAMETERS = variables that accept ARGUMENTS
		first = newF;
		middle = newM;
		last = newL;
	}
	
	void changeFirst(String newF) // mutator - changes private instance's variables
	{
		first = newF;
	}
	
	void swap()
	{
		String temp; //need this to store the text "temp"orarily
		temp = first; // temp = "Alex"
		first = last; // first = "Stoykov"
		last = temp; // last = "Alex" ... we swapped the first and last names
	}
	
	public String toString()
	{
		return first + " " + middle + " " + last;
	}
}

/*  OUTPUT BC Names.java program does not have a main()...this program is being used for UseNames.java program... (its sharing its class mutators/instances/constructor)

Error: Main method not found in class Names, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/