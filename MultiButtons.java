import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;  // need this to add controls
import java.awt.*;    // need this for layout manager
/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 04/04/26

PROGRAM NAME:  MultiButtons


DESCRIPTION:

Sample program
*/

// Download Eclipse, type up this program,
// move your mouse over the different methods
// You will get very clear explanations,
// about what the different components are, and how they can be used



public class MultiButtons extends JFrame // has access to all of the public and protected
//methods that are available to the JFrame class, such as setSize()
{
    private JFrame mainFrame;
    private JButton messageButton;
    private JButton clearButton;
    private JButton exitButton;

    public MultiButtons() // constructor
    {
        mainFrame = new JFrame("The Hello Application - Ver 1.0");

        //create the button objects
        messageButton = new JButton("Message");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");


        //get the content pane & specify layout manager
        Container c = mainFrame.getContentPane();
        c.setLayout(new FlowLayout());


        //add the button to the ContentPane
        c.add(messageButton);
        c.add(clearButton);
        c.add(exitButton);


        //create accelerator keys
        messageButton.setMnemonic('m');
        clearButton.setMnemonic('c');
        exitButton.setMnemonic('x');

        mainFrame.setSize(300,100);

        //define and register window event handler
        mainFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });

        //mainFrame.show(); //Deprecated. As of JDK version 1.5, replaced by setVisible(boolean).
        //javac -Xlint MultiButtons.java to show where warning is
        mainFrame.setVisible(true);
    }

    public static void main(String args[])
    {
        MultiButtons app;   //declare a MultiButtons variable
        app = new MultiButtons();
    }
}


/*
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=62101" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W10 GUI part 2 and Javadoc\MultiButtons\out\production\MultiButtons" MultiButtons

Process finished with exit code 0

 */