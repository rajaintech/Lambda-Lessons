package com.lambda.exercise;

import java.util.*;

public class LambdaExerciseJava7Way {
    public static void main(String args[]) {
        List<Person> personList = Arrays.asList(
            new Person("Tom", "Nav", 30),
            new Person("Andrew", "Trainer", 41),
            new Person("Mark", "Winkworth", 55),
            new Person("Super", "Start", 67),
            new Person("Vijay", "Antony", 45)
    );
    //1. sort list by last name
        Collections.sort(personList, new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    });
    //2. print all element in the list
        System.out.print("Printing all person information:\n");
    printPersonList(personList);

    //3. print last name beginning with S
        System.out.print("Printing  person last name starts with S:\n");
    printPersonCBasedOnRule(personList, new Rule() {
        @Override
        public boolean printOnRule(Person person) {
            return person.getLastName().startsWith("S");
        }
    });

        System.out.print("Printing person first name starts with V\n");
    printPersonCBasedOnRule(personList, new Rule() {
        @Override
        public boolean printOnRule(Person person) {
            return person.getFirstName().startsWith("V");
        }
    });
}

    private static void printPersonCBasedOnRule(List<Person> personList, Rule rule) {
        for (Person person : personList) {
            if (rule.printOnRule(person)) {
                System.out.println(person);
            }
        }
    }

    private static void printPersonList(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}

interface Rule {
    boolean printOnRule(Person person);
}
