package com.galinachitak.main;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int weight;
    private int growth;

    public Person(String name, String surname, int age, int weight, int growth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.growth = growth;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person that = (Person) o;
        return name.equals(that.name) && surname.equals(that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", growth=" + growth +
                '}';
    }
}
