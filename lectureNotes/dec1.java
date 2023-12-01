package lectureNotes;

public class dec1 {
    /*
    Topic: Exception Handling
    - if something that is not supposed to happen occurs you should throw an exception to handle this event
        e.g. throw new Exception();
    - the code that will be checked for an exception is placed inside a try{} block
      and then the error can be 'catch'ed
    
    Sample code for scenario where a person cannot call method work() if stress reaches a certain level:
        try {
            m.work();
            if (stress > 100) {
                throw new Exception();
            }
        }
        catch(Exception e) {
            // show alert dialog
            m.sleep();
        }

    Refer to Person class for more sample code
    */
}
