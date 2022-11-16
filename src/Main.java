import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> todos = new ArrayList<>();
        todos.add("Get Bread");
        todos.add("Get Oranges");
        todos.add("Get Apples");

        while(true) {
            // Prompt the user for what they'd like to do
            System.out.println("What would you like to do?");
            // Take the input value from the user and add it to the list
            Scanner scanner = new Scanner(System.in);
            String value = scanner.nextLine();
            todos.add(value);
            // Print out the list
            for(String todo:todos) {
                System.out.println(todo);
            }
            if(value.equalsIgnoreCase("stop")){
                break;
            }
        }
    }
}