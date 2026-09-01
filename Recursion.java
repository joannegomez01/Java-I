/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 03/07/26

PROGRAM NAME: Recursion


DESCRIPTION:

Sample Program: Write the sample program below,
then add/change something and tell me what you did by placing comments in your program.

*/

class Recursion {

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
           // return (n * factorial(n - 1)); ---- ORIGINAL ---
            return n * 100;  // CHANGED WHAT IS DONE WITH PARAMETER --- MODIFIED ---
        }
    }

    public static void main(String[] args)
    {
        int n = 3; // will be passed as ARGUMENT to factorial()
        int result;

        result = factorial(n); // calling factorial function() above .... PASSING ARGUMENT '3' TO FUNCTION
        System.out.println("The factorial of " + n + " is now " + result); // MODIFIED WORDING
    }

}

/*
 ========== TEST RUN #1 =================
 "C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=61944" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W6 Repetition\Recursion\Recursion\out\production\Recursion" Recursion
The factorial of 3 is 6

Process finished with exit code 0


 ========== TEST RUN #2 (SOMETHING ADDED) =================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=63010" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W6 Repetition\Recursion\Recursion\out\production\Recursion" Recursion
The factorial of 3 is now 300

Process finished with exit code 0

 */