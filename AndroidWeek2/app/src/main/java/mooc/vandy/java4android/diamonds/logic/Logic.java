package mooc.vandy.java4android.diamonds.logic;

import android.util.Log;
import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

        // TODO -- add your code here


        printHorizontalBound(size);
		  

        for(int i = 0; i < size - 1; i++) {
            printLine(i, '/', '\\', size);
        }
		  

        printLine(size - 1, '<', '>', size);
		  

        for(int i = size; i < 2 * size - 1; i++) {
            printLine(i, '\\', '/', size);
        }
		  
		
        printHorizontalBound(size);
    }

     // TODO -- add your code here

    private void printLine(int lineNum, char openSym, char closeSym, int size) {
        int spacesNum = Math.abs(size - 1 - lineNum);
        mOut.print("|");
        printSymbol(' ', spacesNum);
        mOut.print(openSym);
        printSymbol((lineNum % 2 == 0) ? '=' : '-', 2 * (size - spacesNum - 1));
        mOut.print(closeSym);
        printSymbol(' ', spacesNum);
        mOut.print("|");
        mOut.print("\n");
    }


    private void printHorizontalBound(int size) {
        mOut.print("+");
        printSymbol('-', 2 * size);
        mOut.println("+");
    }


    private void printSymbol(char c, int n) {
        for (int i = 0; i < n; i++) {
            mOut.print(c);
        }
    }
}
