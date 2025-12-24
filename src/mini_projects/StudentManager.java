package mini_projects;

import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ram"));
        students.add(new Student(2, "Sham"));

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
