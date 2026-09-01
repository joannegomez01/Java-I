import javax.swing.*;
import java.awt.event.*; // needed for the event handlers
/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 04/28/26

PROGRAM NAME:  WindowClosingEvent

DESCRIPTION:
Exercise 9.3.8: Write a Java program that constructs a window having the

title "The Hello Application - Ver. 1.0" .

Make sure that your program contains a window closing event object that

correctly closes the window when the Close (X) button is clicked
*/

public class WindowClosingEvent extends JFrame
{
    private JFrame mainFrame;

    public WindowClosingEvent() //a constructor
    {
        mainFrame = new JFrame("The Hello Application - Ver. 1.0"); // display wanted
        mainFrame.setSize(300,150);
        mainFrame.setVisible(true);

        WinHandler handler = new WinHandler(); //create an event handler
        mainFrame.addWindowListener(handler); //register the handler
    }

    public static void main(String[] args)
    {
        new WindowClosingEvent(); //automatically calls the constructor from main function
    }

    // define a listener class to handle window events
    class WinHandler implements WindowListener
    {
        public void windowClosing(WindowEvent e) {System.exit(0);}//close program
        public void windowClosed(WindowEvent e) { }//these methods are required
        public void windowOpened(WindowEvent e) { }//by any listener class that is
        public void windowIconified(WindowEvent e) { }//implemented as a WindowListener
        public void windowDeiconified(WindowEvent e) { }//they are required
        public void windowActivated(WindowEvent e) { }//even if we are not
        public void windowDeactivated(WindowEvent e) { }//interested in using them
    }//end of listener class
}

/*
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=56711" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W9 GUI and Eclipse IDE\WindowClosingEvent\out\production\WindowClosingEvent" WindowClosingEvent

Process finished with exit code 0

 */