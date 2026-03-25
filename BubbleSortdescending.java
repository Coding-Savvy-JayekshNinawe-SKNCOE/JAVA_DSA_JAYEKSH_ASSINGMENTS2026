public class BubbleSortdescending {

    public static void main(String[] args) {
        int arr [] = {5,2,9,1,6};
        bubbleSort(arr);
        printArray(arr);
    }
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-1-i; j++){
                if(arr[j]<arr[j+1]){
                    swap(j,j+1,arr);
                }
            }
        }
        

    }
    public static void swap(int j, int i, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
}
}