/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/14/26
PROGRAM NAME: Ch3Test.java


DESCRIPTION:  

Return volume from a method which has 3 parameters

 
    - Write a Ch3Test.java program which passes 3 integer arguments (height, width, length) into a method vol(...) .
    - The above method then computes the volume, and returns the volume to the main( ).
    - Show all related values on the screen.
    - Save and submit the programs Ch3Test.java, 

For Ch3Test.java, if the sides are 3 by 3 by 6, then your output should be something like:
"the volume of a 3x3x6 is 54 cubic feet."

Remember: the volume must be returned from a method with 3 parameters. [ see Exercises 3.2 returning single value for reference]

So, to call the method from the main, one would write something resembling:

v = vol(sideA, sideB, sideC);

All variables above are of the "integer" data type.

*/

class Ch3Test
{
	
	
	//ADDED METHOD
	int vol(int height, int width, int length)
	{
		return height * width * length;
		
	}
	
	public static void main(String[] args)
	{
	
		//making new instance/object by calling from main() && testing values
		
		Ch3Test volume = new Ch3Test();
		System.out.println("\n3 X 3 X 6 is " + volume.vol(3,3,6) + " cubic feet." );
	}
}

/*
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W3 Methods, Types of Variables> javac Ch3Test.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W3 Methods, Types of Variables> java Ch3Test

3 X 3 X 6 is 54 cubic feet.
*/