
public class InsertionSort {
    public static void main(String args[]){

        int[] arr = {3,4,5,1,9,2};
        int[] num = insertionSort(arr);
        for(int n:num){
            System.out.print(n+" ");
        }

    }
    public static int[] insertionSort(int[] arr){
        int size = arr.length;


        for(int i = 1;i<size;i++){
            int key = arr[i];

            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
