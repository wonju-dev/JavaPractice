package basicInfomation;

class Information {
    private String name;
    private int id;
    private int age;

    Information(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    int getId() {
        return this.id;
    }

    int getAge() {
        return this.age;
    }
}
