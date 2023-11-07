package extracredit;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private String subject;
    private ArrayList<Section> sections;

    public Teacher(String name, String subject, ArrayList<Section> sections) {
        this.name = name;
        this.subject = subject;
        this.sections = sections;
    }

    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }

    public ArrayList<Section> getSections() {
        return this.sections;
    }

    public void giveAssignment(Assignment a) {
        for (int i = 0; i < sections.size(); i++) {
            ArrayList<Student> sectionTemp = sections.get(i).getStudents();
            for (int j = 0; j < sectionTemp.size(); j++) {
                ArrayList<Assignment> assignmentsTemp = sectionTemp.get(j).getAssignments();
                assignmentsTemp.add(a);
            }
        }
    }   
}
