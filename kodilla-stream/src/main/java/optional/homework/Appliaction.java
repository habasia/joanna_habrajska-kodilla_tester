package optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Appliaction {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alinka", new Teacher("Pan Paprotka")));
        students.add(new Student("Halinka", new Teacher("Pan Kaktus")));
        students.add(new Student("Macius", null));

        Optional<Teacher> optionalTeacher = Optional.ofNullable(//teacher? nie wiem co tutaj wpisać, żeby działało. proszę o pomoc);

        for (Student student : students) {

            System.out.println("student: " + student.getName() + " teacher: " + optionalTeacher.orElse(new Teacher("<undefined>")));
        }
    }
}
