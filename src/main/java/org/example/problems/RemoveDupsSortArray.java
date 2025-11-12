package org.example.problems;

public class RemoveDupsSortArray {

    public static int removeDuplicates(int[] nums){
        int duplicateIndex = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[duplicateIndex]){
              nums[++duplicateIndex]= nums[i];
            }
        }
        return duplicateIndex+1;
    }
    public static void main(String args[]){
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
}
