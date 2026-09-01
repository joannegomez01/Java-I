import java.io.*;
import java.text.*;



/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/28/26
PROGRAM NAME: Selection


DESCRIPTION:  

Do one of the exercises below. Save and submit it as Selection.java

Sample Program: Type up the sample program below and get it to work, add/change something and tell me what you changed/added by adding comments in your program

Exercises 5.2.10: Write a Java program that displays either the message "I feel great today!" or the message "I feel not so great today!" depending on the user input.
If the input is the integer 1, entered in the variable choice,
then the first message should be displayed; otherwise the second message should be displayed.

Exercises 5.2.8: Write a Java program to compute and display a person's weekly salary.
If the hours worked are less than or equal to 40, the person receives $8.00 per hour;
otherwise the person received $320.00 plus $12.00 for each hour worked over 40 hours.


*/

class Selection
{
    public static void main(String[] args)
    throws IOException //ensures program does not crash due to unexpected input
    {
        double temperature,choice; // variables for both programs.. hold users input in form of double integers
        String s1, s2; // takes users inputted values in form of string which will later be converted into double integers
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter temperature: ");
        s1 = br.readLine();
        temperature = Double.parseDouble(s1);

        if (temperature < 0)
        {
            System.out.print("The temperature");
            System.out.println(" is negative");
        }
        //ADDED TO SAMPLE PROGRAM
        if (temperature == 134)
        {
            System.out.println( temperature + " is highest officially recognized air temperature on Earth!!!");
        }

        else if (temperature == 0)
        {
            System.out.println("The temperature is zero");
        }
        else if (temperature > 0) //CORRECTED - CONVERTED TO 'ELSE_IF' && ADDED CONDITIONAL STATEMENT
        {
            System.out.println("The temperature is positive");
        }

        // Exercises 5.2.10
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("\n            How Are You Feeling Today? (1-Great or 'any other number'-Not Great)");
        System.out.print("\nPlease enter a number: ");
        s2 = br.readLine(); // hold
        choice = Double.parseDouble(s2);

        if (choice == 1)
        {
            System.out.println("I feel great today!");
        }
        else
        {
            System.out.println("I feel not so great today!");
        }
    }
}

/*
 ================ Test Run1 (CORRECTED): =================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=62477" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Selection\out\production\Selection" Selection
Enter temperature: -7
The temperature is negative
-----------------------------------------------------------------------------------------

            How Are You Feeling Today? (1-Great or 'any other number'-Not Great)

Please enter a number: 1
I feel great today!

Process finished with exit code 0

 ================ Test Run2: =================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=63022" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Selection\out\production\Selection" Selection
Enter temperature: 0
The temperature is zero

Process finished with exit code 0


 ================ Test Run3: =================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=63038" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Selection\out\production\Selection" Selection
Enter temperature: 11
The temperature is positive

Process finished with exit code 0


 ================ Test Run4 Sample Program W/ something Added: =================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=61581" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Selection\out\production\Selection" Selection
Enter temperature: 134
134.0 is highest officially recognized air temperature on Earth!!!

Process finished with exit code 0

 ================ Test Run5 Sample w/ Exercises 5.2.10 Tested: =================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=61255" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Selection\out\production\Selection" Selection
Enter temperature: 1
The temperature is positive
-----------------------------------------------------------------------------------------

            How Are You Feeling Today? (1-Great or 'any other number'-Not Great)

Please enter a number: 1
I feel great today!

Process finished with exit code 0

 ================ Test Run5 Sample w/ Exercises 5.2.10 Tested: =================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=61287" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Selection\out\production\Selection" Selection
Enter temperature: 0
The temperature is zero
-----------------------------------------------------------------------------------------

            How Are You Feeling Today? (1-Great or 'any other number'-Not Great)

Please enter a number: 4567278289
I feel not so great today!

Process finished with exit code 0

*/
