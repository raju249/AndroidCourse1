package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here

        switch (operation){

            case 1: Add add = new Add(argumentOne,argumentTwo);
                    mOut.print(Integer.toString(add.getResult()));
                    break;

            case 2: Subtract sub = new Subtract(argumentOne,argumentTwo);
                    mOut.print(Integer.toString(sub.getResult()));
                    break;

            case 3: Multiply multiply = new Multiply(argumentOne,argumentTwo);
                    mOut.print(Integer.toString(multiply.getResult()));
                    break;

            case 4: Divide divide = new Divide(argumentOne,argumentTwo);
                    int ans = divide.getResult();
                    if(ans == 0){
                        mOut.print("Invalid division!!");
                    }
                    else{
                        mOut.print(Integer.toString(divide.getResult()) + " R: " +
                                    Integer.toString(divide.getRemainder()));
                    }
                    break;
        }
    }
}
