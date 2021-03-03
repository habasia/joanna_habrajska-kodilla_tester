package homework;

import stream.UsersRepository;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {

        List<String> tasks = TaskRepository.getTasks()   // [1]
                .stream()
                .filter(u -> u.getDeadline().isAfter(LocalDate.now()))
                .map(Task::getName)
                .collect(Collectors.toList());                        // [2]
        System.out.println(tasks);
    }
}
