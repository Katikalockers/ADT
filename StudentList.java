public class StudentList {
    private String index;
    private String studentID;
    private String firstName;
    private String lastName;

    public StudentList() {
        this.studentID = "";
        this.firstName = "";
        this.lastName = "";
    }

    public StudentList (String index, String studentID, String firstName, String lastName) {
        this.index=index;
        this.studentID=studentID;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    
    public String getStudentID(){
        return studentID;
    }

    public String getFname() {
        return firstName;
    }

    public String getLname() {
        return lastName;
    }

    public StudentList(String StudentID, String firstName, String lastName) {
        this.studentID = StudentID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public StudentList(String StudentID, String firstName) {
        this.studentID = StudentID;
        this.firstName = firstName;
        this.lastName = "";
    }

    public String toString() {
        return this.studentID +" "+ this.firstName + " "+ this.lastName;
    }

}
