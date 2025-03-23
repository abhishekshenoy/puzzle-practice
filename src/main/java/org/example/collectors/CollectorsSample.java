package org.example.collectors;

import java.util.List;

public class CollectorsSample {

    public static List<Person> createPerson(){
        return List.of(new Person("abhi",30),
                new Person("sid",32),
                new Person("kan",26),
                new Person("ravi",31),
                new Person("gul",36)
                );
    }
    public static void main(String args[]){
        createPerson()
                .stream()//Lazy evaluation
                .filter(person -> person.age>30)
                .forEach(System.out::println);

        createPerson()
                .stream()
                .map(Person::getAge)
                //.reduce(0,(total,age)->total+age);
                //.reduce(0,(total,age)->Integer.sum(total,age));
                .reduce(0,Integer::sum);
        ;

    }

}
