/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/14/26
PROGRAM NAME: Triangle.java


DESCRIPTION:

Return Value:

    - Copy the Rectangle.java sample program below and get it to work
    - Write a Triangle.java program with a class named Triangle that contains three integer instance variables (properties) named: sideOne, sideTwo, sideThree.
    - The class should include a constructor, accessor, and mutator methods that can show and change the above variables.
    - Write and test a method int perimeter(int sideOne, int sideTwo, int SideThree) , which returns the sum of those 3 sides to the  main( )
    - Save and submit your program as Rectangle.java, Triangle.java

*/

class Triangle
{
	// Instance variables/properties- hold values for program 
	int sideOne, sideTwo, sideThree;
	
	
	// Constructor - makes a new instance/object with specific values
	Triangle(int newSide1, int newSide2, int newSide3)
	{
		sideOne = newSide1;
		sideTwo = newSide2;
		sideThree = newSide3;
	}
	
	// accessors - type of functions/methods used to retrieve/show the values of an object's private instance/functions variables ... used from main()
	int getSideOne() {return sideOne; }
	int getSideTwo() {return sideTwo; }
	int getSideThree() {return sideThree; }
	
	
	
	// mutators - types of functions/methods used in OOP to modify private variables.... called from the main() 
	
	//for side1
	void changeSide1(int side_1){ sideOne = side_1; }
	
	//for side2
	void changeSide2(int side_2){ sideTwo = side_2; }
	
	//for side3
	void changeSide3(int side_3){ sideThree = side_3; }
	
	
	//method to return sum of all sides
	int perimeter(int side1, int side2, int side3)
	{
		return side1 + side2 + side3;
	}
	
	
	public static void main(String[] args)
	{
		
		Triangle tri = new Triangle (2,2,2); // calling  default constructor ... making new triangle w/ specified values
		
		System.out.println("showing all side values to user *(2,2,2)* \nside 1 = " +  tri.getSideOne() ); // showing changes in side values to user
		System.out.println("side 2 = " +  tri.getSideTwo() ); 
		System.out.println("side 3 = " +  tri.getSideThree() );        
		
		tri.changeSide1(7);   //changing side 1-3 values
		tri.changeSide2(7);   
		tri.changeSide3(7);
		
		System.out.println("\nShowing change in values *(7,7,7)*\nside 1 = " + tri.getSideOne() ); // showing changes in side values to user
		System.out.println("side 2 = " +  tri.getSideTwo() ); 
		System.out.println("side 3 = " +  tri.getSideThree() ); 
		
		int perimeter = tri.perimeter(7,7,7);  // calling perimeter function/method
		System.out.println("\nSum of 3 sides = "  + perimeter); // showing perimeter() works
		
	}
}


/*
	PS C:\Users\joann\Desktop\CSIS24-JAVA I\W3 Methods, Types of Variables> javac Triangle.java
	PS C:\Users\joann\Desktop\CSIS24-JAVA I\W3 Methods, Types of Variables> java Triangle
	showing all side values to user *(2,2,2)*
	side 1 = 2
	side 2 = 2
	side 3 = 2

	Showing change in values *(7,7,7)*
	side 1 = 7
	side 2 = 7
	side 3 = 7

	Sum of 3 sides = 21


*/