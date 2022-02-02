import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Lambda f = new Lambda() {
            @Override
            public Student getOldestStudent(List<Student> students) {
                Student oldest = students.get(0);
                for (Student student : students) {
                    if (oldest.getAge() < student.getAge()) oldest = student;
                }
                return oldest;
            }
        };

        List students = new ArrayList<Student>();
        for (int i = 1 ; i <= 5 ; i++) students.add(new Student(i,Integer.toString(i)));

        Student oldest = f.getOldestStudent(students);
        System.out.println(oldest);

    }
}
