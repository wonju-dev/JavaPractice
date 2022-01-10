public class main {
    public static void main(String args[]) {
        int[] intArray = new int[]{0, 1, 2, 3, 4};
        for (int i = 0; i < intArray.length + 1; i++) {
            try {
                if (i == 1) throw new Exception("index is 1");
                System.out.println(intArray[i]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("index out of bound");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}