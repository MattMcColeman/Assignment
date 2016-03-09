import javafx.collections.*;

public class DataSource {
    public static ObservableList<Student> getAllStudents() {
        ObservableList<Student> students = FXCollections.observableArrayList();
        
        students.add(new Student(100100100, "Ham", 2.85, 2.85));
        students.add(new Student(100100101, "Ham", 1.71, 1.71));
        students.add(new Student(100100102, "Ham", 3.60, 3.60));
        students.add(new Student(100100103, "Ham", 2.19, 2.19));
        students.add(new Student(100100105, "Ham", 3.15, 3.15));
        students.add(new Student(100100104, "Ham", 2.45, 2.45));
        students.add(new Student(100100105, "Ham", 3.15, 3.15));
        students.add(new Student(100100106, "Ham", 1.55, 1.55));
        students.add(new Student(100100107, "Ham", 1.35, 1.35));
        students.add(new Student(100100108, "Ham", 2.64, 2.64));
        students.add(new Student(100100109, "Ham", 3.13, 3.13));
        students.add(new Student(100100110, "Ham", 2.40, 2.40));
        students.add(new Student(100100111, "Ham", 1.95, 1.95));

        return students;
    }
}