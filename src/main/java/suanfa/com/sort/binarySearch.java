package suanfa.com.sort;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2021/1/7  10:05
 */
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,14,25,34,67,89,109};
        int res = binarySearch(arr,67,0,arr.length - 1);
        System.out.println(res);
    }
    public static int binarySearch01(int[] arr, int x) {
        int low = 0;
        int high = arr.length-1;
        while(low <= high) {
            int middle = (low + high)/2;
            if(x == arr[middle]) {
                return middle;
            }else if(x <arr[middle]) {
                high = middle - 1;
            }else {
                low = middle + 1;
            }
        }
        return -1;
    }
    public static int binarySearch(int[]arr,int data,int left,int right){
        if(arr[left] > data || arr[right] < data || left > right){
            return -1;
        }
        int mid = (left + right)/2;
        if(arr[mid] > data){
            return binarySearch(arr,data,left,mid - 1);
        }else if(arr[mid]< data){
            return binarySearch(arr,data,mid + 1,right);
        }else{
            return mid;
        }
    }
}
