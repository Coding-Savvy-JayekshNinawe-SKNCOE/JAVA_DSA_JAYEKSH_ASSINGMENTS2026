public class BubbleSortSwapCount {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};

        int swapCount = bubbleSortAndCount(arr);

        printArray(arr);
        System.out.println("\nTotal swaps: " + swapCount);
    }

    public static int bubbleSortAndCount(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    count++; 
                }
            }
        }
        return count;
    }

    public static void swap(int[] arr, int i, int j) {
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