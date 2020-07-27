public class Student {
    public int id;
    public int rfid;
    public String firstName;
    public String lastName;

    public Student() {

    }

    public Student(String firstName, String lastName, int id, int rfid) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.rfid = rfid;
        
    }

    public void markOff(String classID) {
        System.out.println(firstName + " " + lastName + " has been marked off for the class " + classID);
    }
}
