package suanfa.com.sort;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2021/1/4  19:43
 */
public class BubbleSort {
    public static void sort(int[] a){
        int size = a.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i -1; j++) {
                if(a[j] > a[j + 1]){
                    SortUtils.swap(a,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {13,67,34,2,90,33,44,5};
        sort(a);
        SortUtils.printArray(a);
    }
}
