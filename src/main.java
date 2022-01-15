import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class main {

    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5};
        int[] arrCopy = Arrays.copyOf(arr,5);
        int[][] arr2 = {{1,2}, {3,4}};
        int[][] arr2Copy = {{1,2}, {3,4}};
        System.out.println(Arrays.toString(arr)); // [1,2,3,4,5] 출력
        System.out.println(Arrays.deepToString(arr2)); // [[1, 2], [3, 4]] : 다차원 배열은 deepToString을 사용해야한다

        System.out.println(Arrays.equals(arr, arrCopy)); // true
        System.out.println(Arrays.deepEquals(arr2, arr2Copy)); // true : 다차원 배열은 deepEquals를 사용해야한다
    }
}
