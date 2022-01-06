public class main {
    public static void main(String args[]){
        Parent mother = new Parent(30);
        Child son = new Child(5);
        System.out.println(mother.age);
        System.out.println(son.age);
    }
}
