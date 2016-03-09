public class Student {
    private String sid;
    private String firstName;
    private String lastName;
    private double gpa;
    private double acc;
    
    public Student(String sid, String firstName, double gpa) {
        this.sid = sid;
        this.firstName = firstName;
        this.gpa = gpa;
    }
    
    public String getSid() { return this.sid; }
    public String getFirstName() { return this.firstName; }
    public double getGpa() { return this.gpa; }
    
    public void setSid(String sid) { this.sid = sid; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}