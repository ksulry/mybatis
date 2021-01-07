package suanfa.com.sort;

/**
 * @author ln
 * @Description: 冒泡排序
 * @date 2021/1/4  17:19
 */
public class SelectSort {
    public static void sort(int[] a){
        int size = a.length;
        int i = 0;
        int j = 0;
        int k = 0;
        for(i = 0;i < size;i++){
            int min = a[i];
            k = i;
            for(j = i + 1;j < size;j++){
               if(a[j] < min){
                   min = a[j];
                   k = j;
               }
            }
            SortUtils.swap(a,i,k);
        }
    }

    public static void main(String[] args) {
        int[] a = {13,67,34,2,90,33,44,5};
        sort(a);
        SortUtils.printArray(a);
    }
}
