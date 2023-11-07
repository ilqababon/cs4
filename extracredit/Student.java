package extracredit;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Assignment> assignments;

    public Student(String name, ArrayList<Assignment> assignments) {
        this.name = name;
        this.assignments = assignments;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void finishAssignment(Assignment a) {
        assignments.remove(a);
    }

    public double getTimeNeeded() {
        double sum = 0;
        for (int i = 0; i < assignments.size(); i++) {
            sum += assignments.get(i).getTimeAlloted();
        }
        return sum;
    }
}
