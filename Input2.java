import java.io.*;   // needed inorder to use  InputStreamReader() &&  BufferedReader() functions
import java.util.*; // meeded to access the Scanner class

//  InputStreamReader()- stream object which automatically converts int values (entered by user thru System.in() ) to char values

//  BufferedReader() -  object which automatically constructs a string from char values provided by the InputStreamReader object^^^

/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/21/26
PROGRAM NAME: Input2.java


DESCRIPTION:   Keyboard Input via BufferedReader and Scanner:

    Do one (or more) of the Exercises below.
    Save and submit it as Input2.java

Sample Programs: Type up the 2 sample programs below in the same java file and get them to work. Add or change something to them, and place comments in your program to show me what you did.


Exercise 4.2.3: Write a program that displays the following prompt in an input dialog box:
	"Enter the amount of the bill:"
	After accepting a value for the amount of the bill, your program calculates the sales tax (assuming a sales tax of 6%) and displays the sales tax as a dollar value amount in a message dialog. For example bill of $10, the sale tax is (tax = bill*0.06 = 10*0.06 = $0.6)


Exercise 4.2.4: Write a program that displays the following prompt in an input dialog box:
	"Enter the radius of a circle:"
	After accepting a value for the radius, your program calculates the area of the circle and displays the area in a message dialog.  (area = 3.1416*radius*radius).


Exercise 4.2.5 Write a program that displays the following prompt in an input dialog box:
	"Enter the temperature in degrees Celsius:"
	After accepting a value for Celsius, your program calculates the temperature in Fahrenheit and displays it in a message dialog.  (Fahrenheit = (9.0/5.0)*Celsius + 32.0).


Exercise 4.2.6: Write a program that displays the following prompts in two input dialog boxes:
	"Enter the length of the office:"
	"Enter the width of the office:"
	After accepting the values for length and width, your program calculates the area of the office and displays it in a message dialog.  (area = width * length).


Exercise 4.2.7: Write a program that displays the following prompts in two input dialog boxes:
	"Enter the miles driven:"
	"Enter the gallons of gas used:"
	After accepting the values for miles and gallons, your program calculates the miles per gallon(mpg) and displays it in a message dialog.  (mpg = miles / gallons).
*/

public class Input2 //parseNums .... (changed class name to 'Input' to run both samples in one file)
{
	public static void main (String[] args)
		
		throws java.io.IOException // needed for readLine()
		{
			String s1;
			double num1;
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			//System.out.println("\n\n----------- With Buffered Reader ---------- ");
			//System.out.print("Enter a sentence: ");  //prompts user to enter something
			//					^^^^^^^^^^^^^   PROMPT = message entered by user
			//s1 = br.readLine(); //  's1' variable will store the user's entered sentence as a String
			
			//System.out.println("The sentence you entered is: " + s1); // outputs entered sentence back to user
			
			//System.out.print("Now enter a number: ");
			//s1 = br.readLine();
			
			// s1 is a string so you cannot do math on it such as "s1 = s1 * 5;"
			// to convert the string to an actual numeric value, you  have to PARSE it
			
			//num1 = Double.parseDouble(s1);
			//System.out.print("Now " + num1 + " is converted into a doouble ...\n");
			//System.out.println("...and we can do math with it 5 *" + num1 + " = " + num1 * 5);
			
			//calling scanner example from this main()
			System.out.println("\n\n-------------- Now with Scanner ----------- ");
			numsScanner.scannerDemo(); 
		}
}

class numsScanner  //(took off public from 2nd class)
{
	public static void scannerDemo() //changed main() name to scannerDemo(), to be able to call it from class Input
	{
		double num1, area, width, length, bill, totalSalesTax;
		// with Scanner :
		// we can directly enter a numerical value without parsing it:
	
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter a number: ");
		//num1 = sc.nextDouble();
		//System.out.println("You entered: " + num1);
		//System.out.println("and we can do math with it " + num1 + "* 5 = " + num1 * 5);
		
		
		// ==========================        ADDED EXERCISES 4.2.6  ==========================================
		System.out.println("\n\n----------- Finding the Area of an Office (Ex: 4.2.6) ----------------");
		System.out.print("Enter the length of the office in feet: "); //asking user for input
		length = sc.nextDouble();  // storing users string as a double integer in 'length' variable
		System.out.print("Enter the width of the office in feet: "); //asking user for input
		width = sc.nextDouble();  // storing users string as a double integer in 'width' variable
		area = length * width;
		System.out.print("The area of a room w/ the length of " + length + " ft and the width of " + width + " ft is " + area + " ft sq."); 
		
		// ==========================         EXERCISE 4.1.5  ==========================================
		System.out.println("\n\n----------- Calculating Sales Tax (6%) On Bill (Ex: 4.2.3) ----------------");
		System.out.print("Enter the amount of the bill: "); //asking user for input
		bill = sc.nextDouble();  // storing users string as a double integer in 'bill' variable
		totalSalesTax = bill * 0.06; // calculates total sales tax assuming sales tax is 6%
		System.out.print("Total sales tax (6%) on $" + bill + " is $" + totalSalesTax); 
		
	}
}

/*
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W4 Input, Exception Handling> javac Input2.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W4 Input, Exception Handling> java Input2


-------------- Now with Scanner -----------


----------- Finding the Area of an Office (Ex: 4.2.6) ----------------
Enter the length of the office in feet: 12
Enter the width of the office in feet: 12
The area of a room w/ the length of 12.0 ft and the width of 12.0 ft is 144.0 ft sq.

----------- Calculating Sales Tax (6%) On Bill (Ex: 4.2.3) ----------------
Enter the amount of the bill: 10
Total sales tax (6%) on $10.0 is $0.6
*/