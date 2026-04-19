package com.deepthi.interviewprep;

import java.util.*;

public class Duplicates {

    //Given an array of integers, return true
    // if there are any duplicates.
    // Otherwise return false.
// nums = {2,3, 4, 2}
    public boolean duplicate(int[] nums){
        Set<Integer> num = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            if(num.contains(nums[i])){
                return true;
            }

            num.add(nums[i]); //else add the element
        }
        return false;
    }

    //not using set
    public boolean dublicateNotUnsingSet(int[] nums){
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
           if(nums[i]==nums[i+1]){
               return true;
           }
        }
        return false;
    }
}
