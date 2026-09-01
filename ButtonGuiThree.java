import javax.swing.*;
import java.awt.event.*; //this is needed for the event handlers
import java.awt.Container; //need this to add controls
/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 04/28/26

PROGRAM NAME:  ButtonGuiThree

DESCRIPTION: Copied sample program
*/

public class ButtonGuiThree extends JFrame
{
    private JFrame mainFrame;
    private JButton firstB; //Phase 1 - Step 1 (part 1): Declare a button variable name
    public ButtonGuiThree() //a constructor
    {
        mainFrame = new JFrame("Example (3) of a GUI with a button");
        //create a button object
        //Phase 1 - Step 1 (part 2): Instantiate a button, and put the text "Press me" in it (part 2)
        firstB = new JButton("Press me");
        //get the content pane
        //Phase 1 - Step 2 (part 1): Get the content pane of JFrame
        Container c = mainFrame.getContentPane();
        //add the button to the Container
        //Phase 1 - Step 2 (part 2): Add the button to the content pane of JFrame
        c.add(firstB);
        //create a ToolTip, when you mouse over the button, the text "This is a button" will appear
        //this is a shortcut, if you press ALT + p, the button will be pressed
        firstB.setToolTipText("This is a button");
        firstB.setMnemonic('p');
        mainFrame.setSize(300,150);
        //define and register window event handler
        // Phase 2 - Step 1: Write the code for an event handler class (a listener class)
        mainFrame.addWindowListener(new WindowAdapter()
        { //anonymous class!!
            public void windowClosing(WindowEvent e) {System.exit(0); }
        });

        //create and register the button event handler
        //Phase 2 - Step 2: Create an instance of the event handler class (a listener class)
        ButEventHandler bhandler = new ButEventHandler();
        //Phase 2 - Step 3: Register the handler class (a listener class/object)
        firstB.addActionListener(bhandler);

        mainFrame.setVisible(true);
    }

    //inner class for the button event handler
    class ButEventHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null,"Button was Pressed", "Event Handler Message", JOptionPane.INFORMATION_MESSAGE);
        }
    } //end of inner class

    public static void main(String[] args)
    {
        new ButtonGuiThree(); //automatically calls the constructor
    }
} //end of Button GUI Three class

/*
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=49791" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W9 GUI and Eclipse IDE\ButtonGuiThree\out\production\ButtonGuiThree" ButtonGuiThree

Process finished with exit code 0

 */