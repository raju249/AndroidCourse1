package mooc.vandy.java4android.calculator.logic;


/**
 * Perform the Divide operation.
 */
public class Divide extends Operation{
    // TODO -- start your code here

    public Divide(int firstNumber, int secondNumber){
        setFirstNumber(firstNumber);
        setSecondNumber(secondNumber);
    }

    public int getResult(){
        try{
            return getFirstNumber()/getSecondNumber();
        }
        catch (Exception e){
                return 0;
        }
    }

    public int getRemainder(){
        return getFirstNumber()%getSecondNumber();
    }
}
