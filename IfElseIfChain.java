import java.io.*;


/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 02/28/26
PROGRAM NAME: IfElseIfChain


DESCRIPTION:

If, else if, else chain:

Do one of the Exercises below. Save and submit it as IfElseIfChain.java

Sample Programs: Type up the two sample programs below, put both in the same file/class. Add/change something to each and tell me what you changed by adding comments in your programs.

Exercises 5.3.1: A student's letter grade is calculated according to the following schedule:

       Numerical Grade                                                 Letter Grade

    greater than or equal to 90                                            A
    less than 90 but greater than or equal to 80                B
    less than 80 but greater than or equal to 70                C
    less than 70 but greater than or equal to 60                D
    less than 60                                                                      F

Write a Java program that accepts a student's numerical grade, converts it to an equivalent letter grade, and displays the letter grade. Test your program for every possible grade(A,B,C,D,F), and submit your test runs at the bottom of your code using multiline comments

Exercises 5.3.2: Type up the "Sample if, else if, else chain program" below.
Modify the program to also show the user exactly how much money they have to pay in taxes.
For example if the user enters 1000000, then your program shows them "You have to pay 39.6% which is $396000."
Test your program for every tax bracket (39.6%, 35%, 33%, 28%, 25%, 15%, 10%) and submit your test runs at the bottom of your code using multiline comments  .
*/
/*
class Selection
{
    public static void main(String [] args)
    throws IOException
    {
                     //  ================  NESTED IF SAMPLE PROGRAM    ===============
        double age;
        String s1;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter your age:");
        s1 = br.readLine();
        age = Double.parseDouble(s1);

        // ADDED Age Validation 'if'
        if (age < 0 || age > 125)
        {
            System.out.println("Invalid age!");
        }
        else if (age < 18) //Converted 'if' into 'else if', to get correct output for age validation for 'if' ^^ above
        {
            System.out.print("Too young to vote");
        }

        if (age >= 18)
        {
            if (age < 21) // nested if
            {
                System.out.println("You must be between 18-21." +
                                    "You can vote...");
                System.out.println("But can't legally buy alcohol");
            }
        }
        if (age >= 21 && age <= 125) //ADDED human life expectancy limit
        {
            System.out.println("You can legally buy alcohol.");
        }
    }
}


        // ============  IF, ELSE IF, ELSE CHAIN SAMPLE PROGRAM   ===============

class TaxBrackets
{
    public static void main(String [] args)
    throws IOException
    {
        double money;
        String s1;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("How much money did you make in 2017:");
        s1 = br.readLine();
        money = Double.parseDouble(s1);

        // Added 'if' statement
        if (money > 1000000)
        {
            System.out.println("You have to pay a lot in taxes!!");
        }
        else if (money > 418400) // changed into else if
        {
            System.out.println("You have to pay 39.6% in taxes!!");
        }
        else if (money > 416700)
        {
            System.out.println("You have to pay 35% in taxes!!");
        }
        else if (money > 191650)
        {
            System.out.println("You have to pay 33% in taxes!!");
        }
        else if (money > 91900)
        {
            System.out.println("You have to pay 28% in taxes!!");
        }
        else if (money > 37950)
        {
            System.out.println("You have to pay 25% in taxes!!");
        }
        else if (money > 9325)
        {
            System.out.println("You have to pay 15% in taxes!!");
        }
        else if (money > 0)
        {
            System.out.println("You have to pay 10% in taxes!!");
        }
        else
        {
            System.out.println("You made no money");
        }
    }
}
*/
//                  Exercise 5.3.1
class If_ElseIf_Else_Chain
{
    public  static void main(String[] args)
    throws IOException
    {
        double grade;
        String s1;

        InputStreamReader isr = new InputStreamReader(System.in); // user's input is taken in as a char
        BufferedReader br = new BufferedReader(isr); // converts user's entered char value into string

        System.out.println("\n                          Calculate Your Letter Grade");
        System.out.print("Enter grade percentage: ");
        s1 = br.readLine(); //HOLDS USERS INPUTTED VALUE IN STRING VARIABLE
        grade = Double.parseDouble(s1); // user's converted string input is converted into double integer value, stored in 'grade' variable


        //DIFFERENT CONDITION STATEMENT OPTIONS DEPENDING ON WHAT USER INPUTS
        System.out.print("\nYour Letter Grade: ");
        if (grade >= 90)
        {
            System.out.println("A");
        }
        else if (grade >= 80 && grade < 90)
        {
            System.out.println("B");
        }
        else if (grade >= 70 && grade < 80)
        {
            System.out.println("C");
        }
        else if (grade >= 60 && grade < 70)
        {
            System.out.println("D");
        }
        else if (grade < 60  && grade >= 0)
        {
            System.out.println("F");
        }
    }
}

/*                         xxxxxxxxxxxxxxxx  NESTED IF SAMPLE PROGRAM TESTED    XXXXXXXXXXXXXXXXXXX
 =============== TEST RUN #1 ==================
 "C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=64144" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" Selection
Enter your age:13
Too young to vote
Process finished with exit code 0

 =============== TEST RUN #2 ==================
 "C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=64177" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" Selection
Enter your age:19
You must be between 18-21.You can vote...
But can't legally buy alcohol

Process finished with exit code 0

 =============== TEST RUN #3 ==================
 "C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=64199" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" Selection
Enter your age:23
You can legally buy alcohol.

Process finished with exit code 0

 =============== TEST RUN #3 (Testing added 'if' / 'else if') ==================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=63187" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" Selection
Enter your age: -44
Invalid age!

Process finished with exit code 0

=============== TEST RUN #4 (Testing added 'if' / 'else if') ==================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=57832" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" Selection
Enter your age:1000
Invalid age!

Process finished with exit code 0





// XXXXXXXXXXXXXXXXXXXXX  IF, ELSE IF, ELSE CHAIN SAMPLE PROGRAM  XXXXXXXXXXXXXXXXX

 =============== TEST RUN #1 ==================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=61112" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" TaxBrackets
How much money did you make in 2017:1000000
You have to pay 39.6% in taxes!!

Process finished with exit code 0

=============== TEST RUN #2 ==================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=56884" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" TaxBrackets
How much money did you make in 2017:417000
You have to pay 35% in taxes!!

Process finished with exit code 0

=============== TEST RUN #3 ==================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=56769" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" TaxBrackets
How much money did you make in 2017:200000
You have to pay 33% in taxes!!

Process finished with exit code 0

=============== TEST RUN #4 ==================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=56786" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" TaxBrackets
How much money did you make in 2017:150000
You have to pay 28% in taxes!!

Process finished with exit code 0

=============== TEST RUN #5 ==================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=56800" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" TaxBrackets
How much money did you make in 2017:50000
You have to pay 25% in taxes!!

Process finished with exit code 0

=============== TEST RUN #6 ==================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=56812" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" TaxBrackets
How much money did you make in 2017:10000
You have to pay 15% in taxes!!

Process finished with exit code 0

=============== TEST RUN #7 ==================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=56824" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" TaxBrackets
How much money did you make in 2017:8000
You have to pay 10% in taxes!!

Process finished with exit code 0

=============== TEST RUN #8 ==================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=56836" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" TaxBrackets
How much money did you make in 2017:0
You made no money

Process finished with exit code 0

=============== TEST RUN #9 (Added 'if' tested)==================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=59412" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" TaxBrackets
How much money did you make in 2017:12000000
You have to pay a lot in taxes!!

Process finished with exit code 0



XXXXXXXXXXXXXXXXXXXXXXXX   Exercise 5.3.1   XXXXXXXXXXXXXXXXXXXXX
=============== TEST RUN #1 ('A' tested)==================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=52418" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" If_ElseIf_Else_Chain

                          Calculate Your Letter Grade
Enter grade percentage: 100

Your Letter Grade: A

Process finished with exit code 0


=============== TEST RUN #2 ('B' tested)==================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=51791" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" If_ElseIf_Else_Chain

                          Calculate Your Letter Grade
Enter grade percentage: 84.5

Your Letter Grade: B

Process finished with exit code 0

=============== TEST RUN #3 ('C' tested)==================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=51804" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" If_ElseIf_Else_Chain

                          Calculate Your Letter Grade
Enter grade percentage: 79

Your Letter Grade: C

Process finished with exit code

=============== TEST RUN #4 ('D' tested)==================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=51818" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" If_ElseIf_Else_Chain

                          Calculate Your Letter Grade
Enter grade percentage: 66.3

Your Letter Grade: D

Process finished with exit code 0

=============== TEST RUN #5 ('F' tested)==================
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=51838" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\IfElseChain\out\production\IfElseChain" If_ElseIf_Else_Chain

                          Calculate Your Letter Grade
Enter grade percentage: 22.4

Your Letter Grade: F

Process finished with exit code 0
 */