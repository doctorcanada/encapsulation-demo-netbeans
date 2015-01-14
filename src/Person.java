public class Person 
{
    // fields to be encapsulated
    private String name;
    private int age;

    /*
    * FOR NETBEANS USERS:
    * ------------------
    * To encapsulate the fields and create get/set methods:
    *
    * 1) Highlight the lines ABOVE that contain the fields
    *    for which you want to generate get/set methods
    *
    * 2) Go to Refactor > Encapsulate Fields...
    *
    * 3) Select appropriate options in the dialog box 
    *    that appears -- you may be able to see a Preview 
    *    of the operation result without actually having to
    *    make the change (but either way, you can always undo
    *    the encapsulation)
    */    
    
    // a method that references the instance variables
    public void doStuff() {

        name = "John Smith";
        age = 35;
    }
	
} // end class
