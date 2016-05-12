package mooc.vandy.java4android.gate.logic;

/**
 * @@ Julie, please fill in here.
 */
public class Gate {

    // TODO -- Fill in your code here
    private boolean locked;
    private int swing;
    public static int IN = 1;
    public static int OUT = -1;


    public Gate(){
        locked = true;
        swing = 0;
    }

    public boolean setSwing(int direction){

        if (direction == IN || direction == OUT){
            swing = direction;
            return true;
        }
        return false;
    }

    public boolean open(int direction){

        if (setSwing(direction)){
            locked = false;
            return true;
        }
        return false;
    }

    public void close(){
        locked = true;
    }

    public boolean isLocked(){
        return locked;
    }

    public int getSwingDirection(){
        return swing;
    }

    public int thru(int count){

        if (isLocked()){
            return 0;
        }
        else if (swing == OUT){
            return -count;
        }
        else if (swing == IN){
            return count;
        }
        return 0;
    }

    public String toString(){
        return ("swing state is "+  getSwingDirection() +" Is Locked " + isLocked());
    }
}
