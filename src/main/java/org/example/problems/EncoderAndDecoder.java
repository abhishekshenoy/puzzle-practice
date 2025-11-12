package org.example.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EncoderAndDecoder {
    public static String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();
        String delimiter = "\u00E9";
        for(String str : strs){
            int length = str.length();
            sb.append(str);
            sb.append(delimiter);
        }
        return sb.toString();
    }

    public static List<String> decode(String str) {
        String delimiter = "\u00E9";
        String[] strs = str.split(delimiter);
        if (str=="") {
            return new ArrayList<>();
        }
        else if(strs.length==0) {
            return Arrays.asList("");
        } else {
            return Arrays.asList(str.split(delimiter));
        }
    }
    public static void main(String args[]){
        String[] strs = new String[]{"neet","code","love","you"};
        System.out.println(encode(Arrays.asList(strs)));
        System.out.println(decode(encode(Arrays.asList(strs))));
    }
}
