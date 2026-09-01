/*

NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/07/26
PROGRAM NAME: Circle.java 

To Complie in terminal type: javac Circle.java
To Run in terminal type:  java Circle


DESCRIPTION:


Write a new Java program Circle.java which has a class Circle, that includes:

    - Constructor Circle ( ), which makes the variable radius equal to 10 
    - Accessor method toString ( ), which returns: "circle has radius of" + radius. 
    - Mutator changeCircle (double newR), which changes the  radius to be equal to newR
    - Test Circle () , toString(), and changeCircle(double newR) from the main

*/

class Circle
{

	//variable needed
	double radius;
	
	
	//Defualt Constructor 
	Circle()
	{
		radius = 10;
	}



	//Accessor Method
	public String toString() // shows circle's properties
	{
		return "circle has radius of " + radius;
	}
	
	
	//Mutator Method 
	
	void changeCircle(double newR) //changes circle's properties
	{
		radius = newR;
	}
	
	
	
	//Testing from main() function
	public static void main(String[] args)
	{
		Circle myCircle = new Circle();   //make a new circle with default constructor
		
		System.out.println("\nThe radius of circle is: " + myCircle);   // showing default radius value by calling  toString() function
		
		myCircle.changeCircle(50); // using changeCircle function to change default radius
		
		System.out.println("\nThe radius of the circle is now: " + myCircle); // using toString() to show NEW radius value
											
		
	}
}


/*
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W2 Classes, OOP, First Programs> javac Circle.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W2 Classes, OOP, First Programs> java Circle

The radius of circle is: circle has radius of 10.0

The radius of the circle is now: circle has radius of 50.0
*/