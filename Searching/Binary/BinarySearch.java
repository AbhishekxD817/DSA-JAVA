public class BinarySearch{
    // to perform binary search array should to be in sorted order
    static int binarySearchFn(int arr[],int target){
        int si = 0; 
        int ei = arr.length-1;
        
        for(int i = 0; si <= ei ; i++){
            int mid = si+(ei-si)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                ei = mid-1;
            }else{
                si = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr = {-2,11,22,33,44,56,89,90,101,2000};
        int target = 94;

        int idx = binarySearchFn(arr,target);
        System.out.println(idx);
    }
}