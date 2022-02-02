public class Student implements Comparable<Student>{
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "age :" + age + " name : " + name;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getAge() > o.getAge()) return 1;
        else if (this.getAge() == o.getAge()) return 0;
        else return -1;
    }
}
