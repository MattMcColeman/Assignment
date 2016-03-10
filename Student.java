public class Student {
    private String emailName;
    private String actualClass;
    private float spamProbability;
    
    public Student(String emailName, String actualClass, float spamProbability) {
        this.emailName = emailName;
        this.actualClass = actualClass;
        this.spamProbability = spamProbability;
    }
    
    public String getEmailName() { return this.emailName; }
    public String getActualClass() { return this.actualClass; }
    public float getSpamProbability() { return this.spamProbability; }
    
    public void setEmailName(String emailName) { this.emailName = emailName; }
    public void setActualClass(String actualClass) { this.actualClass = actualClass; }
    public void setSpamProbability(float spamProbability) { this.spamProbability = spamProbability; }
}