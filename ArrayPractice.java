public class ArrayPractice {
    public static void main(String[] args) {
        int arr[] ={1, 2, 3};

    //    int ans[] = removeDuplicate(arr);

    //    for(int i=0;i<arr.length;i++){
    //     System.out.println(ans[i]);
    //    }

       boolean ans = linearSearch(arr,2);

       System.out.println(ans);

       

    }


    // int[] or int arr[]

    private static boolean linearSearch(int[] arr, int elem) {
        for(int i=0;i<arr.length,i++){
            if(arr[i]==elem){
                return true;
            }
        }

        return false;
    }


    private static int[] removeDuplicate(int[] arr) {
        
        int[] result = new int[arr.length];

        for(int i=0;i<arr.length-1;i++){
            int lockKiyaElement = arr[i];

            for(int j = i+1;j<arr.length;j++){
                if(lockKiyaElement == arr[j]){
                    //duplicate 
                    break;
                }


            }
        }
    }


    static boolean checkSort(int arr[]){
        // {1,2,2,4,5}
        for(int i=0;i<arr.length-1;i++){
            if(!(arr[i]<=arr[i+1])){
                return false;
            }
        }

        return true;
        

    }

    static int maxElement(int arr[]){

        int n = arr.length;

        int max = -1;

        for(int i=0; i<n;i++){
            int currElement = arr[i];

            if (currElement>max) {
                max = currElement;
            }
        }


        return max;
    }

    static int countEven(int arr[]){

    int count = 0;

    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            //even
            count++;
        }
    }


        return count;
    }

    static void incrementNumber(int num){
        num++;
    }

    static void incrementArray(int arr[]){
        arr[0]++;
    }

    static void reverseArray(int[] arr){
        // 1 3 4 5
        // 5 4 3 1

        int start =0;
        int end = arr.length -1;

        while (start<end) {
            swap(arr,start,end);
            start++;
            end--;
        }

        
    }

    static void swap(int arr[],int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


    static int secondLargestElement(int arr[]){
        int largest = -1;
        int secondLarget = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLarget = largest;
                largest = arr[i];
            }
        }

        return secondLarget;


    }

    static void intersectionArray(int arr1[],int[]arr2){

        for(int i=0;i<arr1.length;i++){
            int curr1 = arr1[i];
            for(int j=0;j<arr2.length;j++){
                if(curr1 == arr2[j]){
                    System.out.println(curr1);
                }
            }

         ;
        }
    }

    static void countElement(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<  ; j++){
                
            }
        }
    }
}
