/**
 * Square of a Sorted Array
 * Given:
 * 1. An integer array sorted in increasing or non-decreasing order, 
 * 2. Return an array of the squares of each number sorted in increasing order.
 * Example 1:
 * Input   :   {-5, -3, 0, 7, 9}
 * Output  :   {0, 9, 25, 49, 81} 

 * Example 2:
 * Input   :   {-3, -1, 2, 4, 6}
 * Output  :   { 1, 4, 9, 16, 36} 
 * 
 * Methods: 
 * Method 1. Brute Force Method 
 *      - RUN a loop on the array and Square the elements of the array.(brute force)                                              
 *      - Sort the squared array and return it.                                              
 * Method 2. Using Two pointer Method
 * Sorting (Quick sort, Merge sort, buble sort, insertions sort, etc)
 */

import java.util.*;

public class SqSortedArray {   
    public static void main(String[] args){
        int arr[] = {-5,-3,0,7,9};
        printArray("Input", arr);
        printArray("Output", sortedSquare1(arr));
        printArray("Output", sortedSquare2(arr));
    }

    // Brute force method
    // Time complexity = O(n) + O(nlogn) = nlogn
    public static int[] sortedSquare1(int nums[]){
        for(int i = 0; i < nums.length; i++){
            nums[i] *= nums[i];
        }
        // Any Sorting Algorithm: Quick sort, Merge sort, bubble sort, insertion sort, etc
        Arrays.sort(nums);                    
        return nums;
    }

    // Two pointer method
    // Time complexity = O(n)
    // Space complexity = O(n)
    public static int[] sortedSquare2(int nums[]) {
        int n = nums.length;
        int l = 0, r = n-1;
        int resultArray[] = new int[n];
        while(l<r){
            if(Math.abs(nums[l]) > Math.abs(nums[r])) {
                resultArray[n-1] = nums[l] * nums[l];
                l++;
            }else{ 
                resultArray[n-1] = nums[r] * nums[r];
                r--;
            }
            n--;
        }
        return resultArray;
    }

    public static void printArray(String prefix, int arr[]){
        System.out.println(prefix + " : " + Arrays.toString(arr) + "\n");
    }
}