package org.example.problems;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> intMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> intArray = intMap.getOrDefault(nums[i], new ArrayList<>());
            intArray.add(i);
            intMap.put(nums[i], intArray);
        }

        HashSet<List<Integer>> output = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int twoSum = nums[i] + nums[j];
                int missingValue = -twoSum;
                if (intMap.containsKey(missingValue)) {
                    ArrayList<Integer> list = intMap.get(missingValue);
                    for (int x : list) {
                        if ((x != i) && (x != j)) {
                            List<Integer> internalList = new ArrayList<>();
                            internalList.add(nums[i]);
                            internalList.add(nums[j]);
                            internalList.add(nums[x]);
                            internalList.sort(Integer::compareTo);
                            output.add(internalList);
                        }
                    }
                }
            }
        }
        return output.stream().toList();
    }


    public static List<List<Integer>> threeSumNew(int[] nums) {
        HashMap<Integer, Integer> intMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            intMap.put(nums[i], i);
        }

        HashSet<List<Integer>> output = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int twoSum = nums[i] + nums[j];
                int missingValue = -twoSum;
                if (intMap.containsKey(missingValue)) {
                    int x = intMap.get(missingValue);
                    if ((x != i) && (x != j)) {
                        List<Integer> internalList = new ArrayList<>();
                        internalList.add(nums[i]);
                        internalList.add(nums[j]);
                        internalList.add(nums[x]);
                        internalList.sort(Integer::compareTo);
                        output.add(internalList);
                    }
                }
            }
        }
        return output.stream().toList();
    }

    public static void main(String args[]) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
        System.out.println(threeSumNew(nums));
    }
}
