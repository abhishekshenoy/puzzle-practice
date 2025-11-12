package org.example.problems;

public class ValidPalindrome {

    public static boolean isPalindrome(String s){
        boolean isValid = true;
        char[] chrs = s.replaceAll(" ","").replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        int j = chrs.length-1;
        for(int i=0; i< chrs.length/2;i++){
            if(chrs[i]!=chrs[j]){
                return false;
            }
            j--;
        }
        return isValid;
    }

    public static void main(String args[]){
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
    }
}
