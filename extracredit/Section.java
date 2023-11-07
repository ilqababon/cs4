package extracredit;

import java.util.ArrayList;

public class Section {
    private String name;
    private ArrayList<Student> students;

    public Section(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void addStudent(Student s) {
        students.add(s);
    }
}
