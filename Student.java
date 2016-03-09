public class Student {
    private int sid;
    private String firstName;
    private String lastName;
    private double gpa;
    private double acc;
    
    public Student(int sid, String firstName, double acc, double gpa) {
        this.sid = sid;
        this.firstName = firstName;
        this.acc = acc;
        this.gpa = gpa;
    }
    
    public int getSid() { return this.sid; }
    public String getFirstName() { return this.firstName; }
    public double getLastName() { return this.acc; }
    public double getGpa() { return this.gpa; }
    
    public void setSid(int sid) { this.sid = sid; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(double acc) { this.acc = acc; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}