import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Optional;

public class Class {
    private int counter = 0;
    private Teacher teacher;
    private ArrayList<Student> students = new ArrayList<Student>();
    private int number;

    public Class(Teacher teacher) {
        this.teacher = teacher;
        number = counter;
        counter++;
    }

    public void addNewStudent (Student student) {
        this.students.add(student);
    }

    public ArrayList<Student> findAllStudent() {
        return this.students;
    }

    public Optional<Student> findStudent(int id) {
        return Optional.ofNullable(students.stream().filter((student) -> student.getId() == id).findAny());
    }
}

