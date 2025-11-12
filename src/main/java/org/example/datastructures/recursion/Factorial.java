package org.example.datastructures.recursion;

public class Factorial {

    // n! = n*(n-1)*(n-2)*...*1
    // 5! = 5*4*3*2*1
    // 0! = 1
    // Worser then for looping as it needs extra 0(n) memory

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int m = n-1;
        return n*factorial(m);
    }
    public static void main(String args[]){
        System.out.println(factorial(6));
    }
}
