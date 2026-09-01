import java.util.*; // meeded to access the Scanner class

/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/21/26
PROGRAM NAME: NumberFormat.java


DESCRIPTION:  

Section 4.4 covers two ways to format output. You need to be able to use both ways. The printf command is very similar to C/C++ printf, and the Python print(), so if you learned it when you took C++ (or Python), this will help you.

    Type up the NumberFormat.java below, add something to it, and then tell me what you added.
    Save and submit it as NumberFormat.java

*/
class NumberFormat
{
	public static void main(String[] args)
	
	throws java.io.IOException
	{
		double num = 1.2345678, area, radius;
		System.out.printf("Rounded to 1 decimal num = %.1f\n", num);
		System.out.printf("Rounded to 2 decimal num = %.2f\n", num);
		System.out.printf("Rounded to 2 decimal num = %5.2f\n", num);
		//%5.2f is "Field of 5 numbers total with 2  decimal digits" |xxx.xx|
		System.out.printf("Rounded to 3 decimal num = %.3f\n", num);
		System.out.printf("Rounded to 4 decimal num = %.4f\n", num);
		
		//ADDED PREVIOUS EXERCISE EXCEPT ANSWER IS ROUNDED 2 DECIMAL PLACES
		// ==========================        ADDED EXERCISES 4.1.4  ==========================================
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\n----------- Finding the Area of a Circle (rounded 2 decimal places)(Ex: 4.1.4) ----------------");
		System.out.print("Enter the radius of a circle in cm: "); //asking user for input
		radius = sc.nextDouble();  // storing users string as a double integer in 'radius' variable
		area = 3.1416 * Math.pow(radius, 2);  //using pow()
		System.out.printf("The area of a circle w/ the radius of " + radius + " cm is %.2f cm sq.", area); 
	}
}

/*
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W4 Input, Exception Handling>  javac NumberFormat.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W4 Input, Exception Handling> java NumberFormat
Rounded to 1 decimal num = 1.2
Rounded to 2 decimal num = 1.23
Rounded to 2 decimal num =  1.23
Rounded to 3 decimal num = 1.235
Rounded to 4 decimal num = 1.2346


----------- Finding the Area of a Circle (rounded 2 decimal places)(Ex: 4.1.4) ----------------
Enter the radius of a circle in cm: 7
The area of a circle w/ the radius of 7.0 cm is 153.94 cm sq.
*/