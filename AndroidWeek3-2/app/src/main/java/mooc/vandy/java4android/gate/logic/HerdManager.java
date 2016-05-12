package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;
/**
 * This executable Android App will use your Gate class.  We have
 * supplied you will the code necessary to execute as an app.  You
 * must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;
    public static final int HERD = 24;
    /**
     * Constructor initializes the field.
     */
    public HerdManager(OutputInterface out){
        mOut = out;
    }

    // TODO -- Fill your code in here
    /*
    setGates method to set west Gate in direction = IN
    and west Gate in direction = OUT
     */
    public void setGates(Gate westGate, Gate eastGate) {
        westGate.open(Gate.IN);
        eastGate.open(Gate.OUT);
    }

    public void simulateHerd(Gate westGate, Gate eastGate, Random random){
        int snailsInTotal = HERD;
        int snailsInPen = HERD;
        int snailsInPasture = 0;
        int snailsThru;

        mOut.println("There are currently " + snailsInPen +
                " snails in the pen and " + snailsInPasture + " snails in the pasture\n");

        for (int i = 0; i < 10; i++) {
            // when all the snails are in pen
            if (snailsInPen == snailsInTotal) {
                snailsThru = createSnails(snailsInPen, random);
                snailsInPen += eastGate.thru(snailsThru);
                snailsInPasture += snailsThru;
                mOut.println("There are currently " + snailsInPen +
                        " snails in the pen and " + snailsInPasture + " snails in the pasture");
                continue;
            }
            // when the gates are randomly chosen
            if (random.nextBoolean()) {
                snailsThru = createSnails(snailsInPen, random);
                snailsInPen += eastGate.thru(snailsThru);
                snailsInPasture += snailsThru;
                mOut.println("There are currently " + snailsInPen +
                        " snails in the pen and " + snailsInPasture + " snails in the pasture");
                continue;
            } else {
                snailsThru = createSnails(snailsInPasture, random);
                snailsInPasture -= westGate.thru(snailsThru);
                snailsInPen += snailsThru;
                mOut.println("There are currently " + snailsInPen +
                        " snails in the pen and " + snailsInPasture + " snails in the pasture");
                continue;
            }
        }
    }

    private int createSnails(int num,Random rand){
        return rand.nextInt(num) + 1;
    }
}
