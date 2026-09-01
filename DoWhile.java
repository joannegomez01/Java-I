import java.util.*;
import java.text.*;  // needed in order to use DecimalFormat();
/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 03/07/26
PROGRAM NAME: DoWhile


DESCRIPTION:

Exercises 6.5.4: Rewrite any of the 6.4 exercises using a do-while loop instead of a for loop.

EXAMPLE CHOSEN:

Exercise 6.4.b
Write a Java program that uses a DoWhile Loop to converts gallons to liters.
The program should display gallons from 10 to 20 in 1-gallon increments and the corresponding liter equivalents.
(Hint: 1 gallon = 3.785 liters).

*/


public class DoWhile
{

    public static void main(String[] args){ // main function

        //variables declared
        double liter;
        double gallon = 10; // START @ 10

        //output placement
        DecimalFormat cf = new DecimalFormat("00");      // gallons - output 2 digits
        DecimalFormat ff = new DecimalFormat("00.000");  // liters -  outputs  (2 digits, 3 decimals)

        System.out.println("GALLONS         LITERS"); // title
        System.out.println("-----------------------");


        do
        {
            liter = (gallon * 3.785);                                // gallon to liter conversion formula
            System.out.print("  " + cf.format(gallon));              // FORMAT || placement for output
            System.out.println("            " + ff.format(liter));   // FORMAT || placement for output
            gallon++; // increments of 1
        }
        while (gallon <= 20); // END ONCE LOOP HITS 20
    }
}

/*
 ============== RESULT ================
 "C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=59109" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W6 Repetition\DoWhileLoops\DoWhile\out\production\DoWhile" DoWhile
GALLONS         LITERS
-----------------------
  10            37.850
  11            41.635
  12            45.420
  13            49.205
  14            52.990
  15            56.775
  16            60.560
  17            64.345
  18            68.130
  19            71.915
  20            75.700

Process finished with exit code 0

 */