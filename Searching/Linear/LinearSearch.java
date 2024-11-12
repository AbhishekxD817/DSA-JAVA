public class LinearSearch{
    static int linearSearchFn(int arr[],int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr = {11,22,33,99,88,77,43,0};
        int target = 43;

        int idx = linearSearchFn(arr,target);
        System.out.println(idx);
    }
}