import java.io.*;


/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/28/26
PROGRAM NAME: Switches


DESCRIPTION:

Switches:

The switch statement is available in many programming languages && it is used to avoid very messy nested if statements.

Do one of the exercise below. Save and submit it as Switches.java

Sample Program: Type up the sample switch program below.
 Add/change something and tell me what you did by placing comments in the program.

Exercise 5.4.6: Write a Java program that displays a student's status based on the following codes:

    Code          Student Status

    1               Freshman
    2               Sophomore
    3               Junior
    4               Senior
    5               Masters Program
    6               Doctoral Program

Test your program for every case (1,2,3,4,5,6) and show your test runs at the bottom of your code using multiline comments
*/

/*
class SwitchExample
{
    public static void main(String[] args)
    throws IOException // ensures program does not crash due to unexpected input
    {
        int code;
        String s1;
        InputStreamReader isr = new InputStreamReader(System.in); // users inputted integer value is converted into a char value automatically
        BufferedReader br = new BufferedReader(isr);  // users inputted char value is then constructed into a string

        System.out.print("Enter code (1,2,3,4): ");
        s1 = br.readLine(); // holds users inputted value in String s1 variable
        code = Integer.parseInt(s1); // ^^ string variable is converted into Integer

        // THE SWITCH STATEMENT PROVIDES AN ALTERNATIVE TO THE IF-ELSE CHAIN
        switch(code)
        {
            case 1:
                System.out.print("Western Digital");
                break;

            case 2:
                System.out.print("Seagate");
                break;

            case 3:
                System.out.print("Verbatim");
                break;

            case 4:
                System.out.print("Toshiba");
                break;
            // ADDED CONDITIONAL STATEMENT
            case 5:
                System.out.print("NVIDIA");
                break;

            default:
                System.out.print("Wrong code entered");
        }
    }
}
*/
class StudentStatus
{
    public static void main(String[] args)
    throws IOException // ensures program does not crash due to unexpected input
    {
        int studentStatus;
        String s1;
        InputStreamReader isr = new InputStreamReader(System.in); // users inputted integer value is converted into a char value automatically
        BufferedReader br = new BufferedReader(isr);  // users inputted char value is then constructed into a string

        System.out.print("Enter Student Status (1-FM, 2-SE, 3-JR, 4-SR, 5-MS, 6-DR): ");
        s1 = br.readLine(); // holds users inputted value in String s1 variable
        studentStatus = Integer.parseInt(s1); // ^^ string variable is converted into Integer
        System.out.print("Student Status: ");
        // THE SWITCH STATEMENT PROVIDES AN ALTERNATIVE TO THE IF-ELSE CHAIN
        switch(studentStatus)
        {
            case 1:
                System.out.print("Freshman");
                break;

            case 2:
                System.out.print("Sophomore");
                break;

            case 3:
                System.out.print("Junior");
                break;

            case 4:
                System.out.print("Senior");
                break;

            case 5:
                System.out.print("Masters Program");
                break;

            case 6:
                System.out.print("Doctoral Program");
                break; //CORRECTED - ADDED BREAK

            default:
                System.out.print("Invalid!");
        }
    }
}
/*  -------------------------  SAMPLE PROGRAM SWITCH EXAMPLE --------------------------
 ================ Test Run 1: =================
 Enter code (1,2,3,4): 1
Western Digital
Process finished with exit code 0

 ================ Test Run 2: =================
 "C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=63069" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Switch\out\production\Switch" SwitchExample
Enter code (1,2,3,4): 2
Seagate
Process finished with exit code 0

 ================ Test Run 3: =================
 "C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=63082" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Switch\out\production\Switch" SwitchExample
Enter code (1,2,3,4): 3
Verbatim
Process finished with exit code 0

 ================ Test Run 4: =================
 "C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=63089" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Switch\out\production\Switch" SwitchExample
Enter code (1,2,3,4): 4
Toshiba
Process finished with exit code 0

 ================ Test Run 5: =================
 "C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=63103" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Switch\out\production\Switch" SwitchExample
Enter code (1,2,3,4): 123456
Wrong code entered
Process finished with exit code 0

================ Test Run 6 (w/ Added conditional statement): =================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=61554" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Switch\out\production\Switch" SwitchExample
Enter code (1,2,3,4): 5
NVIDIA
Process finished with exit code 0



------------------------- EXERCISE 5.4.6 ---------------------
================ Test Run 1: =================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=59972" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Switch\out\production\Switch" StudentStatus
Enter Student Status (1-FM, 2-SE, 3-JR, 4-SR, 5-MS, 6-DR): 1
Student Status: Freshman
Process finished with exit code 0


================ Test Run 2: =================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=59986" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Switch\out\production\Switch" StudentStatus
Enter Student Status (1-FM, 2-SE, 3-JR, 4-SR, 5-MS, 6-DR): 2
Student Status: Sophomore
Process finished with exit code 0


================ Test Run 3: =================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=59992" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Switch\out\production\Switch" StudentStatus
Enter Student Status (1-FM, 2-SE, 3-JR, 4-SR, 5-MS, 6-DR): 3
Student Status: Junior
Process finished with exit code 0


================ Test Run 4: =================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=59999" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Switch\out\production\Switch" StudentStatus
Enter Student Status (1-FM, 2-SE, 3-JR, 4-SR, 5-MS, 6-DR): 4
Student Status: Senior
Process finished with exit code 0


================ Test Run 5: =================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=60005" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Switch\out\production\Switch" StudentStatus
Enter Student Status (1-FM, 2-SE, 3-JR, 4-SR, 5-MS, 6-DR): 5
Student Status: Masters Program
Process finished with exit code 0


================ Test Run 6 (CORRECTED ISSUE): =================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=62615" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Switch\out\production\Switch" StudentStatus
Enter Student Status (1-FM, 2-SE, 3-JR, 4-SR, 5-MS, 6-DR): 6
Student Status: Doctoral Program
Process finished with exit code 0


================ Test Run 7: =================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=60028" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\Switch\out\production\Switch" StudentStatus
Enter Student Status (1-FM, 2-SE, 3-JR, 4-SR, 5-MS, 6-DR): 7
Student Status: Invalid!
Process finished with exit code 0


 */