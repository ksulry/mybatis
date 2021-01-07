package suanfa.com.sort;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2021/1/4  19:56
 */
public class InsertSort {
    public static void sort(int[] a){
        int size = a.length;
        int current;
        for (int i = 0; i < size - 1; i++) {
            int index = i;
            current = a[i + 1];
            while(index >= 0 && current < a[index]){
                a[index + 1] = a[index];
                index --;
            }
            a[index + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] a = {13,67,34,2,90,33,44,5};
        sort(a);
        SortUtils.printArray(a);
    }
}
