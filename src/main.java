public class main {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student(1,2,3);

        System.out.println(s2.compareTo(s1));

    }
}
