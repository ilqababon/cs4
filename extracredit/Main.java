package extracredit;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Assignment> array1;
        ArrayList<Assignment> array2;
        ArrayList<Assignment> array3;

        Student s1 = new Student("s1", array1);
        Student s2 = new Student("s2", array2);
        Student s3 = new Student("s3", array3);

        ArrayList<Student> array4;
        array4.add(s1);
        array4.add(s2);

        ArrayList<Student> array5;
        array5.add(s3);

        Section c1 = new Section("c1", array4);
        Section c2 = new Section("c2", array5);

        Assignment a1 = new Assignment("a1", 2);
        Assignment a2 = new Assignment("a2", 3);
        Assignment a3 = new Assignment("a3", 5);

        ArrayList<Section> array6;
        array6.add(c1);
        array6.add(c2);

        ArrayList<Section> array7;
        array7.add(c2);

        ArrayList<Section> array8;
        array8.add(c1);

        Teacher t1 = new Teacher("t1", "CS", array6);
        Teacher t2 = new Teacher("t2", "Chemistry", array7);
        Teacher t3 = new Teacher("t3", "Biology", array8);

        t1.giveAssignment(a1);
        t2.giveAssignment(a2);
        t3.giveAssignment(a3);
        s2.finishAssignment(a1);
        System.out.printf("%s remaining work: %.2f%n", s1.getName(), s1.getTimeNeeded());
        System.out.printf("%s remaining work: %.2f%n", s2.getName(), s2.getTimeNeeded());
        System.out.printf("%s remaining work: %.2f%n", s3.getName(), s3.getTimeNeeded());
    }
}