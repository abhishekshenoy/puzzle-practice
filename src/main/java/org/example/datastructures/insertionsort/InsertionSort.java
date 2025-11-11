package org.example.datastructures.insertionsort;

import org.example.datastructures.insertionsort.Pair;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
    public static void main(String args[]){
//        System.out.println(Arrays.toString(insertionSort(new int[]{5,6, 3, 4, 2, 1})));

        List<Pair> kv = new ArrayList<>(List.of(new Pair(5, "apple"), new Pair(2, "banana"), new Pair(9, "cherry")));
        List<Pair> kv1 = new ArrayList<>();
        List<List<Pair>> keyValue =insertionSort(kv1);
        for (List<Pair> state : keyValue) {
            System.out.print("[");
            for (Pair pair : state) {
                System.out.print("(" + pair.key + ", " + pair.value + ") ");
            }
            System.out.println("]");
        }
    }

    public static int[] insertionSort(int[] numbers){
        int length = numbers.length;
        for(int i=1;i<length;i++){
            int j = i-1;
            while(j>=0 && numbers[j+1]<numbers[j]){
                int temp = numbers[j+1];
                numbers[j+1] = numbers[j];
                numbers[j]=temp;
                j=j-1;
            }
        }
        return numbers;
    }

    public static List<List<Pair>> insertionSort(List<Pair> keyValue){
        List<List<Pair>> allPaternsOfKV = new ArrayList<>();
        if (keyValue.isEmpty()) {
            return allPaternsOfKV; // Return empty list, not [[]]
        }
        allPaternsOfKV.add(new ArrayList<>(keyValue));
        int length = keyValue.size();
        for (int i =1 ; i<length;i++){
            int j=i-1;
            while(j>=0 && (keyValue.get(j+1).key<keyValue.get(j).key)){
                Pair temp = keyValue.get(j+1);
                keyValue.set(j+1,keyValue.get(j));
                keyValue.set(j,temp);
                j=j-1;
            }
            allPaternsOfKV.add(new ArrayList<>(keyValue));
        }
        return allPaternsOfKV;
    }
}
