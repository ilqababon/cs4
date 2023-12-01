package lectureNotes;

public class Student extends Person {
    private double grade;
    private int level;
    private String section;

    public Student(String name, double grade, int level, String section) {
        // must make the Person (superclass) first -- depends on the superclass constructors
        super(name); // can be a specific value if all members of that subclass share a property
        this.grade = grade;
        this.level = level;
        this.section = section;
    }

    public double getGrade() {
        return grade;
    }

    public int getLevel() {
        return level;
    }

    public String getSection() {
        return section;
    }

    public void getStipend() {
        // option 1: operate as if you are another class -- this.setMoney(this.getMoney + 1000);
        // option 2: use 'protected' instead of 'private' in superclass:
        this.money += 1000;
    }

    // nov 14 -- will get an error since Person class is now abstract
    // either make the Student class itself into an abstract class, or implement the abstract method
    //@Override
    //public void work() {
    //}
}
