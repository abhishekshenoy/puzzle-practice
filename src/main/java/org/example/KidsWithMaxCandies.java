package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KidsWithMaxCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandyValue = Arrays.stream(candies).max().getAsInt();
        return IntStream.of(candies).boxed().map(candy-> {
            return (candy + extraCandies) >= maxCandyValue;
        }).collect(Collectors.toList());
    }

    public static void main(String args[]){
        KidsWithMaxCandies kds = new KidsWithMaxCandies();
        kds.kidsWithCandies(new int[]{2,3,5,1,3},3);
        kds.kidsWithCandies(new int[]{4,2,1,1,2},1);
        kds.kidsWithCandies(new int[]{12,1,12},10);

    }
}
