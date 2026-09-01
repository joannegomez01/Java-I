import javax.swing.JOptionPane;

/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/21/26
PROGRAM NAME: Program45.java


DESCRIPTION:  

Section 4.2: Interactive Dialog Input

In addition to keyboard data entry, Java provides a GUI method of entering user data.
In this section you will learn how to obtain input data from dialog boxes and how to process exceptions (program errors that occur while the program is running).

    Compile and Run the sample program below.
    Then add something else to the program and tell me what you added.
    Submit as Program45.java
    Attach screenshots to show how your program ran.


*/

public class Program45
{ // Catching Exceptions
	public static void main(String[] args)
	{
		
		String s1, s2, message;
		double num1, num2, average, sum;
		try 
		{
			s1 = JOptionPane.showInputDialog("Enter a number:");
			num1 = Double.parseDouble(s1);
			
			s2 = JOptionPane.showInputDialog("Enter another number:");
			num2 = Double.parseDouble(s2);
			
			average = (num1 + num2) / 2;
			message = "The average of " + num1 + " and " + num2 + " is " + average;
			
			// --------- ADDED SUM ----------------
			sum = num1 + num2;
			message = "The sum of " + num1 + " and " + num2 + " is " + sum;
			
			JOptionPane.showMessageDialog(null,
					message, 
					"QuickTest Program 4.5", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		catch (NumberFormatException n)
		{
			JOptionPane.showMessageDialog(null,
											"You must enter a number",
											"Input Data Error",
											JOptionPane.ERROR_MESSAGE);
		}
		catch (NullPointerException n)
		{
			JOptionPane.showMessageDialog(null,
											"You pressed the cancel button",
											"Program Termination",
											JOptionPane.ERROR_MESSAGE);
		}
	}
}

/*
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W4 Input, Exception Handling> javac Program45.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W4 Input, Exception Handling> java Program45
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W4 Input, Exception Handling> javac Program45.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W4 Input, Exception Handling> java Program45
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W4 Input, Exception Handling> javac Program45.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W4 Input, Exception Handling> java Program45
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W4 Input, Exception Handling> javac Program45.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W4 Input, Exception Handling> java Program45
*/