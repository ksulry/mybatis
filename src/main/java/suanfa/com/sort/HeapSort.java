package suanfa.com.sort;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2021/1/6  14:38
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] a = {13,67,34,2,90,33,44,5};
        sort(a);
        SortUtils.printArray(a);
    }
    public static void sort(int[] arr){
        int length = arr.length;
        for(int i = 0; i< (arr.length - 1)/2;i++){
            ajustHeap(arr,i,length);
        }
        for(int i = length - 1; i> 0; i--){
            //将栈顶元素与末尾元素交换
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            ajustHeap(arr,0,i);
        }
    }
    public static void ajustHeap(int[] arr,int temp,int length){
        int val = arr[temp];
        int lchild = 2 * temp + 1;
        while(lchild < length){
            int rchild = lchild + 1;
            if(rchild < length && arr[lchild] < arr[rchild]){
                lchild ++;
            }
            if(arr[lchild] <= val){
                break;
            }
            arr[temp] = arr[lchild];
            temp = lchild;
            lchild = 2 * temp + 1;
        }
        arr[temp] = val;
    }
}
