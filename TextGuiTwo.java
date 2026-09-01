import javax.swing.*;
import java.awt.event.*;
import java.awt.Container; //need this to add controls
import java.awt.*; //need this for layout manager

/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 05/22/26

PROGRAM NAME:  TextGuitwo

DESCRIPTION:

Sample program
*/

public class TextGuiTwo extends JFrame
{
    private JFrame mainFrame;
    private JButton messageButton;
    private JButton clearButton;
    private JButton exitButton;
    private JTextField tField;

    public TextGuiTwo() //a constructor
    {
        mainFrame = new JFrame("The hello Application - Ver.3.0");

        //create all components
        messageButton = new JButton("Message");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");
        tField = new JTextField("Hello World!");

        //get the content pane
        Container c = mainFrame.getContentPane();
        /* When not explicitly specified, the default Layout manager for a JFrame container is BorderLayout */
        //add the components to the ContentPane
        c.add(tField,BorderLayout.NORTH);
        c.add(messageButton,BorderLayout.WEST);
        c.add(clearButton,BorderLayout.CENTER);
        c.add(exitButton,BorderLayout.EAST);

        //create accelerator keys
        messageButton.setMnemonic('m');
        clearButton.setMnemonic('c');
        exitButton.setMnemonic('x');

        mainFrame.setSize(300,150);

        //define and register window event handler
        mainFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });

        //create and register the button event handlers---
        MessageButtonHandler mhandler = new MessageButtonHandler(); //instantiate a handler
        messageButton.addActionListener(mhandler);    //register the handler

        ClearButtonHandler chandler = new ClearButtonHandler();    //instantiate a handler
        clearButton.addActionListener(chandler);    //register the handler

        ExitButtonHandler ehandler = new ExitButtonHandler();    //instantiate a handler
        exitButton.addActionListener(ehandler);    //register the handler
        //end event handlers---

        //mainFrame.show(); //Deprecated. As of JDK version 1.5, replaced by setVisible(boolean).
        //javax.swing.MultiButtons.java to show where warning is
        mainFrame.setVisible(true);
    }

    //inner classes for the button event handlers---
    class MessageButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            tField.setText("Hello World Once Again!");
        }
    }

    class ClearButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            tField.setText(" ");
        }
    }

    class ExitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }//end of inner classes -------------------

    public static void main(String args[])
    {
        new TextGuiTwo();//instantiate a GUI object
    }
}//end of class
/*
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=62315" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W10 GUI part 2 and Javadoc\TextGuiTwo\out\production\TextGuiTwo" TextGuiTwo

Process finished with exit code 0

 */