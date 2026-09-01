import javax.swing.*;
import java.awt.event.*; //this is needed for the event handlers
import java.awt.Container; //need this to add controls
import java.awt.*; //need this for layout manager
import java.util.Random; //need this for random number generation


/*
NAME: Joanne Gomez
COURSE: CSIS24 (JAVA I)
DATE: 05/22/26
PROGRAM NAME: Final

DESCRIPTION:

Write a program to play the game of Tic Tac Toe.

Please submit the program and any images that the program requires in a single zip file.

The program must:
1) Use a GUI: A window with 9 buttons (Hint: use GridLayout(rows, columns) )

2) Use a two dimensional array for the 9 buttons (Hint: JButton b[ ] [ ] )

- use nested for loops to add action listener to the buttons ( b[i][j].addActionListener(buttonsHandler); )

3) Upon a click, a button must change either (Hint: implement ActionListener , use actionPerformed(ActionEvent e)   )
- its text  ...or
- its background image
4) A button can be clicked to be set to X or O only once ( e.g. can't click on a button and change it from X to O )

5) An X is followed by O..., and O is followed by X (e.g. can't have an X button, and then the next is another X button)

6) The program correctly determines the winner (if 3 X's or O's in a diagonal, row, or column)

  HINT: Look at sample program images

*/

public class TicTacToe extends JFrame
{
    // needed variables for game
    private JFrame mainFrame;

    Random rndm = new Random();
    private int randomOneOrZero = rndm.nextInt(2); //random number from 0 - 1 ... BC ONLY 2 PLAYERS ARE NEEDED
    private int xo = randomOneOrZero; //0 for O's, 1 for X's
    private boolean xTurn;    //true = X's turn, false = O's turn
    private int moveCount;    //counts how many moves have been made (0-9)
    private JLabel statusLabel; //shows "X's turn" or "O's turn" at bottom

    //creating an array of buttons b[][]
    //-----------Declare a 2D button array --------------
    private JButton b[][] = {
            {new JButton(""), new JButton(""), new JButton("")}, //ROW 0 --- 00, 01, 02
            {new JButton(""), new JButton(""), new JButton("")}, //ROW 1 --- 10, 11, 12
            {new JButton(""), new JButton(""), new JButton("")}  //ROW 2 --- 20, 21, 22
    };


    public TicTacToe() //constructor
    {
        mainFrame = new JFrame("Tic Tac Toe Game");

        //set whose turn it is based on random number
        if (xo == 1)
        {
            xTurn = true;  //X goes first
        }
        else
        {
            xTurn = false; //O goes first
        }

        moveCount = 0;     //no moves yet


        // ----------- Get the content pane of JFrame ----------------
        Container c = mainFrame.getContentPane();
        c.setLayout(new BorderLayout());

        //create panel for buttons w/ GridLayout (3 rows, 3 columns)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 3));

        //NESTED FOR LOOPS to create buttons && add action listeners
        //outer loop goes through ROWS (i = row index 0,1,2)
        for (int i = 0; i < 3; i++)       //ROWS
        {
            //inner loop goes through COLUMNS (j = column index 0,1,2)
            for (int j = 0; j < 3; j++)   //COLUMNS
            {
                // creating buttons w/ empty text
                b[i][j].setText("");  //buttons start empty (no numbers)
                b[i][j].setFont(new Font("Arial", Font.BOLD, 60)); // this will make front of 'O' && 'X' more readable
                b[i][j].addActionListener(new ButtonHandler()); //add listener
                buttonPanel.add(b[i][j]); //add button to panel
            }
        }

        // -------------- showing user whose turn it is at the bottom ---------------------------------
        if (xTurn)
            statusLabel = new JLabel("X's turn", SwingConstants.CENTER);
        else
            statusLabel = new JLabel("O's turn", SwingConstants.CENTER);

        statusLabel.setFont(new Font("Arial", Font.BOLD, 18)); // appearance of text being displayed

        //*add components to content pane*
        // -------------- Add buttons && label to the content pane -------------------
        c.add(buttonPanel, BorderLayout.CENTER);
        c.add(statusLabel, BorderLayout.SOUTH);

        mainFrame.setSize(400, 450); // size of GUI frame
        mainFrame.setResizable(false);

        //define && register window event handler
        // this is needed for an event handler class (a listener class)
        mainFrame.addWindowListener(new WindowAdapter()
        { // creates an anonymous inner class
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });

        mainFrame.setVisible(true);
    }

    //**** inner class for the button event handler  ****
    //  ---------------Create an instance of the event handler class (a listener class) -------------------
    class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JButton clicked = (JButton) e.getSource(); //which button was clicked

            // ---------- A button can only be clicked once   ---- Make sure to let user know they cant select a spot that is already taken!!!
            //can't click a button that already has a X or O ^^^^^
            String currentText = clicked.getText();
            if (currentText.equals("X") || currentText.equals("O"))
            {
                JOptionPane.showMessageDialog(null, "Spot already taken! Choose another.",
                        "Invalid Move", JOptionPane.WARNING_MESSAGE);
                return; //exit the method, don't process the move
            }

            // ---------------- X is followed by O, && O is followed by X ----------------
            //set X or O on the button depending on whose turn it is
            if (xTurn)  //X's turn
            {
                clicked.setText("X"); //change button text to X
                statusLabel.setText("O's turn"); //next turn is O
            }
            else        //O's turn
            {
                clicked.setText("O"); //change button text to O
                statusLabel.setText("X's turn"); //next turn is X
            }

            moveCount++;  //increment move counter

            //  ---------------- Announcing winner && end of game to user(s) via pop up--------------------
            //(3 X's or O's in a row, column, or diagonal)
            if (checkWinner())
            {
                String winner = (xTurn ? "X" : "O");
                System.out.println("We have a winner... " + winner + " wins!"); //console output
                JOptionPane.showMessageDialog(null, winner + " wins!",
                        "Game Over", JOptionPane.INFORMATION_MESSAGE);
                resetGame(); //reset the board for another game
                return;
            }

            // ---------------------  check for tie (all 9 squares are filled, none won) -------------------------
            if (moveCount == 9)
            {
                System.out.println("It's a Tie!"); //console output
                JOptionPane.showMessageDialog(null, "It's a Tie!",
                        "Game Over", JOptionPane.INFORMATION_MESSAGE);
                resetGame(); //reset the board for another game
                return;
            }

            //switch turns (X becomes O, O becomes X)
            //this toggles xTurn from true to false or false to true
            xTurn = !xTurn;
        }
    } //end of inner class

    //--------------------- CHECKING IF THERE'S A WINNER-------------------------
    //checks all possible winning combinations: 3 rows, 3 columns, 2 diagonals
    private boolean checkWinner()
    {
        String s = (xTurn ? "X" : "O");  //current player's symbol

        //CHECK ROWS (3 in a row horizontally)
        //check row 0 (top row): b[0][0], b[0][1], b[0][2]
        //check row 1 (middle row): b[1][0], b[1][1], b[1][2]
        //check row 2 (bottom row): b[2][0], b[2][1], b[2][2]
        for (int i = 0; i < 3; i++)
        {
            if (b[i][0].getText().equals(s) &&
                    b[i][1].getText().equals(s) &&
                    b[i][2].getText().equals(s))
                return true; //winner found in a row
        }

        //CHECK COLUMNS (3 in a row vertically)
        //check column 0 (left column): b[0][0], b[1][0], b[2][0]
        //check column 1 (middle column): b[0][1], b[1][1], b[2][1]
        //check column 2 (right column): b[0][2], b[1][2], b[2][2]
        for (int j = 0; j < 3; j++)
        {
            if (b[0][j].getText().equals(s) &&
                    b[1][j].getText().equals(s) &&
                    b[2][j].getText().equals(s))
                return true; //winner is found in a column
        }

        //CHECK DIAGONAL (top-left to bottom-right)
        //positions: b[0][0], b[1][1], b[2][2]
        if (b[0][0].getText().equals(s) &&
                b[1][1].getText().equals(s) &&
                b[2][2].getText().equals(s))
            return true; //winner is found in main diagonal

        //CHECK DIAGONAL (top-right to bottom-left)
        //positions: b[0][2], b[1][1], b[2][0]
        if (b[0][2].getText().equals(s) &&
                b[1][1].getText().equals(s) &&
                b[2][0].getText().equals(s))
            return true; //winner is found in other diagonal

        return false;  //no winner yet (game continues)
    }

    //--------------FUNCTION WHICH RESET THE GAME FOR ANOTHER ROUND-----------
    //clears the board
    private void resetGame()
    {
        //clears all buttons (remove X and O from the board)
        //loops through all rows && columns
        for (int i = 0; i < 3; i++)       //ROWS
        {
            for (int j = 0; j < 3; j++)   //COLUMNS
            {
                b[i][j].setText("");  //set button text back to empty
            }
        }

        //reset game variables to starting values
        //generates new random starting player for the next game
        randomOneOrZero = rndm.nextInt(2); //get new random number 0 or 1
        xo = randomOneOrZero; //0 for O's, 1 for X's

        if (xo == 1)
            xTurn = true; //X goes first
        else
            xTurn = false; //O goes first

        moveCount = 0; //reset move counter

        if (xTurn)
            statusLabel.setText("X's turn");
        else
            statusLabel.setText("O's turn");
    }

    public static void main(String[] args)  // main function
    {
        new TicTacToe();
        // the constructor for the TicTacToe class (above) is automatically called.....GAME STARTS
    }
}

/*
==== TEST RUN #1 ======
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=51258" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W13 Final Project\Final\out\production\Final" TicTacToe
We have a winner... O wins!
We have a winner... O wins!
We have a winner... X wins!
It's a Tie!

Process finished with exit code 0

=== TEST RUN #2 == DIAGONALS TESTED
"C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=49767" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\joann\Desktop\CSIS24-JAVA I\W13 Final Project\Final\out\production\Final" TicTacToe
We have a winner... O wins!
We have a winner... X wins!

Process finished with exit code 0
 */