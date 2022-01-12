public class main {
    public static void main(String args[]) {
        Box<String> myStringBox = new Box<String>("ABC");
        System.out.println(myStringBox.item.toString());
        Box<Boolean> myBooleanBox = new Box<Boolean>(true);
        System.out.println(myBooleanBox.item);
        Box<int[]> myIntegerArrayBox = new Box<int[]>(new int[]{1,2,3});
        System.out.println(myIntegerArrayBox.item.toString());
    }
}
