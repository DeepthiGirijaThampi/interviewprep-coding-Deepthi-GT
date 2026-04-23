package com.deepthi.interviewprep;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers, return the indices of the
// two numbers such that they add up to a target.
public class TwoSum {
    // Example: Given nums = [2, 7, 11, 15], target = 9,
    // Because nums[0] + nums[1] = 2 + 7 = 9,
    // return [0, 1].
    public int[] twoSum(int[] nums, int target){
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int []{-1,-1};

    }

    // Optimized approach using a hash map
    public int[] twoSumOptimized(int[] nums,int target){
        Map<Integer,Integer> indices = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            // Check if complement exists in map
            if(indices.containsKey(complement)){
                // If yes → return indices
                return new int[]{indices.get(complement),i};
            }
            else{
                // Else →Store current number and its index
                indices.put(nums[i],i);
            }

        }
        return new int[]{-1, -1};
    }

    //
}
