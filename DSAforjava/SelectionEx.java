
public class SelectionEx {
    public static void main(String args[]){

        int[] arr = {3,4,5,1,9,2};
        int[] num = selection(arr);
        for(int n:num){
            System.out.print(n+" ");
        }
    }
    public static int[] selection(int[] arr){
        
        int size = arr.length;


        for(int i = 0;i<size -1 ;i++){
            int max = i;

            for(int j = i+1;j<size;j++){
                if(arr[max] > arr[j]){
                    max = j;
                }
            }
            if(max != i){
                int temp = arr[max];
                arr[max] = arr[i];
                arr[i] = temp;

            }

        }
        return arr;
    }
}
