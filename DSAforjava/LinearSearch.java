package DSAforjava;

public class LinearSearch {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int num = linearSearch(arr,3);
        System.out.println(num);

    }
    
    public static int  linearSearch(int[] arr,int searchEle){
        int arrLen = arr.length;

        for(int i = 0;i<=arrLen;i++){
            if(arr[i] == searchEle){
                return i;
            }
        }
        return -1;
    }
}
