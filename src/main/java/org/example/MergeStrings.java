package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MergeStrings {

    public static String mergeAlternately(String word1, String word2) {

        int word1Len = word1.length();
        int word2Len = word2.length();

        List<Character> mergedWord = new ArrayList<>();

        int len = Math.min(word1Len, word2Len);

        for(int i=0;i< len;i++){
            mergedWord.add(word1.charAt(i));
            mergedWord.add(word2.charAt(i));
        }

        String remainingChar = len == word1Len ? word2.substring(len) : word1.substring(len);

        for(int i =0 ; i<remainingChar.length();i++){
            mergedWord.add(remainingChar.charAt(i));
        }

        return mergedWord.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static String mergeAlternatelyV2(String word1, String word2) {

        int word1Len = word1.length();
        int word2Len = word2.length();

        StringBuilder sb = new StringBuilder();

        int len = Math.max(word1Len, word2Len);

        for(int i=0;i< len;i++){
            if(i<word1Len){
                sb.append(word1.charAt(i));
            }
            if(i<word2Len){
                sb.append(word2.charAt(i));
            }
        }


        return sb.toString();
    }

    public static void main (String args[]){
        System.out.println(mergeAlternatelyV2("abcd","pqrs"));
    }
}
