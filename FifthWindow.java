import javax.swing.*;
import java.awt.event.*;//this is needed for the event handlers

/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 04/28/26

PROGRAM NAME:  FifthWindow


DESCRIPTION: Copied sample program
*/

public class FifthWindow extends JFrame
{

    private JFrame mainFrame;

    public FifthWindow()//a constructor
    {

        mainFrame = new JFrame("Fifth GUI Window");
        mainFrame.setSize(300,150);
        mainFrame.setVisible(true);

//create and register the handler in one statement
//using an anonymous inner class
        mainFrame.addWindowListener(new WindowAdapter()
        {//anonymous class!!
            public void windowClosing(WindowEvent e) {System.exit(0); }
        });
    }

    public static void main(String[] args)
    {
        new FifthWindow();
    }

}//end of GUI class


/*
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=53674" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W9 GUI and Eclipse IDE\FifthWindow\out\production\FifthWindow" FifthWindow

Process finished with exit code 0

 */