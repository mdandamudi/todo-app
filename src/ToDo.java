import java.util.Collections;
import java.util.List;

public class ToDo {
    public void add(List<String> todos, String item) {
        todos.add(item);
        System.out.println(item + " is added to the list");
    }

    public void delete(List<String> todos, String item) {
        for (String todo : todos) {
            if (todo.equalsIgnoreCase(item)) {
                todos.remove(todo);
                System.out.println(item + " is removed from the list");
            }
        }
        System.out.println(item + " not found");
    }

    public void markDone(List<String> todos, String item) {
        for (String todo : todos) {
            if (todo.equalsIgnoreCase(item)) {
                System.out.println(item + " is completed");
            }
        }
        System.out.println(item + " not found");
    }

    public void edit(List<String> todos, String errand, String updatedItem) {
        for (String todo : todos) {
            if (todo.equalsIgnoreCase(errand)) {
                todos.remove(todo);
                todos.add(updatedItem);
                System.out.println(errand + " is replaced with " + updatedItem);
            } else {
                System.out.println(errand + " not found");
            }
        }
    }

    public void print(List<String> todos) {
        for (String todo : todos) {
            System.out.println(todo);
        }
    }
}
