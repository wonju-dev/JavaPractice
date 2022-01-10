public class main {
    public static void main(String args[]) {
        try {
            myMethod();
        } catch(ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        } finally {
            System.out.println("finally");
        }
    }

    static void myMethod() throws ArrayIndexOutOfBoundsException {
        int[] intArray = new int[]{0, 1, 2, 3, 4};
        for (int i = 0; i < intArray.length + 1; i++) {
            System.out.println(intArray[i]);
        }
    }
}