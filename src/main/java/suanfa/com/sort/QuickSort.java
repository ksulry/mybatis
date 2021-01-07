package suanfa.com.sort;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2021/1/6  11:48
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = {13,67,34,2,90,33,44,5};
        sort(a,0,a.length - 1);
        SortUtils.printArray(a);
    }
    public static void sort(int[] arr,int left,int right){
        if (arr.length < 1 || left < 0 || right >= arr.length || left > right) return ;
        if(left < right){
            int key = partation(arr,left,right);
            SortUtils.printArray(arr);
            sort(arr,left,key - 1);
            sort(arr,key + 1,right);
        }
    }
    public static int partation(int[] arr,int left,int right){
         int key = arr[left];
         while(left < right){
             while(arr[right] > key && right >left){
                 right--;
             }
             arr[left] = arr[right];
             while(arr[left] <= key && right > left){
                 left++;
             }
             arr[right] = arr[left];
         }
         arr[left] = key;
         return left;
    }
}
