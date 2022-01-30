import java.util.Arrays;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        MyInteger[] myIntegers = new MyInteger[10];

        for (int i = 0 ; i < 10 ; i++) {
            myIntegers[i] = new MyInteger((int) (Math.random() * 100));
        }

        Arrays.sort(myIntegers, comp);

        for (MyInteger numbers : myIntegers) {
            System.out.println(numbers);
        }

    }

    public static Comparator<MyInteger> comp = new Comparator<MyInteger>() {
        @Override
        public int compare(MyInteger o1, MyInteger o2) {
            if (o1.getMyValue() > o2.getMyValue()) return 1;
            else if (o1.getMyValue() == o2.getMyValue()) return 0;
            else return -1;
        }
    };
}

class MyInteger {
    private int myValue;

    public MyInteger(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public String toString() {
        return this.myValue + "";
    }
}