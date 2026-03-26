public class InsertionSortEvenOnly {

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 2, 7, 4, 1, 6};

        insertionSortEvenOnly(arr);
        printArray(arr);
    }

    public static void insertionSortEvenOnly(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            // Only process if current element is even
            if (arr[i] % 2 == 0) {
                int key = arr[i];
                int j = i - 1;

                // Move only EVEN elements
                while (j >= 0 && arr[j] % 2 == 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }

                arr[j + 1] = key;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}