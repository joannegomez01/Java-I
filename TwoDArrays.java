/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 03/21/26

PROGRAM NAME:  TwoDArrays


DESCRIPTION:

Exercise 8.6.4: Write a Java program that adds equivalent (first+first, second+second, etc) elements of two 2D arrays named First and Second .
Both arrays should have two rows and three columns(as shown below). For Example, element of the Resulting array Resulting[1][2] = First[1][2] + Second[1][2].
You must use nested for loops to do this! Store the results in an array Result [ ] [ ] and show it.
 */
class Add2DArrays
{
    public static void show2d(int a[][])
    {
        // SHOW the 2D array to user with spaces
        for (int i = 0; i < a.length; i++)       // ROWS
        {
            for (int j = 0; j < a[0].length; j++)  // COLUMNS
            {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
    }

    public static void add2d(int First[][], int Second[][], int Result[][])
    {
        // changing the array here, will change the array declared in the main
        // array Result is a pointer to array Result in the main
        for (int i = 0; i < First.length; i++)       // loop to go through rows
        {
            for (int j = 0; j < First[0].length; j++)  // loop to go through columns
            {
                Result[i][j] = First[i][j] + Second[i][j];
                // Result[1][2] = First[1][2] + Second[1][2] FROM EXAMPLE
            }
        }
    }

    public static void main(String[] args)
    {
        // Declare and initialize First array (2 rows, 3 columns)
        int First[][] = {
                {16, 18, 23},   // ROW 0
                {54, 91, 10}    // ROW 1
        };

        // Declare and initialize Second array (2 rows, 3 columns)
        int Second[][] = {
                {24, 52, 77},   // ROW 0
                {16, 19, 50}    // ROW 1
        };

        int Result[][] = new int[2][3]; // declare an array of size 2x3 (six elements)
        // ^INDEX is not needed, b/c java can see how many elements are in the array
        // and create an array of the appropriate size

        System.out.println("First               Second");   // TITLE
        System.out.println("---------------     ---------------");

        for (int i = 0; i < First.length; i++)       // ROWS
        {
            // Print First array row
            for (int j = 0; j < First[0].length; j++)  // COLUMNS
                System.out.print(First[i][j] + "    ");

            System.out.print("     ");  // spacing b/w arrays

            // Print Second array row
            for (int j = 0; j < Second[0].length; j++)  // COLUMNS
                System.out.print(Second[i][j] + "    ");

            System.out.println(); // new line after each row
        }

        add2d(First, Second, Result);
        // ^ARRAY ARGUMENTS

        // SHOW the Result array back to user
        System.out.println("\nResult");
        System.out.println("----------------");
        show2d(Result);
    }
}
/*====TEST RUN========
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=64996" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W8 Arrays\TwoDArrays\out\production\TwoDArrays" TwoDArrays
First               Second
---------------     ---------------
16    18    23         24    52    77
54    91    10         16    19    50

Result
----------------
40    70    100
70    110   60

Process finished with exit code 0

 */