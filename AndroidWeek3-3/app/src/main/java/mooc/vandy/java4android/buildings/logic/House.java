package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {
    // TODO -- add your code here
       private String owner;
       private boolean pool;

       public House(int len, int wid, int lotLen, int lotWid){
              super(len,wid,lotLen,lotWid);
              owner = null;
              pool = false;
       }

       public House(int len, int wid, int lotLen, int lotWid, String owner){
              super(len,wid,lotLen,lotWid);
              this.owner = owner;
       }

       public House(int len, int wid, int lotlen, int lotWid, String owner, boolean pool){
              super(len,wid,lotlen,lotWid);
              this.owner = owner;
              this.pool = pool;
       }

       public String getOwner(){
              return this.owner;
       }

       public boolean hasPool(){
              return this.pool;
       }

       public void setOwner(String name){
              this.owner = name;
       }

       public void setPool(boolean val){
              this.pool = val;
       }

       public String toString(){
              if (this.calcBuildingArea() > this.calcLotArea())
                     return (this.getOwner() + " has a big open space");
              return (this.getOwner() + " has a small open space");
       }

       public boolean equals(Object object){
              boolean result = false;
              if (object instanceof House){
                     House obj = (House) object;
              result = (this.calcBuildingArea() == obj.calcBuildingArea() && this.hasPool() == obj.hasPool());
              }
              return result; }
}
