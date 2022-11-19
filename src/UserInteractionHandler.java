import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInteractionHandler {

    public static final String ADD = "Add";
    public static final String DELETE = "Delete";
    public static final String DONE = "Mark Done";
    public static final String EDIT = "Edit";
    public static final String QUIT = "Quit";
    public static final String PRINT = "Print";
    public ToDo toDo;

    public void start() {
        toDo = new ToDo();
        List<String> listofActions = new ArrayList<String>();
        listofActions.add(ADD);
        listofActions.add(DELETE);
        listofActions.add(DONE);
        listofActions.add(EDIT);
        listofActions.add(QUIT);
        System.out.println("Application started");
        for (String action : listofActions) {
            System.out.println(action);
        }
        List<String> todos = new ArrayList<String>();
        String value = null;

        while (true) {
            System.out.println("Choose any action(Add,Edit,Delete,Done,Quit):");
           value = getInputfromUser();
            if (value.equalsIgnoreCase(ADD)) {
                System.out.println("Enter an errand to add:");
                String errand = getInputfromUser();
                todos = toDo.add(todos, errand);
            }
            else if (value.equalsIgnoreCase(DELETE)) {
                System.out.println("Enter an errand to delete:");
                String errand =  getInputfromUser();
                todos = toDo.delete(todos, errand);
            }
            else if (value.equalsIgnoreCase(DONE)) {
                System.out.println("Enter an errand to update:");
                String errand =  getInputfromUser();
                todos = toDo.markDone(todos, errand);
            }
            else if (value.equalsIgnoreCase(EDIT)) {
                System.out.println("Enter an errand to replace:");
                String errand =  getInputfromUser();
                System.out.println("Enter an errand to replace with:");
                String updatedItem =  getInputfromUser();
                todos = toDo.edit(todos, errand, updatedItem);
            }
            else if (value.equalsIgnoreCase(PRINT)) {
                toDo.print(todos);
            }
            else if (value.equalsIgnoreCase(QUIT)) {
               break;
            }
            else{
                System.out.println("Invalid Action. Please choose a valid action(Add,Edit,Delete,Mark Done,Quit)");
            }
        }

    }

    public String getInputfromUser(){
     Scanner  scanner = new Scanner(System.in);
     String value = scanner.nextLine();
        return value;
    }
}