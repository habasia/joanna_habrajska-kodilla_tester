package homework;

import stream.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("write article",LocalDate.of(2021,01,01),LocalDate.of(2021,05,03)));
        tasks.add(new Task("clean your room",LocalDate.of(2021,01,01),LocalDate.now()));
        tasks.add(new Task("wash dishes",LocalDate.of(2021,01,01),LocalDate.now()));
        return tasks;
    }
}
