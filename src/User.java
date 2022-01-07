public class User {
    int id;
    String name;

    User(){
        this("name", 1);
    }

    User(String name, int id){
        this.name = name;
        this.id = id;
    }

    void method(){
        System.out.println("user method");
    }
}
