/**
 * Kadane's Algorithm : Largest Sum of Contiguous Subarray.
 * Given:
 * 1. Given an array Arr[] of N integers. 
 * 2. Find the contiguous sub-array(containing at least one number) 
 *    which has the maximum sum and return its sum.
 *
 * Example 1:
 * Input   :   {-1,2,3,-2,5}
 * Output  :   8 

 * Example 2:
 * Input   :   {-5,-1,-3,-4}
 * Output  :   -1
 
 * Methods to solve Largest Sum of Contiguous Subarray:
 * 
 * Method 1. Brute Force Method : 
 *                 By finding all the subarrays 
 *                 and check which one is maximum. 
 * Method 2. Using Kadane's Algorithm  
 *                 (Asked in many interviews: 
 *                 like Amazon, Microsoft, Walmart)
 */

import java.util.*;
class Solution{

    int maxSubarraySum(int arr[]){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            curSum += arr[i];
            if(curSum > maxSum) 
                maxSum = curSum;
            if(curSum < 0) curSum=0; 
        }
        return maxSum;
    }
}

class Kadane{

    public static void main(String args[]){
        Solution obj = new Solution();                  
        // int arr[] = {-1, 2 ,3, -2, 5};
        int arr[] = {-5, -1, -3, -4};

        System.out.println("Input : " + Arrays.toString(arr));
        System.out.println("\nSum of contiguous subarray with maximum sum: \n" + obj.maxSubarraySum(arr));
    }
    
}