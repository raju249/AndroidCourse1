package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract extends Operation{
    // TODO -- start your code here

    public Subtract(int firstNumber,int secondNumber){
        setFirstNumber(firstNumber);
        setSecondNumber(secondNumber);
    }

    public int getResult(){
        return getFirstNumber() - getSecondNumber();
    }
}
