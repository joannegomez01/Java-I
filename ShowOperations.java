/*

NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/07/26
PROGRAM NAME: ShowOperations.java


DESCRIPTION:


Part 1)
Type up ShowOperations.java below and get it working:


Part 2)

Modify ShowOperations.java to calculate and display the results of the following expressions:

    3.0 * 5.0
    7.1 * 8.3 - 2.2
    3.2 / (6.1 * 5)

Compile, run your program, and show how your program ran in the program comments.
*/



// ~~~~~~~~~~~~~~~~~~     PART 1  ~~~~~~~~~~~~~~~~~~~~~
public class ShowOperations
{
	public static void main(String[] args)
	{
		System.out.println(    "\nPart 1:\n15.0 plus 2.0 equals " + (15.0 +2.0)+ "\n"
							 + "15.0 minus 2.0 equals " + (15 - 2.0) + "\n"
							 + "15.0 times 2.0 equals " + (15 * 2.0) + "\n"
							 + "15.0 divided by 2.0 equals " + (15.0/2.0) );
							 
// ~~~~~~~~~~~~~~~~~~     PART 2  ~~~~~~~~~~~~~~~~~~~~~							 
		System.out.println(    "\nPart 2:\n3.0 times 5.0 equals " + (3.0 + 5.0) + "\n"
							 + "7.1 times 8.3 minus 2.2 equals " + (7.1 * 8.3 + 2.2) + "\n"
							 + "3.2 divided by 6.1 times 5 equals " + (3.2 / (6.1 * 5)) + "\n");
	}
}


/*
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W2 Classes, OOP, First Programs> javac ShowOperations.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W2 Classes, OOP, First Programs> java ShowOperations

Part 1:
15.0 plus 2.0 equals 17.0
15.0 minus 2.0 equals 13.0
15.0 times 2.0 equals 30.0
15.0 divided by 2.0 equals 7.5

Part 2:
3.0 times 5.0 equals 8.0
7.1 times 8.3 minus 2.2 equals 61.13
3.2 divided by 6.1 times 5 equals 0.10491803278688525

PS C:\Users\joann\Desktop\CSIS24-JAVA I\W2 Classes, OOP, First Programs>
*/
