import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        MyInteger[] myIntegers = new MyInteger[10];

        for (int i = 0 ; i < 10 ; i++) {
            myIntegers[i] = new MyInteger((int) (Math.random() * 100));
        }

        Arrays.sort(myIntegers);

        for (MyInteger numbers : myIntegers) {
            System.out.println(numbers);
        }

    }
}

class MyInteger implements Comparable<MyInteger>{
    private int myValue;

    public MyInteger(int myValue) {
        this.myValue = myValue;
    }

    @Override
    public int compareTo(MyInteger integer) {
        if (this.myValue > integer.myValue) return 1;
        else if (this.myValue == integer.myValue) return 0;
        else return -1;
    }

    public String toString() {
        return this.myValue + "";
    }
}