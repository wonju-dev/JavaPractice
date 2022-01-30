import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        MyInteger[] myIntegers = new MyInteger[10];

        for (int i = 0 ; i < 10 ; i++) {
            myIntegers[i] = new MyInteger((int) Math.random() * 100);
        }

        Arrays.sort(myIntegers); // Error : has no comparator, comparable 

    }
}

class MyInteger {
    private int myValue;

    public MyInteger(int myValue) {
        this.myValue = myValue;
    }
}