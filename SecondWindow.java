import javax.swing.*;
import java.awt.event.*; //this is needed for the event handlers

/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 04/28/26

PROGRAM NAME:  SecondWindow


DESCRIPTION: Copied sample program
*/


public class SecondWindow extends JFrame
    {
        private JFrame mainFrame;

        public SecondWindow() //a constructor
        {
            mainFrame = new JFrame("Second GUI Window");
            mainFrame.setSize(300,150);
            mainFrame.setVisible(true);


            WinHandler handler = new WinHandler(); //!!Phase 2 - Step2: create an event handler
            mainFrame.addWindowListener(handler); //!!Phase 2 - Step3: register(activate) the handler
    }

        public static void main(String[] args)
        {
            new SecondWindow(); //automatically calls the constructor
        }

        //!!!Phase 3 - Step 1: define a listener class to handle window events
        class WinHandler implements WindowListener //creating a class that will perform as a WindowListener
                //see page 496, Table 9.7 for GUI Component Events Types, can have
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
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=64110" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W9 GUI and Eclipse IDE\SecondWindow\out\production\SecondWindow" SecondWindow

Process finished with exit code 0

 */