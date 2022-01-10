public class main {
    public static void main(String args[]) {
        try {
            myMethod();
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("outer handling");
        } finally {
            System.out.println("finally");
        }
    }

    static void myMethod() throws ArrayIndexOutOfBoundsException {
        int[] intArray = new int[]{0, 1, 2, 3, 4};
        for (int i = 0; i < intArray.length + 1; i++) {
            try {
                System.out.println(intArray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("inner handling");
                throw e;
            }
        }
    }
}