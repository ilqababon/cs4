package lectureNotes;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, String subject) {
        super(name, 20, 10000); // person constructor
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    // if we want to use a function from superclass but has diff/specific functions for the subclass, we can use the override method
    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s. I teach %s. \n", this.getName(), subject);
    }
}
