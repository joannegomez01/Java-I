/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/14/26
PROGRAM NAME: Add.java


DESCRIPTION:  

Return volume from a method which has 3 parameters

    - Copy the Add.java sample program below.
    - Write a Ch3Test.java program which passes 3 integer arguments (height, width, length) into a method vol(...) .
    - The above method then computes the volume, and returns the volume to the main( ).
    - Show all related values on the screen.
    - Save and submit the programs Ch3Test.java, Add.java

For Ch3Test.java, if the sides are 3 by 3 by 6, then your output should be something like:
"the volume of a 3x3x6 is 54 cubic feet."

Remember: the volume must be returned from a method with 3 parameters. [ see Exercises 3.2 returning single value for reference]

So, to call the method from the main, one would write something resembling:

v = vol(sideA, sideB, sideC);

All variables above are of the "integer" data type.

*/

class Add
{
	int sum(int num1, int num2)
	{
		return num1 + num2;
	}
	
	
	public static void main(String[] args)
	{
		Add add = new Add();
		System.out.println("1 + 2 = " + add.sum(1,2) );

	}
}

/*
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W3 Methods, Types of Variables> javac Add.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W3 Methods, Types of Variables> java Add
1 + 2 = 3

*/