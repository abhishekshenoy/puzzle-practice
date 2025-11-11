package org.example.problems;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> topKFrequent = new HashMap<>();
        for(int i : nums){
            topKFrequent.put(i,topKFrequent.getOrDefault(i,0)+1);
        }
        return topKFrequent.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(x->x.getKey())
                .collect(Collectors.toList()).stream().mapToInt(Integer::intValue).limit(k).toArray();
    }
    public static void main(String args[]){

    }
}