package mooc.vandy.java4android.gate.logic;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized.
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
    public static final String TAG =
        Logic.class.getName();

    /**
    * This is the variable that stores our OutputInterface instance.
    * <p>
    * This is how we will interact with the User Interface
    * [MainActivity.java].
    */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance
     * (which implements [OutputInterface]) to 'out'
     */
    public Logic(OutputInterface out) {
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labelled 'Process...' is pressed.
     */
    @Override
    public void process() {
        Gate gate = new Gate();
        mOut.println("Gate toString: " + gate.toString());
        mOut.println("Gate isLocked: " + gate.isLocked());
        gate.open(Gate.OUT);
        mOut.println("Gate isLocked: " + gate.isLocked());
        gate.open(Gate.IN);
        mOut.println("Gate toString: " + gate.isLocked());
        gate.setSwing(Gate.IN);
        mOut.println("Gate toString: " + gate.toString());
        gate.setSwing(Gate.OUT);
        mOut.println("Gate toString: " + gate.toString());
        gate.getSwingDirection();
        mOut.println("Gate getSwingDirection: " + gate.getSwingDirection());
        gate.close();
        mOut.println("Gate getSwingDirection: " + gate.toString());
    }
}
