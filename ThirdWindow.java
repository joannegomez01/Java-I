import javax.swing.*;
import java.awt.event.*; //this is needed for the event handlers


/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 04/28/26

PROGRAM NAME:  ThirdWindow


DESCRIPTION: Copied sample program
*/

public class ThirdWindow extends JFrame
{
    private JFrame mainFrame;

    public ThirdWindow() //a constructor
    {
        mainFrame = new JFrame("Third GUI Window");
        mainFrame.setSize(300,150);
        mainFrame.setVisible(true);

        //create and register the handler in one statement
        mainFrame.addWindowListener(new WinHandler());
        //!!!Phase 2 - Step3: register(activate) the handler

    }

    public static void main(String[] args)
    {
        new ThirdWindow(); //automatically calls the constructor
    }

}
//extend an adapter class to handle window events
class WinHandler extends WindowAdapter
{
    public void windowClosing(WindowEvent e) {System.exit(0);}//close program
}//end of listener class

/*
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=56431" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W9 GUI and Eclipse IDE\ThirdWindow\out\production\ThirdWindow" ThirdWindow

Process finished with exit code 0

 */