public class BubbleSort{
// AbhishekxD817
    static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void bubbleSortfn(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        int arr[] = { 32,13,32,1,4,43,5,76,3,-1,5,0,92,-8};
        print(arr);
        bubbleSortfn(arr);
        print(arr);
    }
}