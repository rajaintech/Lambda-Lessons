package com.lambda.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExerciseJava8Way {
    public static void main(String args[]) {
        List<Person> personList = Arrays.asList(
                new Person("Tom", "Nav", 30),
                new Person("Andrew", "Trainer", 41),
                new Person("Mark", "Winkworth", 55),
                new Person("Super", "Start", 67),
                new Person("Vijay", "Antony", 45)
        );

        //1. sort list by last name
        Collections.sort(personList, (P1, P2) -> P1.getLastName().compareTo(P2.getLastName()));


        //2. print all element in the list
        System.out.print("Printing all person information:\n");
        printPersonCBasedOnRule(personList, person -> true);

        //3. print last name beginning with S
        System.out.print("Printing  person last name starts with S:\n");
        printPersonCBasedOnRule(personList, person ->  person.getLastName().startsWith("S"));

        System.out.print("Printing person first name starts with V\n");
        printPersonCBasedOnRule(personList, person -> person.getFirstName().startsWith("V"));
    }

    private static void printPersonCBasedOnRule(List<Person> personList, Rule rule) {
        for (Person person : personList) {
            if (rule.printOnRule(person)) {
                System.out.println(person);
            }
        }
    }


}

