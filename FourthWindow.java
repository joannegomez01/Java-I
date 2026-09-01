import javax.swing.*;
import java.awt.event.*; //this is needed for the event handlers

/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 04/28/26

PROGRAM NAME:  FourthWindow


DESCRIPTION: Copied sample program
*/


public class FourthWindow extends JFrame
{
    private JFrame mainFrame;

    public FourthWindow() //a constructor
    {
        mainFrame = new JFrame("Fourth GUI Window");
        mainFrame.setSize(300,150);
        mainFrame.setVisible(true);

        //create and register the handler in one statement
        //!!!Phase 2 - Step3: register(activate) the handler

        mainFrame.addWindowListener(new WinHandler());
    }

    //an inner class to handle window events
    class WinHandler extends WindowAdapter
    {
        public void windowClosing(WindowEvent e) {System.exit(0);} //close program
    } //end of inner class


    public static void main(String[] args)
    {
        new FourthWindow(); //automatically calls the constructor
    }

} //end of GUI class


/*
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=56626" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W9 GUI and Eclipse IDE\FourthWindow\out\production\FourthWindow" FourthWindow

Process finished with exit code 0

 */