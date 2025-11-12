package org.example.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProdArrayExcSelf {
    public static int[] productExceptSelf(int[] nums) {
        int product = 1 ;
        int zeroCount = 0;
        int zeroIndex = -1;
        int zeroProduct = 1;

        List<Integer> finalNums = new ArrayList<Integer>();
        for(int i =0 ; i<nums.length ; i++){
            if(zeroCount==0 && nums[i]==0){
                zeroCount=1;
                zeroIndex = i;
                zeroProduct = product;
                product = product*nums[i];
            }else{
                product = product*nums[i];
                zeroProduct = zeroProduct*nums[i];
            }
        }

        for(int i=0 ; i<nums.length ; i++){
            if(zeroCount==1 && nums[i]==0){
                finalNums.add(zeroProduct/1);
            }else{
                finalNums.add(product/nums[i]);
            }
        }

        return finalNums.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String args[]){

        int[] nums= new int[]{-1,0,1,2,3};
        Arrays.stream(nums).toArray();
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }
}
