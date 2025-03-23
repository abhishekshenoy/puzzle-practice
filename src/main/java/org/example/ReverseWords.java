package org.example;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWords {

    //String array

    public String reverseWords(String s) {
        String[] listOfWords = s.trim().split(" ");
        for(int i=0 ; i<listOfWords.length/2; i++){
            String temp = listOfWords[i];
            listOfWords[i]= listOfWords[listOfWords.length-1-i];
            listOfWords[listOfWords.length-1-i] = temp;
        }
        return Arrays.stream(listOfWords).reduce("",(x,y)->(x.trim()+" "+y.trim()).trim());
    }
    public static void main(String args[]){
        ReverseWords rw = new ReverseWords();
        System.out.println(rw.reverseWords("the sky is blue"));
        System.out.println(rw.reverseWords("  hello world  "));
        System.out.println(rw.reverseWords("a good   example"));
        System.out.println(rw.reverseWords("EPY2giL"));
    }
}
