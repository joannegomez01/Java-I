import javax.swing.*;
import java.awt.event.*; //this is needed for the event handlers
import java.awt.Container; //need this to add controls
import java.awt.*; //need this for layout manager
/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 05/22/26

PROGRAM NAME:  TextFieldComponent

DESCRIPTION:
Exercise 10.2.4:

Write a Java application that has three buttons and a text field.
Clicking the first button shows the message "See no evil" in the text field,
while clicking the second and third buttons shows the message "Hear no evil" and "Speak no evil" in the text field.

*/

public class TextFieldComponent extends JFrame
{
    private JFrame mainFrame;
    private JButton btnSeeNoEvil;    //declare first button variable name
    private JButton btnHearNoEvil;   //declare second button variable name
    private JButton btnSpeakNoEvil;  //declare third button variable name
    private JTextField messageField; //declare text field variable name

    public TextFieldComponent() //constructor
    {
        mainFrame = new JFrame("Three Messages Application");

        //---------------create the button objects-----------
        //Phase 1 - Step 1 (part 2): Instantiate buttons with captions
        btnSeeNoEvil = new JButton("See No Evil");
        btnHearNoEvil = new JButton("Hear No Evil");
        btnSpeakNoEvil = new JButton("Speak No Evil");

        //------------create the text field object------------
        messageField = new JTextField(20);  //20 columns wide
        messageField.setEditable(false);    //user cannot type in it

        //--------------get the content pane & specify layout manager-----------
        //Phase 1 - Step 2 (part 1): Get the content pane of JFrame
        Container c = mainFrame.getContentPane();
        c.setLayout(new FlowLayout());

        //add the components to the ContentPane
        //Phase 1 - Step 2 (part 2): Add buttons and text field to the content pane
        c.add(btnSeeNoEvil);
        c.add(btnHearNoEvil);
        c.add(btnSpeakNoEvil);
        c.add(messageField);

        //-------------create accelerator keys (mnemonics)-------------
        btnSeeNoEvil.setMnemonic('S');   //ALT + S will press See No Evil button
        btnHearNoEvil.setMnemonic('H');  //ALT + H will press Hear No Evil button
        btnSpeakNoEvil.setMnemonic('P'); //ALT + P will press Speak No Evil button

        mainFrame.setSize(450,150);

        //------define and register window event handler-----------
        // Phase 2 - Step 1: Write the code for an event handler class (a listener class)
        mainFrame.addWindowListener(new WindowAdapter()
        { //anonymous class!!
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });

        //--------------create and register the button event handlers-------
        //Phase 2 - Step 2: Create an instance of the event handler class (a listener class)
        SeeNoEvilHandler seeHandler = new SeeNoEvilHandler(); //instantiate a handler
        btnSeeNoEvil.addActionListener(seeHandler);    //register the handler

        HearNoEvilHandler hearHandler = new HearNoEvilHandler(); //instantiate a handler
        btnHearNoEvil.addActionListener(hearHandler);    //register the handler

        SpeakNoEvilHandler speakHandler = new SpeakNoEvilHandler(); //instantiate a handler
        btnSpeakNoEvil.addActionListener(speakHandler);    //register the handler

        mainFrame.setVisible(true);
    }

    //-----------------inner classes for the button event handlers---
    //inner class for See No Evil button event handler
    class SeeNoEvilHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //display message in text field when first button is clicked
            messageField.setText("See no evil");
        }
    } //end of inner class

    //                      --------- OPTIONS ---------
    //inner class for Hear No Evil button event handler
    class HearNoEvilHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //display message in text field when second button is clicked
            messageField.setText("Hear no evil");
        }
    } //end of inner class

    //inner class for Speak No Evil button event handler
    class SpeakNoEvilHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //display message in text field when third button is clicked
            messageField.setText("Speak no evil");
        }
    } //end of inner class


    public static void main(String[] args)
    {
        new TextFieldComponent(); //automatically calls the constructor
    }
} //end of class


/*
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=49429" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W10 GUI part 2 and Javadoc\TextFieldComponent\out\production\TextFieldComponent" TextFieldComponent

Process finished with exit code 0

 */