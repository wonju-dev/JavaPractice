import java.lang.ArrayIndexOutOfBoundsException;

public class main {
    public static void main(String args[]) {
        try {
            int[] intArray = new int[] {1,2,3,4,5};
            for (int i = 0 ; i < intArray.length + 1 ; i++) {
                System.out.println(intArray[i]);
            }
        } catch (Exception ArrayIndexOutOfBoundsException) {
            System.out.println("index out of bound");
        }
        System.out.println("but program has finished with on Error");
    }
}