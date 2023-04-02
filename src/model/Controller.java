package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Controller {

    private final static int SIZE = 10;

    private Project[] projects;
    private SimpleDateFormat simpleDateFormat;
    private Calendar calendar;
    private int totalMonths;

    public Controller() {
        //OBJECTS
        projects = new Project[SIZE];

        //OBJECTS OF LIBRARIES
        simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        calendar = Calendar.getInstance();
    }

    /**
     * Create a object 'Project' with the parameter established for the user
     * @param name Name of the project
     * @param client Name of the client of the project
     * @param initialDate initial planed date of the project
     * @param budget The budget established of the project
     * @param phoneNumber The Cell number of the manager of the project
     * @param managerName The name of the manager of the project
     * @param start Start stage duration
     * @param analysis Duration of the analysis stage
     * @param design Duration of the design stage
     * @param execution Duration of the execution stage
     * @param closingAndFollowUp Duration of the closing and follow up stage
     * @param control Duration of the control stage
     * @throws ParseException Exception in case, suddenly the change of date format throws an error, did not end the program
     */
    public void createProject(String name, String client, Calendar initialDate, double budget, String phoneNumber, String managerName, int start, int analysis, int design, int execution, int closingAndFollowUp, int control) throws ParseException {

        int pos = getFirstValidPosition();



        if (pos != -1) {
            projects[pos] = new Project(name, client, initialDate, budget, phoneNumber, managerName, start, analysis, design, execution, closingAndFollowUp, control);
            System.out.println("The project has been registered");
        }
        else {
            System.out.println("No available space");
        }
    }

    /**
     * Create a Status object of the class 'Status'
     * @param initialDate
     * @throws ParseException
     */
    public void createStatus(String initialDate) throws ParseException {

    }
    public void createCapsule(int id, String description, String type, String name, String position){



    }
    /**
     * &#064;method  To get the first available position in one array (Need change the array to evaluate)
     * @return The free position in the array
     */
    public int getFirstValidPosition(){
        int pos = -1;
        boolean isFound = false;
        for(int i = 0; i < SIZE && !isFound; i++){
            if(projects[i] == null){
                pos = i;
                isFound = true;
            }
        }
        return pos;
    }
}
