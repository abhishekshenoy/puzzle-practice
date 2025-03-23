package org.example;

import java.util.Arrays;

public class ProductExceptSelf {

    //https://www.youtube.com/watch?v=M-jZe11aoto
    public int[] productExceptSelfBrute(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0 ;i <nums.length;i++){
            int prod = 1;
            for(int j=0 ; j<nums.length;j++){
                if(j==i)
                    continue;
               prod=prod*nums[j];
            }
            ans[i]=prod;
        }
        return ans;
    }

    public int[] productExceptSelfDivideZero(int[] nums) {
        int[] ans = new int[nums.length];
        int prod = 1;
        for(int i=0 ;i <nums.length;i++){
                prod=prod*nums[i];
        }

        for(int i=0 ;i <nums.length;i++){
            if(nums[i]!=0){
                ans[i] = prod/nums[i];
            }else{
                ans[i] = 0;
            }
        }
        return ans;
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;

        for(int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }

        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
        return ans;
    }

    public static void main(String args[]){
        ProductExceptSelf ps = new ProductExceptSelf();
    }
}
