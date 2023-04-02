package ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import model.Controller;

import javax.swing.*;

public class CapsuleGreenSQA {

    private Scanner reader;
    private SimpleDateFormat simpleDateFormat;
    private Controller controller;
    private Calendar calendar;

    public CapsuleGreenSQA() {

        reader = new Scanner(System.in);
        controller = new Controller();
        simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        calendar = Calendar.getInstance();
    }

    public static void main(String[] args) throws ParseException {

        //option have been initialized in -1 for see if, the user chose an option
        int option = -1;
        //SQA is the object for the main class
        CapsuleGreenSQA SQA = new CapsuleGreenSQA();

        do {
            SQA.menu();
            option = SQA.reader.nextInt();
            SQA.executeOption(option);

        }while(option != 6);
    }

    public void menu() {
        System.out.println("Select an option:\n"+
                "\n"+
                "1. Create a project.\n"+
                "2. Complete stage of a project.\n"+
                "3. Register capsule.\n"+
                "4. Approve capsule.\n"+
                "5. Post capsule.\n"+
                "6. Exit.");
    }
    public void executeOption(int option) throws ParseException {

        int max = 6;
        validateIntegerInput(option, max);

        switch (option) {

            case 1:
                makeProject();
                System.out.println(controller);
                break;

            case 2:
                System.out.println(controller);
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            case 6:
                System.out.println("The program have been finished");
                break;
        }
    }
    public int validateIntegerInput(int input, int max){

        boolean flag = false;

        do {
            if (input <=max && input >0) {
                flag =  true;
            } else {
                System.out.println("Probably that is not a number or a valid option. Enter a whole number.");
                reader.nextInt();
            }
        } while (!flag);

        return input;
    }
    public Calendar  validateCalendarInput(String date){

        boolean validDate = false;

        do{
            try {
            // this line is for convert the String in Date
            calendar.setTime(simpleDateFormat.parse(date));
            validDate = true;
            System.out.println("The estimated date has been saved");

            } catch (ParseException e) {
            System.err.println("Error: the date entered is not in the correct format.");
            System.out.println("Join tha date again in the format: 'dd--mm--yy'");

            date = reader.next();
            }
        }while (!validDate);
        return calendar;
    }
    public void makeProject() throws ParseException {
        //declaration of the variables to make a new project
        String name;
        String client;
        Calendar initialDate;
        double budget;
        String phoneNumber;
        String managerName;
        String date;

        //ints for know how much time will keep each status
        int start;
        int analysis;
        int design;
        int execution;
        int closingAndFollowUp;
        int control;


        //name
        reader.nextLine();
        System.out.println("You have selected Create a project\n" +
                "\n" +
                "To make a project:\n" +
                "---Introduce the name of project.");
        name = reader.next();

        //client
        reader.nextLine();
        System.out.println("---Introduce the name of client´s project");
        client = reader.next();

        //initialDate
        reader.nextLine();
        System.out.println("---Introduce the estimated start date in the format: 'dd-MM-yyyy'.");
        date = reader.next();
        initialDate = validateCalendarInput(date);

        //time will keep each status
        System.out.println("How many months will the start stage last?");
        start = reader.nextInt();
        System.out.println("How many months will the analysis stage last");
        analysis = reader.nextInt();
        System.out.println("How many months will the design stage last");
        design = reader.nextInt();
        System.out.println("How many months will the execution stage last");
        execution = reader.nextInt();
        System.out.println("How many months will the closing and follow up stage last");
        closingAndFollowUp = reader.nextInt();
        System.out.println("How many months will the control stage last");
        control = reader.nextInt();

        //budget
        System.out.println("---Who is the budget for the project");
        budget = reader.nextInt();

        //phoneNumber
        reader.nextLine();
        System.out.println("---The Phone number of the manager");
        phoneNumber = reader.next();

        //managerName
        reader.nextLine();
        System.out.println("---Name of the manager");
        managerName = reader.next();


        //CONTROL OPERATION
        controller.createProject(name, client, initialDate, budget, phoneNumber, managerName, start, analysis, design, execution, closingAndFollowUp, control);
    }

}

