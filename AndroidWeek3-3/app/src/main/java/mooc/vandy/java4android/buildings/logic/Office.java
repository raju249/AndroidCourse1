package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office 
       extends Building {
    // TODO -- add your code here
       private String businessName;
       private int parkingSpaces;
       private static int totalOffices = 0;

       public Office(int len, int wid, int lotLen, int lotWid){
              super(len,wid,lotLen,lotWid);
              totalOffices += 1;
       }

       public Office(int len, int wid, int lotLen, int lotWid, String businessName){
              super(len,wid,lotLen,lotWid);
              this.businessName = businessName;
              totalOffices += 1;
       }

       public Office(int len, int wid, int lotLen, int lotWid, String businessName, int parkingSpaces){
              super(len,wid,lotLen,lotWid);
              this.businessName = businessName;
              this.parkingSpaces = parkingSpaces;
              totalOffices += 1;
       }

       public String getBusinessName(){
              return this.businessName;
       }

       public  int getParkingSpaces(){
              return this.parkingSpaces;
       }

       public void setBusinessName(String name){
              this.businessName = name;
       }

       public void setParkingSpaces(int spaces){
              this.parkingSpaces = spaces;
       }

       public String toString(){
              if (this.getBusinessName() == null)
                     return ("Business: unoccupied" + " (total offices: " + totalOffices + ")");
              return ("Business: " + this.getBusinessName() + " (total offices: " + totalOffices + ")");
       }

    public boolean equals(Object object){
        boolean result = false;
        if (object instanceof Office){
            Office obj = (Office) object;
        result = (this.calcBuildingArea() == obj.calcBuildingArea() && this.getParkingSpaces() == obj.getParkingSpaces());
        }
        return result;
    }
}
