import javax.swing.*;
import java.awt.event.*; //this is needed for the event handlers
import java.awt.Container; //need this to add controls
import java.awt.*; //need this for layout manager

/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 05/22/26

PROGRAM NAME:  MultipleComponents

DESCRIPTION:
Exercise 10.1.6:

Write a Java program that creates a GUI having the following properties:

JFrame with a name mainFrame, caption "Messages", and layout FlowLayout

Two JButton objects with names cmdGood and cmdBad, captions "Good" and "Bad",
and mnemonics "G" and "B"

Add individual event handlers to the program above,
so that when the user clicks the "Good" button the message "Today is a good day" shows,
and if the "Bad" button is clicked, the message "Today is a bad day" shows.

*/
public class MultipleComponents extends JFrame
{
    private JFrame mainFrame;
    private JButton cmdGood;  //declare Good button variable name
    private JButton cmdBad;   //declare Bad button variable name

    public MultipleComponents() //constructor
    {
        mainFrame = new JFrame("Messages");

        //create the button objects
        //Phase 1 - Step 1 (part 2): Instantiate buttons with captions
        cmdGood = new JButton("Good");
        cmdBad = new JButton("Bad");

        //get the content pane & specify layout manager
        //Phase 1 - Step 2 (part 1): Get the content pane of JFrame
        Container c = mainFrame.getContentPane();
        c.setLayout(new FlowLayout());

        //add the buttons to the ContentPane
        //Phase 1 - Step 2 (part 2): Add buttons to the content pane
        c.add(cmdGood);
        c.add(cmdBad);

        //create accelerator keys (mnemonics)
        cmdGood.setMnemonic('G');  //ALT + G will press Good button
        cmdBad.setMnemonic('B');   //ALT + B will press Bad button

        mainFrame.setSize(300,100);

        //define and register window event handler
        // Phase 2 - Step 1: Write the code for an event handler class
        mainFrame.addWindowListener(new WindowAdapter()
        { //anonymous class!!
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });

        //create and register the button event handlers
        //Phase 2 - Step 2: Create an instance of the event handler class
        GoodButtonHandler ghandler = new GoodButtonHandler(); //instantiate a handler
        cmdGood.addActionListener(ghandler);    //register the handler

        BadButtonHandler bhandler = new BadButtonHandler(); //instantiate a handler
        cmdBad.addActionListener(bhandler);    //register the handler

        mainFrame.setVisible(true);
    }

    //inner class for the Good button event handler
    class GoodButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //display message when Good button is clicked
            JOptionPane.showMessageDialog(null, "Today is a good day",
                    "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    } //end of inner class

    //inner class for the Bad button event handler
    class BadButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //display message when Bad button is clicked
            JOptionPane.showMessageDialog(null, "Today is a bad day",
                    "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    } //end of inner class

    public static void main(String[] args)
    {
        new MultipleComponents(); //automatically calls the constructor
    }
} //end of MultipleComponents class