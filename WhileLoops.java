import javax.swing.JOptionPane; // allows for GUI dialog boxes to be created
import java.util.Scanner; // allows usage of the Scanner Class function



/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 03/07/26
PROGRAM NAME: WhileLoops


DESCRIPTION:
Interactive while loops:

This section will provide you with more information and experience using Dialog boxes and while loops. Make sure you understand the break and continue statements.

Do one (or more) of the exercises below. Save and submit it as WhileLoops.java

Sample Program: Write both of the sample programs below in the same java file,
then add/change something and tell me what you did by placing comments in your program.

Exercise 6.3.6: Rewrite QuickTest 6.7 to display the prompt:
"Please type in the total number of data values to be averaged:"

In response to this prompt, the program should accept a user-entered number and then use this number to control the number of times the while loop is executed.
Thus, if the user enters 6 in response to the prompt, the program should request the input of six numbers and display the average of the next six numbers entered.

Exercise 6.3.X: Write a program that asks the user to enter as many numbers as the user wants to, until a 0 is entered.
The program finds the smallest, largest, sum and average of all those numbers (the 0 does not count towards the smallest, largest, sum or average).
Refer to the lecture notes for example. Use a while loop.
*/
/*
//                      =========== QuickTest Program 6.7 GUI While Loop Sample Program 1 ==========
class WhileGUI
{
    public static void main(String[] args)
    {
        String s1, info, outMessage;
        int max = 4;
        int count;
        double num, total, average, sum; // ADDED 'sum' variable

        info = "This program will ask you to enter "
                + max + " numbers. ";
        JOptionPane.showMessageDialog(null , info,
                "QuickTest Program", JOptionPane.INFORMATION_MESSAGE);

       // outMessage = "The average of the numbers: \n";  // PART OF ORIGINALLY SAMPLE
       // count = 1; // PART OF ORIGINALLY SAMPLE
       // total = 0; // PART OF ORIGINALLY SAMPLE
          outMessage = "The sum of the numbers: \n"; // ADDED/CHANGED OUTPUT MSG TO USER
          count = 1;
          total = 0;

        while (count <= max)
        {
            s1 = JOptionPane.showInputDialog("Enter number " + count + ":");
            num = Double.parseDouble(s1);

            total = total + num;
            outMessage = outMessage + num + " ";
            count++;
        }
        //average = total / max; // PART OF ORIGINALLY SAMPLE
        // ADDED - OUTPUTTING FOR SUM ... (REPLACED AVERAGE)
        sum = total;
        JOptionPane.showMessageDialog(null, outMessage + "\n is " + sum,
                "QuickTest Program 6.7", JOptionPane.INFORMATION_MESSAGE);
    }
}
*/
/*
//                  ==============    While (break, continue) Sample Program 2 =============
class BreakContinue
{
    public static void main(String[] args)
    {
        // create an instance of the Scanner class name 'keyboard'
        Scanner sc = new Scanner(System.in);
        int stop = 0;

        int n = 0;
        int counter = 1;
        while (true) // never-ending loop
        {
            System.out.print("Enter a number " + counter + ":");
            n = sc.nextInt();
            counter++;

            if (n == 0 || n == 5)  //ADDED 'or' condition
                break; // break stop the loop, the loop exits/stop here

            if (n ==1 || n == 7) //ADDED 'or' condition
                continue; // continue makes the loop resume from the beginning


            // the below message shows for any value other than 1 or 0
            System.out.println("Loop has been broken!"); //CHANGED
        }
    }
}
*/
class ExerciseNumTwo //---------------------------Exercise 6.3.X----------------------------
{
    public static void main(String[] args) // main function
    {
        //variables needed

        Scanner sc = new Scanner(System.in); // reads number from the keyboard w/ out having to parse it

        double num = 1; // initialize to enter loop
        double smallest = 0, largest = 0, sum = 0;
        int count = 0;

        while (num != 0) {  // repeats prompt to user unless user enters a '0'

            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextDouble();

            if (num == 0) { // breaks loop once '0' is entered by user
                break;
            }

            if (count == 0) {  // sets both the smallest and largest number to the user's first real number (ignoring '0' if its later entered)
                smallest = num;
                largest = num;
            }

            if (num < smallest) { // finding the smallest
                smallest = num;
            }

            if (num > largest) { //finding the largest
                largest = num;
            }

            sum += num; // total sum... same as sum = sum + num
            count++; // keeps count
        }

        if (count > 0)  // output to user results if numbers other than '0' were entered
        {
            double average = sum / count;

            System.out.println("\nSmallest: " + smallest);
            System.out.println("Largest: " + largest);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        }
        else
        {
            System.out.println("No numbers were entered.");  // user enters '0' from the start
        }
    }
}


/*
======================= QuickTest Program 6.7 GUI While Loop Sample Program 1 (TEST RUN 1)==========
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=50295" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W6 Repetition\WhileLoops\out\production\WhileLoops" WhileGUI

Process finished with exit code 0

============ QuickTest Program 6.7 GUI While Loop Sample Program 1 (TEST RUN 2 - SOMETHING ADDED )==========
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=50295" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W6 Repetition\WhileLoops\out\production\WhileLoops" WhileGUI

Process finished with exit code 0




========================  While (break, continue) Sample Program 2  (TEST RUN 1)===============
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=51571" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W6 Repetition\WhileLoops\out\production\WhileLoops" BreakContinue
Enter a number 1: 66
hello
Enter a number 2: 1
Enter a number 3: 2
hello
Enter a number 4: 0

Process finished with exit code 0

========================  While (break, continue) Sample Program 2  (TEST RUN 2 - SOMETHING ADDED )===============
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=52775" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W6 Repetition\WhileLoops\out\production\WhileLoops" BreakContinue
Enter a number 1: 22
Loop has been broken!
Enter a number 2: 1
Enter a number 3: 55
Loop has been broken!
Enter a number 4: 7
Enter a number 5: 66
Loop has been broken!
Enter a number 6: 5

Process finished with exit code 0

=============================    Exercise 6.3.X: ======================================================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=56379" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W6 Repetition\WhileLoops\out\production\WhileLoops" ExerciseNumTwo
Enter a number (0 to stop): 20
Enter a number (0 to stop): 60
Enter a number (0 to stop): 20
Enter a number (0 to stop): 0

Smallest: 20.0
Largest: 60.0
Sum: 100.0
Average: 33.333333333333336

Process finished with exit code 0

 */