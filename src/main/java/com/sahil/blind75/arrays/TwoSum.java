package com.sahil.blind75.arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSumOptimal(int[] nums, int target) {
        int n=nums.length;
        int [] ans=new int [2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int requiredSum=target-nums[i];
            if(map.containsKey(requiredSum)){
                ans[0]=map.get(requiredSum);
                ans[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
    public int [] twoSumNaive(int [] nums, int target){
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int []{i,j};
                }
            }
        }
        return new int [] {-1,-1};
    }
}
