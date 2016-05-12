package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    // TODO -- add your code here
    private int length;
    private int width;
    private int lotLength;
    private int lotWidth;

    public Building(int length, int width, int lotLength, int lotWidth){
        this.setLength(length);
        this.setWidth(width);
        this.setLotLength(lotLength);
        this.setLotWidth(lotWidth);
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public int getLotLength(){
        return lotLength;
    }

    public int getLotWidth(){
        return lotWidth;
    }

    public void setLength(int len){
        length = len;
    }

    public void setWidth(int wid){
        width = wid;
    }

    public void setLotLength(int sll){
        lotLength = sll;
    }

    public void setLotWidth(int slw){
        lotWidth = slw;
    }

    public int calcBuildingArea(){
        return length*width;
    }

    public int calcLotArea(){
        return lotWidth*lotLength;
    }

    public String toString(){
        return this.toString();
    }
}
