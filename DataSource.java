import javafx.collections.*;

public class DataSource {
    public static ObservableList<Student> getAllStudents() {
        ObservableList<Student> students = FXCollections.observableArrayList();
        
        students.add(new Student("abcdefghijk", "Ham", 2.85));
        students.add(new Student("abcdefghijk", "Ham", 1.71));
        students.add(new Student("abcdefghijk", "Ham", 3.60));
        students.add(new Student("abcdefghijk", "Ham", 2.19));
        students.add(new Student("abcdefghijk", "Ham", 3.15));
        students.add(new Student("abcdefghijk", "Ham", 2.45));
        students.add(new Student("abcdefghijk", "Ham", 3.15));
        students.add(new Student("abcdefghijk", "Ham", 1.55));
        students.add(new Student("abcdefghijk", "Ham", 1.35));
        students.add(new Student("abcdefghijk", "Ham", 2.64));
        students.add(new Student("abcdefghijk", "Ham", 3.13));
        students.add(new Student("abcdefghijk", "Ham", 2.40));
        students.add(new Student("abcdefghijk", "Ham", 1.95));

        return students;
    }
}