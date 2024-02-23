

public class BubbleSort{
    public static void main(String args[]){
        int[] arr = {3,4,5,1,9,2};
        int[] num = bubbleSort(arr);
        for(int n:num){
            System.out.print(n+" ");
        }
    }

    public static int[] bubbleSort(int[] arr){
        int size = arr.length;
        int temp = 0;

        for(int i = 0;i<size;i++){
            for(int j = 0;j< size - 1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    
}