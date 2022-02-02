import java.util.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class main {
    public static void main(String[] args) {
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

        Comparator<Student> ascending = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge() > o2.getAge()) return 1;
                else if (o1.getAge() == o2.getAge()) return 0;
                else return -1;
            }
        };

        Collections.sort(students, ascending);


        students.forEach((student)->{
            System.out.println(student);
        });

/*        UnaryOperator<Student> increaseAge = (Student student) -> {
            student.setAge(student.getAge() +1);
            return student;
        };*/

/*        students.replaceAll(new UnaryOperator() {
            @Override
            public Object apply(Object o) {
                Student student = (Student) o;
                student.setAge(student.getAge() + 1);
                return student;
            }
        });*/

        students.replaceAll((o)->{
            Student student = (Student) o;
            student.setAge(student.getAge() + 1);
            return student;
        });

        System.out.println("new Year");
        students.forEach((student)->{
            System.out.println(student);
        });

/*        System.out.println("after sort");
        Iterator it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }*/

    }
}
