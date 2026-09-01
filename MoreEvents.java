import javax.swing.*;
import java.awt.event.*; //this is needed for the event handlers
import java.awt.Container; //need this to add controls
/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 04/28/26

PROGRAM NAME:  MoreEvents

DESCRIPTION:

Exercise 9.4.8: Write, compile and run a Java program that prints your name and address in a message box when the user clicks a JButton object.
The JButton's caption should be Your Name and Address (you can put a fake address).
 In addition, the button should use the letter N as a keyboard accelerator key and provide a ToolTip of your choosing.
HINT: Use ButtonGuithree.java Links to an external site.as an example.
 */

public class MoreEvents extends JFrame
{
    private JFrame mainFrame;
    private JButton infoButton; //Phase 1 - Step 1 (part 1): Declare a button variable name

    public MoreEvents() // constructor
    {
        mainFrame = new JFrame("Name and Address Program");

        //create a button object
        //Phase 1 - Step 1 (part 2): Instantiate a button, and put the text "Your Name and Address" in it
        infoButton = new JButton("Your Name and Address");

        //get the content pane
        //Phase 1 - Step 2 (part 1): Get the content pane of JFrame
        Container c = mainFrame.getContentPane();

        //add the button to the Container
        //Phase 1 - Step 2 (part 2): Add the button to the content pane of JFrame
        c.add(infoButton);

        //create a ToolTip, when you mouse over the button, the text will appear
        infoButton.setToolTipText("Click to display my name and address");

        //this is a shortcut, if you press ALT + N, the button will be pressed
        infoButton.setMnemonic('N');

        mainFrame.setSize(350,150);

        //define and register window event handler
        // Phase 2 - Step 1: Write the code for an event handler class (a listener class)
        mainFrame.addWindowListener(new WindowAdapter()
        { //anonymous class!!
            public void windowClosing(WindowEvent e) {System.exit(0); }
        });

        //create and register the button event handler
        //Phase 2 - Step 2: Create an instance of the event handler class (a listener class)
        ButtonHandler bhandler = new ButtonHandler();
        //Phase 2 - Step 3: Register the handler class (a listener class/object)
        infoButton.addActionListener(bhandler);

        mainFrame.setVisible(true);
    }

    //inner class for the button event handler
    class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null,   // Breaking Bad reference
                    "Walter Hartwell White\n" +
                            "308 Negra Arroyo Lane\n" +
                            "Albuquerque, New Mexico, 87104",
                    "My Name and Address",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    } //end of inner class

    public static void main(String[] args)
    {
        new MoreEvents(); //automatically calls the constructor
        // the constructor for the NameAddressButton class (above) is automatically called
    }
} //end of NameAddressButton class


/*
====TEST RUN #2 MANUAL CLICKING ====
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=58365" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W9 GUI and Eclipse IDE\MoreEvents\out\production\MoreEvents" MoreEvents

Process finished with exit code 0

===TEST RUN #2 USING ALT + N =========
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=51096" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W9 GUI and Eclipse IDE\MoreEvents\out\production\MoreEvents" MoreEvents

Process finished with exit code 0


 */