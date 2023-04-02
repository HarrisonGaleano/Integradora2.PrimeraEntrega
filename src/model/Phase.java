package model;

import java.util.Calendar;

public class Phase {

    private final static int PhaseSIZE = 6;

    private String name;
    private Calendar initialDate;
    private Calendar finalDate;
    private Calendar realInitialDate;
    private Calendar realFinalDate;
    private Capsule[] capsules;

    public Phase (String name, Calendar initialDate, Calendar finalDate, Calendar realInitialDate, Calendar realFinalDate) {

        this.name = name;
        this.initialDate = initialDate;
        this.finalDate = finalDate;
        this.realInitialDate = realInitialDate;
        this.realFinalDate = realFinalDate;
    }

    public void addCapsule(Capsule capsule) {
        // find the next available position in the capsule array
        int pos = 0;
        while (capsules[pos] != null && pos < capsules.length) {
            pos++;
        }

        // add the capsule if there is space
        if (pos < capsules.length) {
            capsules[pos] = capsule;
        }
    }
}
