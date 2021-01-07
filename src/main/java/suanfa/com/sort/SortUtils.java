package suanfa.com.sort;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2021/1/4  17:22
 */
public class SortUtils {
    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }
    public static void swap(int[] a, int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
