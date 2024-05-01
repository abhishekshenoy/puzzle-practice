package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReverseVowels {
    public String reverseVowels(String s) {
        List<Integer> postions = new ArrayList<Integer>();
        for(int i =0 ; i < s.length(); i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
                    || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                postions.add(i);
            }
        }
        char[] c = s.toCharArray();
        for(int i=0 ; i<postions.size()/2; i++){
            char temp = c[postions.get(i)];
            c[postions.get(i)] = c[postions.get(postions.size()-1-i)];
            c[postions.get(postions.size()-1-i)] = temp;
        }
        return String.valueOf(c);
    }

    public static void main(String args[]){
        ReverseVowels rw = new ReverseVowels();
        System.out.println(rw.reverseVowels("hello"));
        System.out.println(rw.reverseVowels("leetcodd"));
        /*
        leetcedo
        loetcede
         */
    }
}
