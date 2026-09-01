/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/14/26
PROGRAM NAME: UseNames.java


DESCRIPTION:  Show "Hello World" in a GUI Dialog Box

The below example demonstrates two new concepts:

   - How to have one Java file use another Java file (two separate files, saved in the same directory/folder).
   - How to swap values between two variables.

Type up the below example programs, which swap the fist and last names of instance "me" using a method swap().
save as two different files, and run both by compiling and running UseNames.java.  Save and submit Names.java and UseNames.java

*/

class UseNames
{
	public static void main(String[] args)
	{
		// "me" and "someone" are each an "INSTANCE" of the Names class
		Names me = new Names(); // calls default constructor
		Names someone = new Names("Ellen", "Hi.", "Venable"); // calls explicit constructor
		// 							^^^     ^^^      ^^^^      ARGUMENTS = the values that go into the PARAMETERs
		System.out.println(me); // Alex Veselinov Stoykov
		System.out.println(someone); // Ellen H. Venable
		someone.swap();
		System.out.println(someone); // Venable H. Ellen
		
	}
}

/*
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W3 Methods, Types of Variables> javac UseNames.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W3 Methods, Types of Variables> java UseNames
Alex Veselinov Stoykov
Ellen Hi. Venable

*/