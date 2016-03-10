import javafx.collections.*;

public class DataSource {
    public static ObservableList<Student> getAllStudents() {
        ObservableList<Student> students = FXCollections.observableArrayList();
        
        students.add(new Student("abcdefghijk", "Ham", 2.85f));
        students.add(new Student("abcdefghijk", "Ham", 1.71f));
        students.add(new Student("abcdefghijk", "Ham", 3.60f));
        students.add(new Student("abcdefghijk", "Ham", 2.19f));
        students.add(new Student("abcdefghijk", "Ham", 3.15f));
        students.add(new Student("abcdefghijk", "Ham", 2.45f));
        students.add(new Student("abcdefghijk", "Ham", 3.15f));
        students.add(new Student("abcdefghijk", "Ham", 1.55f));
        students.add(new Student("abcdefghijk", "Ham", 1.35f));
        students.add(new Student("abcdefghijk", "Ham", 2.64f));
        students.add(new Student("abcdefghijk", "Ham", 3.13f));
        students.add(new Student("abcdefghijk", "Ham", 2.40f));
        students.add(new Student("abcdefghijk", "Ham", 1.95f));

        return students;
    }
}