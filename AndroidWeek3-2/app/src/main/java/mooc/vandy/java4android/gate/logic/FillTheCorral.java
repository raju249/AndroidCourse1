package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This executable Android app will use your Gate.java class.  We have
 * supplied you with the code necessary to execute as an app.  You
 * must fill in the logic.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out){
        mOut = out;
    }

    public void corralSnails(Gate[] corral, Random random) {
        int snailsPasture = 5;
        int snailsThru;
        int gateNumber;
        while (snailsPasture > 0) {
            snailsThru = createSnails(snailsPasture, random);
            gateNumber = chooseGate(random);
            // If a randomly chosen gate is locked
            if (corral[gateNumber].isLocked()) {
                continue;
                // If a randomly chosen gate is set for entrance
            } else if (corral[gateNumber].getSwingDirection() == Gate.IN) {
                corral[gateNumber].thru(snailsThru);
                snailsPasture -= snailsThru;
                continue;
                // If a randomly chosen gate is set for exit
            } else {
                corral[gateNumber].thru(snailsThru);
                snailsPasture +=snailsThru;
            }
        }

    }

    public void setCorralGates(Gate[] corral, Random random) {
        for (Gate item: corral) {
            switch (random.nextInt(2)) {
                case 0:
                    item.open(Gate.IN);
                    break;
                case 1:
                    item.open(Gate.OUT);
                    break;
            }
        }
        for (int i = 0; i < corral.length; i++) {
            mOut.println("Gate " + i + ": " + corral[i]);
        }
    }

    public boolean anyCorralAvailable(Gate[] corral) {
        for (Gate item: corral) {
            if (!item.isLocked() && item.getSwingDirection()==Gate.IN) return true;
        }
        return false;
    }

    private int chooseGate(Random random) {
        return random.nextInt(4);
    }
    private int createSnails(int quantity, Random random) {
        return random.nextInt(quantity) + 1;
    }

}
