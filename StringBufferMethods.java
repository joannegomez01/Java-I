import java.io.*;
import java.util.StringTokenizer;
/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 03/14/26

PROGRAM NAME: StringBufferMethods


DESCRIPTION:

Sample Programs: Type up the sample program below get it to work. Add or change something to it,
and place comments in your program to show me what you did.
*/

public class StringBufferMethods{

    public static void main(String[] args)
    {
        StringBuffer str = new StringBuffer("what is your name");
        int i, numChars;

        System.out.println("The original string is: " + str);
        numChars = str.length();
        System.out.println("This string has " + numChars + " characters");

        // INSERT CHARACTERS
        str.insert(17," age? ");  // insert " I Know" after the 4th character of the StringBuffer  --- MODIFIED --- # OF ELEMENTS + WORD INSERTED
        System.out.println("The string after insertion is now: " + str);
        numChars = str.length();
        System.out.println("This string has " + numChars + " characters");

        //REPLACE CHARACTERS
        str.replace(17,17," and"); // REPLACES CHARACTERS 12 TO 18 W? "to"  ------ MODIFIED--- CHANGED # OF ELEMENTS + WORD INSERTED
        System.out.println("The string after replacing is now: " + str);
        numChars = str.length();
        System.out.println("This string has " + numChars + " characters");

        //REVERSE THE CHARACTERS
        str.reverse();
        System.out.println("The string after reversing is: " + str);

        // SPLIT A STRING INTO WORDS
        StringTokenizer stb = new StringTokenizer("One two three four");
        System.out.println("First Word is: " + stb.nextToken() );
        System.out.println("Second Word is: " + stb.nextToken());
        System.out.println("Third Word is: " + stb.nextToken());
        System.out.println("Fourth Word is: " + stb.nextToken());
    }
}

/* ===== TEST RUN #1 =====
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=63614" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W7 Strings\StringBufferMethods\out\production\StringBufferMethods" StringBufferMethods
The original string is: This cannot be
This string has 14 characters
The string after insertion is now: This I know cannot be
This string has 21 characters
The string after replacing is now: This I know to be
This string has 17 characters
The string after reversing is: eb ot wonk I sihT
First Word is: One
Second Word is: two
Third Word is: three
Fourth Word is: four

Process finished with exit code 0

===== TEST RUN #2 ---SOMETHING ADDED / CHANGED--------- =====
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=52610" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W7 Strings\StringBufferMethods\out\production\StringBufferMethods" StringBufferMethods
The original string is: what is your name
This string has 17 characters
The string after insertion is now: what is your name age?
This string has 23 characters
The string after replacing is now: what is your name and age?
This string has 27 characters
The string after reversing is:  ?ega dna eman ruoy si tahw
First Word is: One
Second Word is: two
Third Word is: three
Fourth Word is: four

Process finished with exit code 0

 */