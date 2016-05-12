package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add extends Operation{
    // TODO -- start your code here

    public Add(int firstNumber, int secondNumber){
        setFirstNumber(firstNumber);
        setSecondNumber(secondNumber);
    }

    public int getResult(){
        return getFirstNumber() + getSecondNumber();
    }
}
