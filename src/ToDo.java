import java.util.Collections;
import java.util.List;

public class ToDo {
    public List<String> add(List<String> todos, String item){
        todos.add(item);
        System.out.println(item+" is added to the list");
         return todos;
    }

    public List<String> delete(List<String> todos, String item) {
            for (String todo : todos) {
                if (todo.equalsIgnoreCase(item)) {
                    todos.remove(todo);
                    System.out.println(item + " is removed from the list");
                } else {
                    System.out.println(item + " not found");
                }
            }
            return todos;
    }
    public List<String> markDone(List<String> todos, String item){
        for(String todo:todos) {
            if(todo.equalsIgnoreCase(item)){
                System.out.println(item + " is completed");
            }else{
                System.out.println(item + " not found");
            }
        }
        return todos;
    }
    public List<String> edit(List<String> todos, String item,String item1){
        for (String todo : todos) {
            if (todo.equalsIgnoreCase(item)) {
                todos.remove(todo);
                todos.add(item1);
                System.out.println(item + " is replaced with "+item1);
            } else {
                System.out.println(item + " not found");
            }
        }
        return todos;
    }

    public void print(List<String> todos){
        for (String todo : todos) {
            System.out.println(todo);
            }
    }
}
