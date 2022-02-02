import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class main {
    public static void main(String[] args) {
/*        Lambda f = new Lambda() {
            @Override
            public Student getOldestStudent(List<Student> students) {
                Student oldest = students.get(0);
                for (Student student : students) {
                    if (oldest.getAge() < student.getAge()) oldest = student;
                }
                return oldest;
            }
        };*/

/*        Lambda f = (List<Student> students) -> {
            Student oldest = students.get(0);
            for (Student student : students) {
                if (oldest.getAge() < student.getAge()) oldest = student;
            }
            return oldest;
        };*/

        Function<List<Student>, Student> getOldestStudent = (List<Student> students) -> {
            Student oldest = students.get(0);
            for (Student student : students) {
                if (oldest.getAge() < student.getAge()) oldest = student;
            }
            return oldest;
        };

        List students = new ArrayList<Student>();
        for (int i = 1 ; i <= 5 ; i++) {
            int random = (int) (Math.random() * 100);
            students.add(new Student(random, Integer.toString(random)));
        };

        Student oldest = getOldestStudent.apply(students);
        System.out.printf("oldest student is %s \n", oldest);

/*        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (s1.getAge() > s2.getAge()) return 1;
                else if (s1.getAge() == s2.getAge()) return 0;
                else return -1;
            }
        });*/

        Comparator<Student> ascending = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge() > o2.getAge()) return 1;
                else if (o1.getAge() == o2.getAge()) return 0;
                else return -1;
            }
        };

        Collections.sort(students, ascending);


        System.out.println("after sort");
        Iterator it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
