/*

NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/14/26
PROGRAM NAME: Rectangle.java


DESCRIPTION:

Return Value:

    - Copy the Rectangle.java sample program below and get it to work
    - Write a Triangle.java program with a class named Triangle that contains three integer instance variables (properties) named: sideOne, sideTwo, sideThree.
    - The class should include a constructor, accessor, and mutator methods that can show and change the above variables.
    - Write and test a method int perimeter(int sideOne, int sideTwo, int SideThree) , which returns the sum of those 3 sides to the  main( )
    - Save and submit your program as Rectangle.java, Triangle.java

*/

class Rectangle
{
	// instance variables - hold values for program 
	int  length, width;
	
	// constructor - makes a new instance/object with specific values
	Rectangle(int newL, int newW)
	{
		length = newL;
		width = newW;
	}
	
	// mutators - types of functions/methods used in OOP to modify private variables.... called from the main() 
	void changeL(int newL) { length = newL; }
	void changeW(int newW) { width = newW; }
	
	
	// accessors - type of functions/methods used to retrieve/show the values of an object's private instance/functions variables ... used from main()
	int getL() { return length; }
	int getW() { return width; }
	
	// method that returns the sum of all sides
	int sum(int side1, int side2)
	{
		return side1+side2;
	}
	
	public static void main(String[] args)
	{
		// make a new box
		Rectangle rect = new Rectangle(1,2);
		
		// change its values
		rect.changeL(10);  
		rect.changeW(20);   
		
		// show sum of all sides
		int sum = rect.sum(10,20); // Correction 'int s' --> 'int sum'
		
		System.out.println("Sum of 2 side = "  + sum); //Correction  s --> sum
	}
	
	/*
	PS C:\Users\joann\Desktop\CSIS24-JAVA I\W3 Methods, Types of Variables> javac Rectangle.java
	PS C:\Users\joann\Desktop\CSIS24-JAVA I\W3 Methods, Types of Variables> java Rectangle
	Sum of 2 side = 30
	*/
}