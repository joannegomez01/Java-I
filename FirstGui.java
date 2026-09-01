import javax.swing.*;

/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 04/28/26

PROGRAM NAME:  FirstGui


DESCRIPTION: Copied sample program
*/




public class FirstGui
{
//private static JFrame mainFrame;//declare a JFrame reference variable

    public static void main(String [] args)
    {
        JFrame mainFrame; //declare a JFrame reference variable
        mainFrame = new JFrame("First GUI Window");//instantiate a JFrame object

        mainFrame.setSize(300,150);//set the width and height in pixels
        mainFrame.setVisible(true);//make the frame visible
    }
}

/*
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=61561" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W9 GUI and Eclipse IDE\FirstGui\out\production\FirstGui" FirstGui

Process finished with exit code 130

 */