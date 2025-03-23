package org.example;

public class VirtualThreadPractice {
    public static void main(String[] args){
        Thread.ofPlatform().start(()->System.out.println(Thread.currentThread()));
    }
}
