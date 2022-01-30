import java.util.ArrayList;
import java.util.Optional;

public class ClassRoom {
    private int counter = 0;
    private Teacher teacher;
    private ArrayList<Student> students = new ArrayList<Student>();
    private int number;

    public ClassRoom(Teacher teacher) {
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

    public Student findStudent(int id) throws NotFoundExecption {
        Optional<Student> result = students.stream().filter((student -> student.getId() == id)).findAny();
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new NotFoundExecption("not found");
        }
    }
}

