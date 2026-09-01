import javax.swing.*;
import java.awt.event.*; //this is needed for the event handlers
import java.awt.Container; //need this to add controls

/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 04/28/26

PROGRAM NAME:  FirstButton


DESCRIPTION: Copied sample program
*/
public class firstButton extends JFrame
{
    private JFrame mainFrame;
    private JButton firstB;    //Phase 1 - Step 1 (part 1): Declare a button variable name

    public firstButton() //a constructor
    {
        mainFrame = new JFrame("Example of a GUI with a button");

        //create a button object, put text in it
        //Phase 1 - Step 1 (part 2): Instantiate a button, and put the text "Press me" in it (part 2)
        firstB = new JButton("Press me");
        //get the content pane
        //Phase 1 - Step 2 (part 1): Get the content pane of JFrame
        Container c = mainFrame.getContentPane();

        //add the button to the Container
        //Phase 1 - Step 2 (part 2): Add the button to the content pane of JFrame
        c.add(firstB);

        mainFrame.setSize(300,150);

        //define and register window event handler
        mainFrame.addWindowListener(new WindowAdapter()
        {//anonymous class!!
            public void windowClosing(WindowEvent e) {System.exit(0); }
        });

        mainFrame.setVisible(true);
    }

    public static void main(String[] args)
    {
        new firstButton();//automatically calls the constructor
    }

}//end of Button GUI class


/*
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=64765" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W9 GUI and Eclipse IDE\FirstButton\out\production\FirstButton" firstButton

Process finished with exit code 0

 */