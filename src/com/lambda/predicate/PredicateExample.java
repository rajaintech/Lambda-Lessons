package com.lambda.predicate;

import com.lambda.exercise.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateExample {
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
        performOnRule(personList, person -> true, person -> System.out.println(person));

        //3. print last name beginning with S
        System.out.print("Printing  person last name starts with S:\n");
        performOnRule(personList, person -> person.getLastName().startsWith("S"), person -> System.out.println(person));

        System.out.print("Printing person first name starts with V\n");
        performOnRule(personList, person -> person.getFirstName().startsWith("V"), person -> System.out.println(person.getFirstName()));
    }

    private static void performOnRule(List<Person> personList, Predicate<Person> rule, Consumer<Person> consumer) {
        for (Person person : personList) {
            if (rule.test(person)) {
                consumer.accept(person);
            }
        }
    }
}
