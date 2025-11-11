package org.example.problems;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean hasDuplicates(int[] nums){
        Set<Integer> numSets = new HashSet<>();
        for(int i: nums){
            if(numSets.contains(i)){
                return true;
            }else{
                numSets.add(i);
            }
        }
        return false;
    }

    public static void main(){

    }
}
