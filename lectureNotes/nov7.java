package lectureNotes;

public class nov7 {
    /*
    Main components of OOP: 
        Encapsulation 
            (the creation of classes, usable even without knowing how they work)
        Inheritance 
        Polymorphism 
        Abstraction

    Inheritance and Polymorphism
        - The code in some classes may be redundant or very similar; the use of inheritance allows for more organization, convnience, flexibility, etc
        e.g. Instead of Student, Teacher, Staff, Guest classes, we can have a Person class and the others as subclasses inheriting properties from the Person class
        
        - A polymorphism is able to recognize the multiple forms of an object
        e.g. instead of talk(Student s), talk(Teacher t), etc., we can have one function talk(Person p) since they are all Persons
     */

     public static void main(String[] args) {
        // since a Student and Teacher are also Persons, by this works by polymorphism
        Person m = new Student("Mark", 60, 10, "Photon");
        Person n = new Teacher("Nathan", "Adtech");

        m.introduce();
        n.introduce();
     }
}
