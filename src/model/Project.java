package model;

import java.util.Calendar;

//object
public class Project {

    //attributes
    private String name;
    private String client;
    private Calendar initialDate;
    private Calendar finalDate;
    private double budget;
    private String phoneNumber;
    private String managerName;
    private Phase[] phases;

    //Ints for know the duration of the phases
    private int start;
    private int analysis;
    private int design;
    private int execution;
    private int closingAndFollowUp;
    private int control;

    //constructor method
    public Project(String name, String client, Calendar initialDate, double budget, String phoneNumber, String managerName, int start, int analysis, int design, int execution, int closingAndFollowUp, int control) {

        this.name = name;
        this.client = client;
        this.initialDate = initialDate;
        this.budget = budget;
        this.phoneNumber = phoneNumber;
        this.managerName = managerName;
        this.start = start;
        this.analysis = analysis;
        this.design = design;
        this.execution = execution;
        this.closingAndFollowUp = closingAndFollowUp;
        this.control = control;


        int[] phasesDuration = new int[6];
        phasesDuration[0] = start;
        phasesDuration[1] = analysis;
        phasesDuration[2] = design;
        phasesDuration[3] = execution;
        phasesDuration[4] = closingAndFollowUp;
        phasesDuration[5] = control;

        int totalMonths = 0;

        for (int i = 0; i < phasesDuration.length; i++) {
            totalMonths += phasesDuration[i];

        finalDate = initialDate;
        finalDate.add(Calendar.MONTH, totalMonths);




        }

    }
}
    //methods
