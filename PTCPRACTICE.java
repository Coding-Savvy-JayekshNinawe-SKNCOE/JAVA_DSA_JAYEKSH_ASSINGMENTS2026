import java.util.Arrays;
import java.util.Stack;

public class PTCPRACTICE{
    public static void main(String[] args) {
    //     int arr[] = {2,7,11,15};
    //     int ans[] = twoSum(arr, 9);
    //   for (int i : ans) {
    //     System.out.println(i);
    //   }

        // String str = "abcadba";
        // System.out.println(longestSubstring(str));
        // int arr[] = {1,2,4,5};
        // int ans = findMissingNumber(arr);
        // System.out.println(ans);

       // reverseWord("I love coding");

    //    boolean ans = palindromeNumber(121);
    //    System.out.println(ans);

    // int arr[] = {3,2,3};
    // System.out.println(majorityElements(arr));

    //System.out.println(nonRepeatingCharacter("leetcode"));

    //System.out.println(validParenthesis("()[]{}}"));

    int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

    System.out.println(kadanesAlgo(arr));

    }

    public static int[] twoSum(int arr[],int target){

       int start =0;
       int end = arr.length-1;

       while (start<=end) {
        int sum = arr[start]+arr[end];
            if(sum==target){
                return new int[]{start,end};
            }
            if (sum<target) {
                start++;
            } else {
                //sum > target
                end--;
            }
       }
        
         return new int[]{-1,-1};
    }

    public static int longestSubstring(String str){

       int max = -1;

        for(int i=0;i<str.length();i++){
            boolean[] visited = new boolean[256];

            int length  = 0;

            for(int j=i;j<str.length();j++){

                char currentChar = str.charAt(j); //asci valu
                if(visited[currentChar]==true){
                    break; // repeated
                }
                //not visted
                visited[currentChar] = true;
                length++;
                
                max = Math.max(max,length);
            }

        }


       return max;
    }

    public static boolean checkAnagram(String s1, String s2){

        if(s1.length()!=s2.length()) return false;

        boolean ans = true;

        boolean[] visted = new boolean[256];

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            visted[ch] = true;
        }
        

        for(char ch:s2.toCharArray()){
            if(visted[ch]==false){
                ans = false;
            }
        }

        return ans;

    }

    static int checkDuplicate(int arr[]){
        Arrays.sort(arr); //sort

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                //its duplicate
                return arr[i];
            }
        }

        return -1;
    }

    static int[] mergeTwoSortedArray(int arr1[], int arr2[]){
        int finalArray[] = new int [arr1.length + arr2.length];

        int idx = 0;
        int arr1Pointer = 0;
        int arr2Pointer = 0;

        while (arr1Pointer==arr1.length || arr2Pointer == arr2.length) {
            if(arr1[arr1Pointer]<=arr2[arr2Pointer]){
                finalArray[idx] = arr1[arr1Pointer];
                arr1Pointer++;
                idx++;
            }else{
                finalArray[idx++] = arr2[arr2Pointer];
                arr2Pointer++;
            }
        }
    
        //as it is copy
        while(arr1Pointer<arr1.length){
            finalArray[idx++] = arr1[arr1Pointer++];
        }

        while (arr2Pointer<arr2.length) {
             finalArray[idx++] = arr2[arr2Pointer++];
        }

        return finalArray;
    
    }

    static int findMissingNumber(int arr[]){
        // Input: `[1,2,4,5]`
        // Output: `3`
        int currLength =0;
        for (int i : arr) {
            currLength+=i; //12
        }

        int n = arr[arr.length-1];
        int totalLength = 0;
        for(int i=1; i<=n;i++){
            totalLength+=i;
        }

        return totalLength - currLength;




    }

    static void reverseWord(String word){
        // Input: `"I love coding"`
        // Output: `"coding love I"`
        String ans = "";
        String words[] = word.split(" ");
        for(int i=words.length-1; i>=0; i--){
            ans = words[i] + " ";
        }

        ans = ans.trim();

        System.out.println(ans);

    }

    static boolean palindromeNumber(int number){

        //121 - palindrome
        String numberString = Integer.toString(number);

        int start = 0;
        int end = numberString.length()-1;

        while(start<end){
            if(numberString.charAt(start)!=numberString.charAt(end)){
                return false;
            }
            start++;
            end--;
    
        }

        return true;

    }

    static int majorityElements(int[] arr){
        // Input: `[3,2,3]`
        // Output: `3`

        int candidate = -1;
        int vote = 0;

        for(int i=0;i<arr.length;i++){
            if(vote==0){
                candidate = arr[i];
                vote = 1;
            }else{
                if(arr[i]==candidate){
                vote++;
            }else{
                vote--;
            }
        }
            }

         


        return candidate;

    }

    static char nonRepeatingCharacter(String str){
        // Input: `"leetcode"`
        // Output: `l`
        //first - travese sequentally 

     //   if(str.isEmpty()) return ''; //edge case

        int fmap[] = new int[26];
        for(char ch : str.toCharArray()){
            fmap[ch-'a']++;
        }

        for(int i=0;i<str.length();i++){
            if (fmap[str.charAt(i)-'a']==1) {
                return str.charAt(i);
        }
        }

        return '/';
    }

    static int[] intersectArray(int[] arr1, int[] arr2) {

    String str = "";

    for (int x : arr1) {
        for (int y : arr2) {
            if (x == y && str.contains(Integer.toString(x)) == false) {
                str += Integer.toString(x);
            }
        }
    }

    // convert string to array
    int[] ans = new int[str.length()];
    int idx = 0;

    for (char ch : str.toCharArray()) {
        ans[idx++] = Integer.parseInt(String.valueOf(ch));
    }

    return ans;
}

    static boolean validParenthesis(String input){
        // Input: `"()[]{}"`
        // Output: `true`

        Stack<Character> st = new Stack<>();
        
        for(var ch : input.toCharArray()){
            if(ch == '(' || ch =='[' || ch == '{'){
            st.push(ch);
        }else{
            //closing bracked case
            if(st.isEmpty()) return false;
            char top = st.pop();

            if(ch==')' && top != '(') return false;
            if(ch==']' && top != '[') return false;
            if(ch=='}' && top != '{') return false;
        }


    }
        
        return st.isEmpty();
}

    static int kadanesAlgo(int[] arr){
        // int maxi = arr[0];
        // int currSum = arr[0];
        
        // for(int i =1; i<arr.length;i++){
        //     currSum = Math.max(arr[i], currSum+arr[i]);

        //     maxi = Math.max(maxi,currSum);
        // }



        // return maxi;
        int currSum = 0;
        int maxi = Integer.MIN_VALUE;

        for(var val : arr){
            //-ve reset - curr sum
            //+ve - we compare

            currSum += val;
            

            if(currSum > maxi) maxi = currSum;

            if(currSum<0) currSum = 0;


        }

        return maxi;


    }

}