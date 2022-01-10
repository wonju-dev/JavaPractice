public class main {
    public static void main(String args[]) {
        try {
            myMethod1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void myMethod1() throws Exception{
        myMethod2();
    }

    static void myMethod2() throws Exception {
        int[] intArray = new int[]{0, 1, 2, 3, 4};
        for (int i = 0; i < intArray.length + 1; i++) {
            System.out.println(intArray[i]);
        }
    }
}