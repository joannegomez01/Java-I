/*

NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/07/26
PROGRAM NAME: Operator.java 

To Complie in terminal type: javac Operator.java
To Run in terminal type: java Operator 


DESCRIPTION:

Part 1)

Type up Operator.java below (including all the comments) and get it working.



Part 2)

Add Two new Methods, and call them from the main():

    decrement ( ) - decreases num by 1 , using  --
    decrementBy ( int anotherNum ) - decreases num by anotherNum using -=


*/


class Operator
{
	// PROPERTY: just a number, num
	int num; // VARIABLE = PROPERTY
	
	// METHODS (Ways to change/see num):
	// Default Contructor
	Operator() // make it equal to '0' initally
	{
		num = 0;
	}
	
	
	// Mutator Method 1:
	void increment() // increase num by 1
	{
		num++; // num = num + 1
	}
	
	
	// Mutator Method 2:
	void incrementBy(int anotherNum) // increase num by anotherNum
	{
		num += anotherNum; // num = num + anotherNumber
	}
	
	
	// Mutator Methods for Part 2
	void decrement()
	{
		num--; // num = num - 1 
	}
	
	void decrementBy(int anotherNum)
	{
		num -= anotherNum; // num = num - anotherNum
	}
		
	
	// Accessor Method (shows the properties of the object/class)
	public String toString()
	{
		return "num is equal to " + num;
	}
	
	// main(..) is where the program starts
	public static void main(String[] args)
	{
		System.out.println ("\nPart 1: " );   		
		Operator op = new Operator();  // make a new operator called op
		//                ^^^^^^^^    calls Operator()
		System.out.println ( op );
		//				   ^^ call toString() function
		op.increment(); // calls increment()
		System.out.println ( op );   // 1
		op.incrementBy(10); // calls incrementBy(..) function
		System.out.println ( op ); // 11
		
		System.out.println ("\nPart 2: " );  
		op.decrement();
		System.out.println("(num--) " + op);
		op.decrementBy(3);
		System.out.println("(num-= 3) " + op);
	}
	
}

/*
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W2 Classes, OOP, First Programs> javac Operator.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W2 Classes, OOP, First Programs> java Operator

Part 1:
num is equal to 0
num is equal to 1
num is equal to 11

Part 2:
(num--) num is equal to 10
(num-= 3) num is equal to 7
*/