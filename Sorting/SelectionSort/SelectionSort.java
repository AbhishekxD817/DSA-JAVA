public class SelectionSort{
// AbhishekxD817
    static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void SelectionSortfn(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int min = i;

            for(int j = i; j < n;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }

    public static void main(String args[]){
        int arr[] = { 32,13,32,1,4,43,5,76,3,-1,5,0,92,-8};
        print(arr);
        SelectionSortfn(arr);
        print(arr);
    }
}