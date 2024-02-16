package DSAforjava;

public class SelectionSort {
    public static void main(String args[]){
        int[] arr = {3,4,5,1,9,2};
        int[] num = selectSort(arr);
        for(int n:num){
            System.out.print(n+" ");
        }
    }
    public static int[] selectSort(int[] arr){
        
        int len = arr.length;
        int minIndex = -1;
        for(int i = 0;i<len-1;i++){
            minIndex = i;
            for(int j = i+1;j<len;j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            }

        }
        return arr;
    }
}
