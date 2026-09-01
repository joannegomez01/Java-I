/*

NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/07/26
PROGRAM NAME: Room.java 

To Complie in terminal type: javac Room.java
To Run in terminal type: java Room


DESCRIPTION:


Part 1)

Type up the sample program below Room.java (including all the comments  // ) and get it working.


Part 2)

Room.java has two variables "length" and "width". 

    Add a mutator method "void changeLength(double newL)" , which sets the variable "length" equal to the parameter "newL",
    Call the method changeLength(...) from the public static void main

Compile, run your program, and show how your program ran in the program comments.
*/


class Room
{
	// PROPERTIES OF THE ROOM = VARIABLE
	// Variable declaration section
	double length, width;  // Variables: length, width
	//^ data type of the two variables
	
	//ACTIONS OF THE ROOM = METHODS
	// ways to "interact with the room" = ways to "changes or show the properties/variables"
	// - make a new room - CONSTRUCTOR
	// - change the room's properties - MUTATOR
	// -show the room's properties - ACCESSOR
	
	//CONSTRUCTOR - a method that sets initial properties of the room
	Room() //Defualt Constructor - sets the preoperties of a new room
	{
		length = 25.0;
		width = 12.0;
	}
	
	//MUTATOR METHODS
	void changeRoom(double newL, double newW) // - change the room
	{
		length = newL;
		width = newW;
	}
	
	// Adding mutator method for PART 2
	void changeLength(double newL)
	{
			length = newL;
	}
		
	
	//ACCESSOR METHOD
	public String toString() // - show the room's properties
	{
		return "has a length of " + length + " ,and a width of " + width;
	}
	
	public static void main(String[] args)
	{   
	// ~~~~~~~~~~~~~~~ PART 1 ~~~~~~~~~~~~
		System.out.println("\nPart 1:");
		// Room() below "Calls" the Defualt Constructor,
		// "Calls" means execute what is in between { } of Room()
		Room myRoom = new Room(); // make a new room 25 by 12 (length,width)
		System.out.println("myRoom " + myRoom); //show the room
		//								^^^^^ calls toString() function
		myRoom.changeRoom(10,20); // calls changeRoom(), changes the room's properties
		System.out.println("myRoom now " + myRoom); // showv the room again
		
		
		
	// ~~~~~~~~~~~~~~~ PART 2 ~~~~~~~~~~~~
		System.out.println("\nPart 2:");
	    myRoom.changeLength(35); // calling changeLength() function from main() function...changing length value
		System.out.println("myRoom now " + myRoom); //showing/displaying change to user
	}
	
}



/*
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W2 Classes, OOP, First Programs> javac Room.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W2 Classes, OOP, First Programs> java Room

Part 1:
myRoom has a length of 25.0 ,and a width of 12.0
myRoom now has a length of 10.0 ,and a width of 20.0

Part 2:
myRoom now has a length of 35.0 ,and a width of 20.0

*/