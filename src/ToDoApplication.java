import java.util.List;
import java.util.Scanner;

public class ToDoApplication {

    public void start(){
        System.out.println("Application started");
    }

    public void displayMenu(List<String> todos){
        for(String todo:todos){
            System.out.println(todo);
        }
    }

    public List<String> addToMenu(List<String> todos){
        System.out.println("What would you like to do?");
        // Take the input value from the user and add it to the list
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        todos.add(value);
        for(String todo:todos) {
            System.out.println(todo);
        }
          return todos;
    }
}
