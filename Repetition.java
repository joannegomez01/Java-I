import java.util.*; // needed in order to use Scanner
/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 03/12/26
PROGRAM NAME: Repetition


DESCRIPTION:

Repetition:

The while and for loops are used a lot, and are similar in C++, Perl, PHP, Python, and UNIX Shell Programming.

Complete one or more of the exercises. Save and submit it as Repetition.java

Exercise 6.2.2: Rewrite QuickTest Program 6.4 to produce a table that starts at a Celsius value of -10 and ends with a Celsius value of 60.
 Use increments of 10 degrees.

Exercise 6.2.4: Write a Java program that converts gallons to liters.
The program should display gallons from 10 to 20 in 1-gallon increments and the corresponding liter equivalents.
(Hint: 1 gallon = 3.785 liters).

Exercise 6.2.8: An approximate formula for converting Fahrenheit to Celsius temperature is

Celsius = (Fahrenheit - 30) / 2.0      ... approximate formula

Using the above formula and starting with a Fahrenheit temperature of 0 degrees,
write a Java program that determines when the approximate equivalent Celsius temperature differs from the exact equivalent value by more than 4 degrees.

Celsius = (5.0/9.0)*(Fahrenheit - 32) ... exact formula

(Hint: use a while loop that terminates when the difference b/w the approximate and exact Celsius temperature exceeds 4 degrees)
QuickTest program 6.4 Sample Program

Celsius to Fahrenheit conversion table.

(Hint: 1 Fahrenheit = (9.0/5.0)*Celsius + 32 )
*/
/*
class WhileLoop
{
    public static void main(String[] args)
    {
        int stop = 50;
        int start = 0;
        int increment = 5;
        double celsius;
        double fahren;

        System.out.println("Degrees     Degrees");
        System.out.println("Celsius    Fahrenheit");

        celsius = start;
        while (celsius <= stop)
        {
            fahren = (9.0/5.0) * celsius + 32.0;
            System.out.printf("%2.0f          %-5.2f \n", celsius, fahren);
            celsius = celsius + increment;
        }
    }
}
*/

// =================== Exercise 6.2.2: ================
class  ForLoop
{
    public static void main(String[] args) //MAIN FUNCTION
    {
        Scanner sc = new Scanner(System.in); // directly reads user input from keyboard w/ out parsing it
                                             // ^^^Basically this method allows program to read a numerical value directly w/ out needing it to go through char --> string --> double integer process

        System.out.println("Degrees     Degrees"); //TITLE
        System.out.println("Celsius     Fahrenheit\n"); //^^

        for ( double celsius = -10; celsius <= 60; celsius+=10)
        {   //   ^START @ '-10' |   ^END @ '60'  |    ^ INCREMENTS OF '10']
            double fahrenheit = (9.0 / 5.0) * celsius + 32.0;  //CELSIUS --> FAHRENHEIT CONVERSION FORMULA
            System.out.printf("%3.0f         %-3.2f \n", celsius, fahrenheit); //OUTPUTS TO USER
            //                   ^^            ^^
            //        RESERVES 3 SPACES      RESERVES 3 SPACES
            //                               ROUNDED 2 DECIMAL PLACES
        }
    }
}


/*
  ===============SAMPLE PROGRAM=============
  "C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=61073" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W6 Repetition\repetition\out\production\repetition" WhileLoop
Degrees     Degrees
Celsius    Fahrenheit
 0          32.00
 5          41.00
10          50.00
15          59.00
20          68.00
25          77.00
30          86.00
35          95.00
40          104.00
45          113.00
50          122.00

Process finished with exit code 0

// =================== Exercise 6.2.2: TESTED ================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=61460" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W6 Repetition\repetition\out\production\repetition" ForLoop
Degrees     Degrees
Celsius     Fahrenheit

-10         14.00
  0         32.00
 10         50.00
 20         68.00
 30         86.00
 40         104.00
 50         122.00
 60         140.00

Process finished with exit code 0

 */