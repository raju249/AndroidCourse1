package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply extends Operation{
    // TODO -- start your code here

    public Multiply(int firstNum,int secondNum){
        setFirstNumber(firstNum);
        setSecondNumber(secondNum);
    }

    public int getResult(){
        return getFirstNumber()*getSecondNumber();
    }

}
