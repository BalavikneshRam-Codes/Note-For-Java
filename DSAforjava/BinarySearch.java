
public class BinarySearch {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int num = binarySearch(arr, 5);
        System.out.println(num);
    }
    public static int binarySearch(int arr[],int searchEle){


        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start+(end - start) /2;
            if(arr[mid] == searchEle){
                return mid;
            }else if(arr[mid] < searchEle){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}
