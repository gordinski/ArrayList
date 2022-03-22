import java.util.ArrayList;

public class ArrayListLesson {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();

        //Добавление в конец списка по порядку
        toDoList.add("1 todo");

        //Добавление по индексу
        toDoList.add(1, "2 todo");

        //Удаление по индексу
        toDoList.remove(1);

        //Быстрая инициализация списка
        ArrayList<String> toDoFast = new ArrayList<>(){{
            add("1 todo");
            add("2 todo");
            add("3 todo");
        }};

        //Перебор списка по индексу
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(toDoList.get(i));
        }

        //Перебор всего списка
        for (String item : toDoList) {
            System.out.println(item);
        }
    }
}
