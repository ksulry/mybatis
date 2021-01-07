package suanfa.com.sort;

import java.util.Arrays;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2021/1/6  15:30
 */
public class CountingSort {
    public static void main(String[] args) {
        int[] a = {13,67,34,2,90,33,44,5};
        sort(a);
        SortUtils.printArray(a);
    }
    public static void sort(int[] arr){
        int length = arr.length;
        int min = arr[0],max = arr[0];
        for (int i = 0; i < length; i++) {
            if(min > arr[i])
                min = arr[i];
            if(max < arr[i])
                max = arr[i];
        }
        int[] bucket = new int[max - min + 1];
        Arrays.fill(bucket,0);
        int bin = 0 - min;
        for (int i = 0; i < length; i++) {
            bucket[arr[i] + bin] ++;
        }
        //对于bucket数组进行填充到arr中
        int i = 0,index = 0;
        while(i < length){
           if(bucket[index] != 0){
               arr[i] = index - bin;
               bucket[index]--;
               i++;
           }else{
               index ++;
           }
        }
    }
}
