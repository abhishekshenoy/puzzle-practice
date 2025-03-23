package org.example.knowyourjava;

import java.util.ArrayList;
import java.util.List;

public class Sample3 {
    public static void main(String args[]) {
        while (true) {
            List<String> names = List.of("abhishek", "ravi", "sid", "kan");
            List<String> innerUpperCase = new ArrayList<>();

            names.stream().parallel()
                    .map(String::toUpperCase)
                    .forEach(innerUpperCase::add);

            System.out.println(names.size());
            System.out.println(innerUpperCase.size());
        }
    }
}
