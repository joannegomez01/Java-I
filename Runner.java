import one.One; // import only class One from package one
import one.four.*; // input all class from package one.four
//  ^^ does not import anything in package one.four.twothree
import one.four.two.*;
import one.four.two.five.Five; // ADDED FOR PART 2

class Runner
{
    public static void  main(String[] args)
    {
        One edin = new One();
        edin.one();

        Four chetiri = new Four();
		chetiri.four();

        Two dva = new Two();
        dva.two();

        Three tri = new Three();
        tri.three();
		
		//Part 2 added
		Five pet = new Five();
		pet.five();
    }
}


/*=================== PART 1================
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\One> javac Runner.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\One> java Runner
one
Four
Two
Three
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\One>

=================== PART 2================
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\One> javac Runner.java
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\One> java Runner
one
Four
Two
Three
Five!
PS C:\Users\joann\Desktop\CSIS24-JAVA I\W5  Selection, Package, Batch file\One>
*/