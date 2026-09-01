import java.text.*;    //need this for formatting
import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.*;

/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 05/22/26

PROGRAM NAME:  ConvertTempOne

DESCRIPTION:

Sample program
*/

public class ConvertTempOne extends JFrame
{
    private JFrame mainFrame;
    private JButton convertButton;
    private JButton exitButton;
    private JTextField fahrField;
    private JTextField celsField;
    private JLabel fahrLabel;
    private JLabel celsLabel;

    public ConvertTempOne() //constructor
    {
        mainFrame = new JFrame("Temperature Conversion");

        //create all components
        convertButton = new JButton("Convert to Celsius");
        exitButton = new JButton("Exit");
        fahrLabel = new JLabel("Enter a Fahrenheit temp:");
        celsLabel = new JLabel("The corresponding Celsius value is:");
        fahrField = new JTextField(5);
        celsField = new JTextField(5);

        //get the content pane
        Container c = mainFrame.getContentPane();
        //set the layout manager
        c.setLayout(new FlowLayout());

        //add the components to the ContentPane
        c.add(fahrLabel);
        c.add(fahrField);
        c.add(celsLabel);
        c.add(celsField);
        c.add(convertButton);
        c.add(exitButton);

        //create accelerator/shortcut keys
        convertButton.setMnemonic('c');
        exitButton.setMnemonic('x');

        mainFrame.setSize(350,150);

        //define and register exit window event handler
        mainFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });

        //create and register the button event handlers
        ConvertButtonHandler handler = new ConvertButtonHandler(); //instantiate a handler
        convertButton.addActionListener(handler);    //register the handler

        ExitButtonHandler ehandler = new ExitButtonHandler();    //instantiate a handler
        exitButton.addActionListener(ehandler);    //register the handler

        //mainFrame.show(); //Deprecated. As of JDK version 1.5, replaced by setVisible(boolean).
        //javac -Xlint MultiButtons.java    to show where warning is
        mainFrame.setVisible(true);
    }

    //inner classes for the button event handlers---
    class ConvertButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            DecimalFormat num = new DecimalFormat("###.##");
            String instring;
            double invalue, outvalue;

            instring = fahrField.getText();    //read the input value
            invalue = Double.parseDouble(instring);    //convert to a double
            outvalue = 5.0/9.0 * (invalue - 32.0);
            celsField.setText(num.format(outvalue));   //show the output value
        }
    }

    class ExitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }//end of inner classes---

    public static void main(String args[])
    {
        new ConvertTempOne();
    }
}

/*
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=60019" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W10 GUI part 2 and Javadoc\ConvertTempOne\out\production\ConvertTempOne" ConvertTempOne

Process finished with exit code 0

 */