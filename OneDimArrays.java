import java.util.*;

/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 03/21/26

PROGRAM NAME:  OneDimArrays.


DESCRIPTION:

Exercise 8.1.6: Write a program to input the following values into an array named prices:
10.95, 16.32, 12.15, 8.22, 15.98, 26.22, 13.54, 6.45, 17.59.
After the data was entered, have your program output the values in the order they were entered and in reverse order.
Use an array and a loop.
*/

public class OneDimArrays {
    public static void main(String[] args) {

        // Initialize the array w/ values
        double[] prices = {10.95, 16.32, 12.15, 8.22, 15.98, 26.22, 13.54, 6.45, 17.59};

        // Output values in original order to user
        System.out.println("Prices in original order:");
        System.out.println("------------------------");
        for (int i = 0; i < prices.length; i++) {   //FOR LOOP TO GO THROUGH ARRAY
        //  ^^START          ^^END @         ^^ INCREMENT BY '+1'
        // @ FIRST ELEMENT   LAST ELEMENT
        // AKA INDEX '0'
            System.out.printf("prices[INDEX %d] = $%6.2f \n", i, prices[i]);
            //                         ^^^^^^
            //                  RESERVES 6 SPACES
            //                  ROUNDED 2 DECIMAL PLACES
        }

        System.out.println();

        // Output values in reverse order to user
        System.out.println("Prices in reverse order:");
        System.out.println("------------------------");
        for (int i = prices.length - 1; i >= 0; i--) { // ANOTHER FOR LOOP TO GO THROUGH ARRAY
            //  ^^START                 ^^END @         ^^ INCREMENT BY '-1'
            // @ END OF ARRAY           BEGINNING OF ARRAY

            System.out.printf("prices[INDEX %d] = $%6.2f \n", i, prices[i]);
            //                         ^^^^^^
            //                  RESERVES 6 SPACES
            //                  ROUNDED 2 DECIMAL PLACES
        }
    }
}

/*
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=56670" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W8 Arrays\OneDimArrays\out\production\OneDimArrays" OneDimArrays
Prices in original order:
------------------------
prices[INDEX 0] = $ 10.95
prices[INDEX 1] = $ 16.32
prices[INDEX 2] = $ 12.15
prices[INDEX 3] = $  8.22
prices[INDEX 4] = $ 15.98
prices[INDEX 5] = $ 26.22
prices[INDEX 6] = $ 13.54
prices[INDEX 7] = $  6.45
prices[INDEX 8] = $ 17.59

Prices in reverse order:
------------------------
prices[INDEX 8] = $ 17.59
prices[INDEX 7] = $  6.45
prices[INDEX 6] = $ 13.54
prices[INDEX 5] = $ 26.22
prices[INDEX 4] = $ 15.98
prices[INDEX 3] = $  8.22
prices[INDEX 2] = $ 12.15
prices[INDEX 1] = $ 16.32
prices[INDEX 0] = $ 10.95

Process finished with exit code 0
 */