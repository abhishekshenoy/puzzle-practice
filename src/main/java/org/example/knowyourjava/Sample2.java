package org.example.knowyourjava;

import java.util.Arrays;
import java.util.List;

public class Sample2 {
    public static void main(String arg[]){
        //Not immmutable
        //List<Integer> numbers = Arrays.asList(1,2,3);
        //Immutable
        List<Integer> numbers = List.of(1,2,3);
        try{
            numbers.add(4);
        }catch (Exception ex){
            System.out.println("Cannot add an integer");
        }

        try{
            numbers.set(2,4);
        }catch (Exception ex){
            System.out.println("Cannot set an integer");
        }
    }
}
