
import java.io.*;   // needed inorder to use  InputStreamReader() &&  BufferedReader() functions
 
//  InputStreamReader()- stream object which automatically converts int values (entered by user thru System.in() ) to char values

//  BufferedReader() -  object which automatically constructs a string from char values provided by the InputStreamReader object^^^

/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/21/26
PROGRAM NAME: Program41.java


DESCRIPTION:   BufferedReader

-Type up (including all comments) the sample program below
-Add an INPUT for a third number "num3", and show the Sum of num1+num2+num3. 
-Save and submit it as Program41.java

*/

public class Program41
{
	
	public static void main(String[] args)
	throws IOException // need this for readLine()  ... this ensures that the program does not crash due to unexpected input
	
	{
		String s1, s2, s3;
		double num1, num2, num3, sum, product;
		
		
		// Set up the basic input stream
		// needed for information to b e entrered into program using trhe keyboard
		InputStreamReader isr = new InputStreamReader(System.in);   // converts user's entered values into char values
		BufferedReader br = new BufferedReader(isr); // needed for readLine()  .... converted char values are then constructed into a string
		
		
		// tell user what to enter
		System.out.print("Enter a number: ");
		//				  ^^^^^^^^^^^^^^^^     prompt
		// Prompt - message that tells the user what to enter
		
		// When it reaches br.readLine(), the program will pause
		// The user will type a number, press Enter, and then the program resumes
		s1 = br.readLine(); // Input: user enters a number which is read as a string
		num1 = Double.parseDouble(s1); // the string is converted into double
		
		
		System.out.print("Enter another number: ");
		s2 = br.readLine(); // Input 
		num2 = Double.parseDouble(s2);
		
		product = num1 * num2; // Multiply the two numbers

		System.out.println(num1 + " times " + num2 + " = " + product);
		
		
		System.out.println("\nSum method: ");
		System.out.print("Enter another number: "); // ask user to input another value
		s3 = br.readLine(); // Input .... stores user's inputted value as a string in 's3' variable by using 'br.readLine()' function
		num3 = Double.parseDouble(s3);  // String is converted into double integer using 'Double.parseDouble()' function and stored in 'num3'
		
		// Sum method/function is added and outputted to back to user
		sum = num1 + num2 + num3;
		System.out.println(num1 + " plus " + num2 + " plus " + num3 + " = " + sum + "\n");
		
		
		
		
	}
}


/*
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W4 Input, Exception Handling> javac Program41.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W4 Input, Exception Handling> java Program41
Enter a number: 2
Enter another number: 2
2.0 times 2.0 = 4.0

Sum method:
Enter another number: 6
2.0 plus 2.0 plus 6.0 = 10.0

*/