package com.lambda.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExercise {
    public static void main(String args[]){
        List<Person> personList = Arrays.asList(
                new Person("Tom","Nav",30),
                new Person("Andrew","Trainer", 41),
                new Person("Mark", "Winkworth", 55),
                new Person("Super", "Start", 67),
                new Person("Vijay", "Antony", 45)
        );
        //1. sort list by last name
        //2. print all element in the list
        //3. print last name beginning with W
        personList.sort(Comparator.comparing(Person::getLastName));
    }
}
