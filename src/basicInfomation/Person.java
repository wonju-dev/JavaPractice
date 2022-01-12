package basicInfomation;

public class Person {
    private Information information;

    public Person() {
        this("no name", -1, -1);
    }

    public Person(String name, int id, int age) {
        this.information = new Information(name, id, age);
    }

    private Information getInfomation(){
        return this.information;
    }

    public String getName(){
        Information information = getInfomation();
        return information.getName();
    }

    public int getId(){
        Information information = getInfomation();
        return information.getId();
    }

    public int getAge(){
        Information information = getInfomation();
        return information.getAge();
    }
}
