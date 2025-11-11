package org.example.problems;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagrams {

    public static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer> string1Map = new HashMap<>();
        HashMap<Character,Integer> string2Map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            string1Map.put(s.charAt(i),string1Map.getOrDefault(s.charAt(i),0)+1);
            string2Map.put(t.charAt(i),string2Map.getOrDefault(t.charAt(i),0)+1);
        }

        return string1Map.equals(string2Map);
    }



    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String str : strs){
            int[] nums = new int[26];
            for(char c : str.toCharArray()){
                nums[c - 'a']++;
            }
            String key = Arrays.toString(nums);
            res.putIfAbsent(key,new ArrayList<>());
            res.get(key).add(str);
        }
        return new ArrayList<>(res.values());
    }

    public static void main(String args[]){
        String [] strs = new String[]{"act","pots","tops","cat","stop","hat"};
        groupAnagrams(strs);
    }
}
