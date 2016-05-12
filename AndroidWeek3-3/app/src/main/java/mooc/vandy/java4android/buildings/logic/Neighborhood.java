package mooc.vandy.java4android.buildings.logic;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This is your Neighborhood program.  It will use a Building List To
 * create some Building objects.
 */
public class Neighborhood {
    // TODO -- add your code here
    public static void print(Building[] buildings, String header, OutputInterface out){
        for(Building building : buildings){
            building.toString();
        }
    }

    public static int calcArea(Building[] buildings){

        int totalArea = 0;
        for(Building building : buildings){
            totalArea += building.calcLotArea();
        }
        return totalArea;
    }
}
