package lectureNotes;
import java.util.ArrayList;

public class oct3 {
    public static void main(String[] args) {
        // ways of declaring arrays
        // method 1 - nonprimitive array
        int[] numList = {1, 2, 3, 4, 5};

        //method 2 - primitive array
        String[] stringList = new String[5];
        stringList[0] = "Hello";
        stringList[1] = "Hi";
        stringList[3] = "Hola";

        /*
            - arrays can only contain elements of a single data type
            - array size cannot be expanded by using index greater than declared index
                e.g. using stringList[6] when the length of stringList is 5
        */

        // 2x2 grid using chars
        char[][] charGrid = {{'a', 'b'}, {'c', 'd'}}; // alternatively, char[][] charGrid = new char[2][2];
        
        // array of instances of a class
        ArrayList<Person> personList = new ArrayList();
        Person a = new Person("Joe");
        Person b = new Person("Jane");
        // adding instances to ArrayList
        personList.add(a);
        personList.add(b);
        // way to access elements of ArrayList (use .get(index) to retrieve certain element)
        System.out.println(personList.get(0).getName());
        
        // if we want to add every instance of class to an ArrayList when it gets created, we can add a private field to the person class itself
    }
}