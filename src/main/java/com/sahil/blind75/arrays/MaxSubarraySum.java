package com.sahil.blind75.arrays;

public class MaxSubarraySum {
    public int maxSubArrayNaive(int[] nums) {
        int n=nums.length;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int currentSum=0;
            for(int j=i;j<n;j++){
                currentSum+=nums[j];
                maxSum=Math.max(maxSum,currentSum);
            }
        }
        return  maxSum;
    }
    public int maxSubArrayOptimal(int[] nums) {
        int n=nums.length;
        int maxSum=nums[0];
        int currentSum=nums[0];
        for(int i=1;i<n;i++){
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        return  maxSum;
    }
}
