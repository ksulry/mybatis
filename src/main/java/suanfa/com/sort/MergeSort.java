package suanfa.com.sort;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2021/1/6  9:29
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] a = {13,67,34,2,90,33,44,5};
        int length = a.length;
        int[] temp = new int[length];
        sort(a,0,length -1,temp);
        SortUtils.printArray(a);
    }

    public static void sort(int[] arr,int left,int right,int[] temp){
        if(left < right){
            int mid = (left + right)/2;
            sort(arr,left,mid,temp);
            sort(arr,mid + 1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }
    public static void merge(int[] arr,int left,int mid, int right,int[] temp){
        int l = left;
        int r = mid + 1;
        int i = 0;
        while(l <= mid && r <= right){
            if(arr[l] < arr[r]){
                temp[i++] = arr[l++];
            }else{
                temp[i++] = arr[r++];
            }
        }
        while(l <= mid){
            temp[i++] = arr[l++];
        }
        while(r <= right){
            temp[i++] = arr[r++];
        }
        int t = 0;
        while(left <= right){
            arr[left++] = temp[t++];
        }
    }
}
