package org.example.problems;

import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }
        int[] output = new int[2];
        for(int i=0;i<nums.length;i++){
            int rem = target-nums[i];
            if(indices.containsKey(rem)&&indices.get(rem)!=i){
                output = new int[]{i,indices.get(rem)};
                break;
            }
        }

        return output;
    }
    public static void main(String args[]){

        int[] nums = new int[]{1,3,4,2};
        int target=6;
        twoSum(nums,target);
    }
}
