package org.example.knowyourjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Sample1 {
    public static void  main(String[] args){

        List<Integer> dataList = new ArrayList<>(List.of(1,2,3,4));
        System.out.println(dataList);
        dataList.remove(1);
        System.out.println(dataList);

        Collection<Integer> dataCollection = new ArrayList<>(List.of(1,2,3,4));
        System.out.println(dataCollection);
        dataCollection.remove(1);
        System.out.println(dataCollection);

    }
}

