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
        List<String> listOfActions = new ArrayList<>();
        listOfActions.add(ADD);
        listOfActions.add(DELETE);
        listOfActions.add(DONE);
        listOfActions.add(EDIT);
        listOfActions.add(QUIT);

        System.out.println("Application started");
        for (String action : listOfActions) {
            System.out.println(action);
        }

        List<String> todos = new ArrayList<>(); // polymorphism
        String value;

        while (true) {
            System.out.println("Choose any action(Add,Edit,Delete,Done,Print,Quit):");
            value = getInputFromUser();
            if (value.equalsIgnoreCase(ADD)) {
                System.out.println("Enter an errand to add:");
                String errand = getInputFromUser();
                todos = toDo.add(todos, errand);
            } else if (value.equalsIgnoreCase(DELETE)) {
                System.out.println("Enter an errand to delete:");
                String errand = getInputFromUser();
                todos = toDo.delete(todos, errand);
            } else if (value.equalsIgnoreCase(DONE)) {
                System.out.println("Enter an errand to update:");
                String errand = getInputFromUser();
                todos = toDo.markDone(todos, errand);
            } else if (value.equalsIgnoreCase(EDIT)) {
                System.out.println("Enter an errand to replace:");
                String errand = getInputFromUser();
                System.out.println("Enter an errand to replace with:");
                String updatedItem = getInputFromUser();
                todos = toDo.edit(todos, errand, updatedItem);
            } else if (value.equalsIgnoreCase(PRINT)) {
                toDo.print(todos);
            } else if (value.equalsIgnoreCase(QUIT)) {
                break;
            } else {
                System.out.println("Invalid Action. Please choose a valid action(Add,Edit,Delete,Mark Done,Quit)");
            }
        }
    }

    public String getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}