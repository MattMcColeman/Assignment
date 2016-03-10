public class Student {
    private String sid;
    private String firstName;
    private float gpa;
    
    public Student(String sid, String firstName, float gpa) {
        this.sid = sid;
        this.firstName = firstName;
        this.gpa = gpa;
    }
    
    public String getSid() { return this.sid; }
    public String getFirstName() { return this.firstName; }
    public float getGpa() { return this.gpa; }
    
    public void setSid(String sid) { this.sid = sid; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setGpa(float gpa) { this.gpa = gpa; }
}