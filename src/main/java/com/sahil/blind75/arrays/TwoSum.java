package com.sahil.blind75.arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
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
}
