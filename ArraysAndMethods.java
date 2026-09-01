/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 03/21/26

PROGRAM NAME:   ArraysAndMethods


DESCRIPTION:

Exercise 8.4.5: Write a program that has a declaration in main() to store the following numbers into an array referenced by a variable named rates:
6.5, 7.2, 7.5, 8.3, 8.6, 9.4, 9.6, 9.8, 10.0.
Write your own method show(...) which shows the numbers in an array of any size.
Call show(...) from the main() passing your array rates as an argument.
 */

public class ArraysAndMethods {
                    //            vvv PARAMETER
    public static void show(double[] array)
    {           //    ^^NAME OF FUNCTION
        System.out.print("Values: ");
        for (int i = 0; i < array.length; i++) {   //STARTS @ 1ST ELEMENT , ENDS @ LAST ELEMENT , INCREMENTS BY '1'
            System.out.print(array[i] + "  ");  // OUTPUTS TO USER
            //                   ^^^^
            //            PRINTS THE VALUE
            //            THEN ADDS 2 SPACES
            //            FOR SEPARATION
        }
        System.out.println(); // MOVES TO NEXT LINE AFTER ALL VALUES
    }

    public static void main(String[] args)
    {
        double[] rates = {6.5, 7.2, 7.5, 8.3, 8.6, 9.4, 9.6, 9.8, 10.0};
        //                      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //              INITIALIZING ARRAY W/ VALUES

        show(rates); // CALLING showValues() .... PASSING rates ARRAY TO METHOD/FUNCTION
        //            ^^^^      ^^^^^
        //            METHOD    ARGUMENT (actual value passed)
        //            NAME
       //           AKA FUNCTION
    }
}

/*
====TEST RUN===
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=54257" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W8 Arrays\ArraysAndMethods\out\production\ArraysAndMethods" ArraysAndMethods
Values: 6.5  7.2  7.5  8.3  8.6  9.4  9.6  9.8  10.0

Process finished with exit code 0

 */