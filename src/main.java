public class main {
    public static void main(String[] args) {
        ClassRoom c1 = new ClassRoom(new Teacher("teacher#1"));
        for (int i = 0; i < 10; i++) {
            c1.addNewStudent(new Student("student#" + i));
        }

        System.out.println(c1.findAllStudent());
        try {
            System.out.println(c1.findStudent(5));
        } catch (NotFoundExecption e) {
            System.out.println(e.getMessage());
        }
    }
}
