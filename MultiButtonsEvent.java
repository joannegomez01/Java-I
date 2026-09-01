import javax.swing.*;
import java.awt.event.*;
import java.awt.Container; //need this to add controls
import java.awt.*;    //need this for layout manager

/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 05/22/26

PROGRAM NAME:  MultiButtonsEvent


DESCRIPTION:

Sample program
*/

public class MultiButtonsEvent extends JFrame
{
    private JFrame mainFrame;
    private JButton messageButton;
    private JButton clearButton;
    private JButton exitButton;

    public MultiButtonsEvent() //constructor
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

        //create and register the button event handlers
        MessageButtonHandler mhandler = new MessageButtonHandler(); //instantiate a handler
        messageButton.addActionListener(mhandler);    //register the handler

        ClearButtonHandler chandler = new ClearButtonHandler(); //instantiate a handler
        clearButton.addActionListener(chandler);    //register the handler

        ExitButtonHandler ehandler = new ExitButtonHandler();    //instantiate a handler
        exitButton.addActionListener(ehandler);    //register the handler

        //define and register window event handler
        mainFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });

        //mainFrame.show(); //Deprecated. As of JDK version 1.5, replaced by setVisible(boolean).
        //javac -Xlint MultiButtons.java to show where warning is
        mainFrame.setVisible(true);

    }

    //NOTE:
    /*
    When you "extend" a class, any methods that you write with the same name will override the parent class' method.

    When you "implement" a class, the parent class had nothing more than the method definition (i.e. there was no code in the method) so, in effect, all you are doing is adding your own method code to what was just a method declaration and therefore not overriding the parent methods.

    "implements" is for interfaces - classes with pre-defined EMPTY methods
    "extends" is for classes.

    What is Interface and "implements"?
    https://docs.google.com/document/d/1iTFIzb1x6mBrII6r4vRKQN8HDAufeZ9SvbGBdo6Za2O/edit
    */

    //inner classes for the button event handlers---
    class MessageButtonHandler implements ActionListener   //creating a class that will perform as a WindowListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, "Message Button was Clicked",
                    "Event Handler Message",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    class ClearButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, "Clear Button was Clicked", "Event Handler Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    class ExitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, "Exit Button was Clicked", "Event Handler Message", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
    //end of inner classes---

    public static void main(String args[])
    {
        MultiButtonsEvent app;   //declare a MultiButtons variable
        app = new MultiButtonsEvent();
    }
}
/*
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=61781" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W10 GUI part 2 and Javadoc\MultiButtonsEvents\out\production\MultiButtonsEvents" MultiButtonsEvent

Process finished with exit code 0

 */

