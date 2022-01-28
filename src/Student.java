public class Student implements Comparable<Student> {
    private final int id;
    private int age;
    private int classNumber;

    public Student() {
        this(-1, -1, -1);
    }

    public Student(int id, int age, int classNumber) {
        this.id = id;
        this.age = age;
        this.classNumber = classNumber;
    }

    @Override
    public int compareTo(Student o) {
        if (this.classNumber > o.classNumber) return 1;
        else if (this.classNumber == o.classNumber) return 0;
        else return -1;
    }
}
