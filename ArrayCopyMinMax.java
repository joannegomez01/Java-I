/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 03/21/26

PROGRAM NAME:   ArrayCopyMinMax


DESCRIPTION:

Exercises 8.2.3: Write a program that uses an array declaration statement to initialize the following numbers in an array named slopes:
17.24, 25.63, 5.94, 33.92, 3.71, 32.84, 35.93, 18.24, 6.92.
Your program should locate and display both the maximum and minimum values in the array.
*/

public class ArrayCopyMinMax {
    public static void main(String[] args) {

        // Initialize array w/ values
        double[] slopes = {17.24, 25.63, 5.94, 33.92, 3.71, 32.84, 35.93, 18.24, 6.92};

        // Declare needed variables  ---------  Start w/ first element as both max and min
        double max = slopes[0];  // ASSUME FIRST IS MAX
        double min = slopes[0];  // ASSUME FIRST IS MIN

        // For Loop to go through remaining elements (start @ index 1)
        for (int i = 1; i < slopes.length; i++) {
            //  ^^START          ^^END @         ^^ INCREMENT BY '+1'
            // @ FIRST ELEMENT   LAST ELEMENT

            if (slopes[i] > max) {   // CHECK IF CURRENT ELEMENT IS GREATER THAN MAX
                max = slopes[i];      // IF IT IS, A NEW MAX IS FOUND
            }
            if (slopes[i] < min) {   // CHECK IF CURRENT IS LESS THAN MIN
                min = slopes[i];      // IF IT IS, A NEW MIN IS FOUND
            }
        }

        // Output results back to user
        System.out.printf("Maximum value: %6.2f \n", max);
        //                         ^^^^^^
        //                  RESERVES 6 SPACES
        //                  ROUNDED 2 DECIMAL PLACES

        System.out.printf("Minimum value: %6.2f \n", min);
        //                         ^^^^^^
        //                  RESERVES 6 SPACES
        //                  ROUNDED 2 DECIMAL PLACES
    }
}
/*
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=52853" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W8 Arrays\ArrayCopyMinMax\out\production\ArrayCopyMinMax" ArrayCopyMinMax
Maximum value:  35.93
Minimum value:   3.71

Process finished with exit code 0

 */