import java.util.*;
import java.util.Scanner;
/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 03/14/26

PROGRAM NAME: StringProcessing


DESCRIPTION:

Exercise 7.2.8: Using the charAt() method, write and run a Java program that reads in a string and prints the string in reverse order. (Tip: Once the string has been entered and saved,
retrieve and display characters starting from the end of the string).
*/


class StringProcessing {

    // FUNCTION WHICH REVERSES ORDER OF USERS ENTERED SENTENCE
    public static void reverse(String sentence) {

        String reversed = ""; // empty STRING which will hold users sentence

        for (int i = sentence.length() - 1; i >= 0; i--)  //
        { //  ^STARTS           ^^ENDS              ^^ INCREMENTS BY MINUS ONE
//         @ ELEMENT          @ FIRST ELEMENT
//         ON THE END
            reversed = reversed + sentence.charAt(i); // the String 'reverse' will display all Char backwards
        }
        //OUTPUTS INPUT REVERSED BACK TO USER
        System.out.println("The string after being reversed: " + reversed);
    }

    // FUNCTION WHICH PROMPTS USER TO ENTER SENTENCE
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence = sc.nextLine(); // SAVES SENTENCE IN STRING

        reverse(sentence); // CAlLING THE reverse() FROM ABOVE
    }
}

/*
==== TEST RUN #1 ======
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=49994" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W7 Strings\StringProcessing\out\production\StringProcessing" CountVowels
Please enter a sentence: taco cat
The string after being reversed: tac ocat

Process finished with exit code 0

==== TEST RUN #2 ======
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=50038" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W7 Strings\StringProcessing\out\production\StringProcessing" CountVowels
Please enter a sentence: hello world
The string after being reversed: dlrow olleh

Process finished with exit code 0


 */