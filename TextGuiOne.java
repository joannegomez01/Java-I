import javax.swing.*;
import java.awt.event.*;
import java.awt.Container; //need this to add controls
import java.awt.*; //need this for layout manager

/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 05/22/26

PROGRAM NAME:  TextGuiOne

DESCRIPTION:

Sample program
*/

public class TextGuiOne extends JFrame
{
    private JFrame mainFrame;
    private JButton messageButton;
    private JButton clearButton;
    private JButton exitButton;
    private JTextField tfield;

    public TextGuiOne() //a constructor
    {
        mainFrame = new JFrame("The hello Application - Ver.2.0");

        //create all components
        messageButton = new JButton("Message");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");
        tfield = new JTextField("Hello World!");

        //get the content pane
        Container c = mainFrame.getContentPane();

        //When not explicitly specified,
        //the default Layout manager for a JFrame container is BorderLayout

        //add the components to the ContentPane
        c.add(tfield, BorderLayout.NORTH);
        c.add(messageButton, BorderLayout.WEST);
        c.add(clearButton, BorderLayout.CENTER);
        c.add(exitButton, BorderLayout.EAST);

        //create accelerator keys
        messageButton.setMnemonic('m');
        clearButton.setMnemonic('c');
        exitButton.setMnemonic('x');

        mainFrame.setSize(300,150);

        //define and register window event handler
        mainFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });

        mainFrame.setVisible(true);
    }

    public static void main(String args[])
    {
        new TextGuiOne(); //instantiate a GUI object
    }
}
/*
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=59186" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W10 GUI part 2 and Javadoc\TextGuiOne\out\production\TextGuiOne" TextGuiOne

Process finished with exit code 0

 */