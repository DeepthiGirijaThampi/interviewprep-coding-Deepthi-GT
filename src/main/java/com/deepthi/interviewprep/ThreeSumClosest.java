package com.deepthi.interviewprep;

import java.util.Arrays;
//Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.
//
//Return the sum of the three integers.
//
//You may assume that each input would have exactly one solution.

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = nums[0]+nums[1]+nums[2];
        for(int i =0; i<n-2; i++){
            int left = i + 1;
            int right = n - 1;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(target - sum) < Math.abs(target - result)){
                    result = sum;
                }
                if(sum == target) return target;
                else if(sum < target)
                    left ++ ;
                else
                    right -- ;
            }
        }
        return result;
    }

}
