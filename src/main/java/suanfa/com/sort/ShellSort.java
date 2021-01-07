package suanfa.com.sort;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2021/1/4  20:35
 */
public class ShellSort {
    public static void sort(int[] a){
        int size = a.length;
        for (int half = size/2; half > 0 ; half /=2) {
            for (int i = half; i < size - half; i ++) {
                int current = a[i + half];
                int index = i;
                while(index >= 0 && current < a[index]){
                    a[index + half] = a[index];
                    index -= half;
                }
                a[index + half] = current;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {13,67,34,2,90,33,44,5};
        sort(a);
        SortUtils.printArray(a);
    }
}
