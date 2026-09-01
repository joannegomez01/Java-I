import javax.swing.*;

/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 04/28/26

PROGRAM NAME:  FirstWindow


DESCRIPTION: Copied sample program
*/
import javax.swing.*;

// "extends" means that our FirstWindow class has access to all of the public and protected
// methods that are available to the JFrame class, such as setSize(), and show()
public class FirstWindow extends JFrame
{
    private JFrame mainFrame;
    // a constructor...has the same name as the class, and has no return type
    public FirstWindow()
    {
        mainFrame = new JFrame ("First GUI Window");

        mainFrame.setSize(300,150);
        mainFrame.setVisible(true);
    }

    public static void main (String [] args)
    {
        new FirstWindow();// when this statement is carried out,
        // the constructor for the FirstWindow class (above) is automatically called
    }
} //end of class


/*
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=63726" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W9 GUI and Eclipse IDE\FirstWindow\out\production\FirstWindow" FirstWindow

Process finished with exit code 130

 */