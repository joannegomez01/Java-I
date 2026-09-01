import java.io.*;   // needed inorder to use  InputStreamReader() &&  BufferedReader() functions
import java.util.*; // meeded to access the Scanner class

//  InputStreamReader()- stream object which automatically converts int values (entered by user thru System.in() ) to char values

//  BufferedReader() -  object which automatically constructs a string from char values provided by the InputStreamReader object^^^

/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/21/26
PROGRAM NAME: Input.java


DESCRIPTION:   Keyboard Input via BufferedReader and Scanner:

    BufferedReader is recommended for entering strings
    Scanner is recommended for entering numbers.
    Do one (or more) of the Exercises below.
    Save and submit it as Input.java

Sample Programs: Type up the 2 sample programs below in the same java file and get them to work. Add or change something to them, and place comments in your program to show me what you did.


Exercise 4.1.4: Write, compile and run a program that displays the following prompt:
	"Enter the radius of a circle: "
	After accepting the value of the radius, your program calculates and displays the area of the circle (area = 3.1416 * radius * radius).



Exercise 4.1.5: Write, compile and run a program that displays the following prompt:
	"Enter the temperature in degrees Celsius: "
	Have your program accept a value entered from the keyboard, then convert and display the temperature entered as degrees Fahrenheit (Fahrenheit = (9.0/5.0)* Celsius + 32.0 ) .


Exercise 4.1.6: Write, compile and run a program that displays the following two prompts:
	"Enter the length of the room:"
	"Enter the width of the room:"
	After each prompt is displayed, your program should accept data from the keyboard for the displayed prompt. After the width of the room is entered by the user, your program should calculate and display the area of the room (area = length*width).


Exercise 4.1.7: Write, compile and run a program that displays the following two prompts:
	"Enter the miles driven:"
	"Enter the gallons of gas used:"
	After each prompt is displayed, your program should accept data from the keyboard for the displayed prompt. After the gallons is entered by the user, your program should calculate and display the mpg(miles per gallon) (mpg = miles/gallons).

*/

public class Input //parseNums .... (changed class name to 'Input' to run both samples in one file)
{
	public static void main (String[] args)
		
		throws java.io.IOException // needed for readLine()
		{
			String s1;
			double num1;
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("\n\n----------- With Buffered Reader ---------- ");
			System.out.print("Enter a sentence: ");  //prompts user to enter something
			//					^^^^^^^^^^^^^   PROMPT = message entered by user
			s1 = br.readLine(); //  's1' variable will store the user's entered sentence as a String
			
			System.out.println("The sentence you entered is: " + s1); // outputs entered sentence back to user
			
			System.out.print("Now enter a number: ");
			s1 = br.readLine();
			
			// s1 is a string so you cannot do math on it such as "s1 = s1 * 5;"
			// to convert the string to an actual numeric value, you  have to PARSE it
			
			num1 = Double.parseDouble(s1);
			System.out.print("Now " + num1 + " is converted into a doouble ...\n");
			System.out.println("...and we can do math with it 5 *" + num1 + " = " + num1 * 5);
			
			//calling scanner example from this main()
			System.out.println("\n\n-------------- Now with Scanner ----------- ");
			numsScanner.scannerDemo(); 
		}
}

class numsScanner  //(took off public from 2nd class)
{
	public static void scannerDemo() //changed main() name to scannerDemo(), to be able to call it from class Input
	{
		double num1, area, radius, celsius, fahrenheit;
		// with Scanner :
		// we can directly enter a numerical value without parsing it:
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num1 = sc.nextDouble();
		System.out.println("You entered: " + num1);
		System.out.println("and we can do math with it " + num1 + "* 5 = " + num1 * 5);
		
		
		// ==========================        ADDED EXERCISES 4.1.4  ==========================================
		System.out.println("\n\n----------- Finding the Area of a Circle (Ex: 4.1.4) ----------------");
		System.out.print("Enter the radius of a circle in cm: "); //asking user for input
		radius = sc.nextDouble();  // storing users string as a double integer in 'radius' variable
		area = 3.1416 * Math.pow(radius, 2);  //using pow()
		System.out.print("The area of a circle w/ the radius of " + radius + " cm is " + area + " cm sq."); 
		
		// ==========================         EXERCISE 4.1.5  ==========================================
		System.out.println("\n\n----------- Converting Celsius to Fahrenheit (Ex: 4.1.5) ----------------");
		System.out.print("Enter temperature in degrees Celsius: "); //asking user for input
		celsius = sc.nextDouble();  // storing users string as a double integer in 'celsius' variable
		fahrenheit = (9.0 / 5.0) * celsius + 32.0;
		System.out.print(celsius + " degrees celsius is equal to " + fahrenheit + " degrees fahrenheit."); 
		
	}
}


/*
 ********* with samples only***
 
 ----------- With Buffered Reader ----------
Enter a sentence: one two three four!!
The sentence you entered is: one two three four!!
Now enter a number: 10
Now 10.0 is converted into a doouble ...
...and we can do math with it 5 *10.0 = 50.0


-------------- Now with Scanner -----------
Enter a number: 10
You entered: 10.0
and we can do math with it 10.0* 5 = 50.0



******* With added extercises ******

PS C:\Users\joann\Desktop\CSIS24-JAVA I\W4 Input, Exception Handling> javac Input.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W4 Input, Exception Handling> java Input


----------- With Buffered Reader ----------
Enter a sentence: one two three four!!
The sentence you entered is: one two three four!!
Now enter a number: 10
Now 10.0 is converted into a doouble ...
...and we can do math with it 5 *10.0 = 50.0


-------------- Now with Scanner -----------
Enter a number: 10
You entered: 10.0
and we can do math with it 10.0* 5 = 50.0


----------- Finding the Area of a Circle (Ex: 4.1.4) ----------------
Enter the radius of a circle in cm: 7
The area of a circle w/ the radius of 7.0 cm is 153.9384 cm sq.

----------- Converting Celsius to Fahrenheit (Ex: 4.1.5) ----------------
Enter temperature in degrees Celsius: 20
20.0 degrees celsius is equal to 68.0 degrees fahrenheit.
*/