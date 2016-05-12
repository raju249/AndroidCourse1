package mooc.vandy.java4android.calculator.logic;

/**
 * Created by Admin1 on 20-Apr-16.
 */
abstract class Operation {

    private int firstNumber;
    private int secondNumber;

    public void setFirstNumber(int number){
        firstNumber = number;
    }

    public void setSecondNumber(int number){
        secondNumber = number;
    }

    public int getFirstNumber(){
        return firstNumber;
    }

    public int getSecondNumber(){
        return secondNumber;
    }
    abstract int getResult();
}
