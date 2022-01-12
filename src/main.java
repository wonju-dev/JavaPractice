public class main {

    public static void main(String args[]) {
        System.out.println(Gender.MALE.getValue());
        System.out.println(Gender.FEMALE.getValue());
    }
}
enum Gender {
    MALE(10), FEMALE(2);

    private final int value;
    Gender(int value) {this.value = value;}
    public int getValue() { return this.value; }
}
