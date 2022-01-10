public class Computer {
    int b = 111;
    static int a = 10;
    Computer(int a){
        this.a = a;
    }
    void print() {
        System.out.println(this);
        System.out.println("hi");
        System.out.println(a);
    }
}
