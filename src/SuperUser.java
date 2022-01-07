public class SuperUser extends User{
    int id;
    SuperUser(){
        super();
        this.id = 5;
    };
    SuperUser(String name, int superid, int id){
        super(name, superid);
        this.id = id;
    }

    void method(){
        System.out.println("super user method");
    }

}
