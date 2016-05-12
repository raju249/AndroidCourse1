package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage 
       extends House {
  // TODO -- add your code here
      private boolean secondFloor;

    public Cottage(int dimen,int lotLen, int lotWid){
      super(dimen,dimen,lotLen,lotWid);
      this.secondFloor = false;
    }

    public Cottage(int dimen,int lotLen, int lotWid, String owner, boolean secondFloor){
        super(dimen,dimen,lotLen,lotWid,owner);
        this.secondFloor = secondFloor;
    }

    public boolean hasSecondFloor(){
        return secondFloor;
    }

    public String toString(){
        return this.toString();
    }
}

