package com.galinachitak.main;

import java.util.*;

public class PersonFactory {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println(generatePersons(100));
        System.out.println(" ");
        System.out.println("Оригинал: " + persons.size());
        System.out.println(" ");
        System.out.println("После удаления дубликатов: " + removeDuplicates().size());
        System.out.println(" ");
        System.out.println(removeDuplicates());
    }

    public static Random RANDOM = new Random();
    public static String[] NAME = {"Sara", "Oleg", "Galina", "Alex", "Max"};
    public static String[] SURNAME = {"Chitak", "Omelchuna", "Lykach", "Collorado","Chrek"};

    private static final List<Person> persons = new ArrayList<>();


    public static List<Person> generatePersons(int count) {
        for (int i = 0; i < count; i++) {

            String name = NAME[RANDOM.nextInt(NAME.length)];
            String surname = SURNAME[RANDOM.nextInt(SURNAME.length)];

            int age = RANDOM.nextInt(90 - 18 + 1) + 18;
            int weight = Math.round((RANDOM.nextInt(100 - 65 + 1) + 65));
            int growth = RANDOM.nextInt(200 - 140 + 1) + 140;
            Person person = new Person(name, surname, age, growth, weight);
            persons.add(person);
        }

        return persons;
    }


        static Set<Person> removeDuplicates() {

                return new HashSet<>(PersonFactory.persons);
    }
}


