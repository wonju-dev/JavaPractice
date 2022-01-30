public class Student {
    private int counter = 0;
    private int id;
    private String name;

    public Student(String name) {
        this.id = counter;
        this.name = name;
        counter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "id : " + id + ", name : " + name;
    }
}
