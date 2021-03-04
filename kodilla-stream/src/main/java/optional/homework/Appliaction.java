package optional.homework;

import javax.xml.transform.sax.SAXResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Appliaction {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alinka", new Teacher("Pan Paprotka")));
        students.add(new Student("Halinka", new Teacher("Pan Kaktus")));
        students.add(new Student("Macius", null));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());//teacher? nie wiem jak dosięgnąć tej zmiennej i co tutaj wpisać, żeby działało. proszę o pomoc);

            Teacher teacherName = optionalTeacher.orElse(new Teacher("<undefined>"));


            System.out.println("student: " + student.getName() + " teacher: " + teacherName.getName());
        }
    }
}
