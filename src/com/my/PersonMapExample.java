package com.my;

import java.util.ArrayList;
import java.util.List;

public class PersonMapExample {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person person1 = new Person(34, "Peter");
        persons.add(person1);

        Person person2 = new Person(18, "John");
        persons.add(person2);

        Person person3 = new Person(80, "Jacob");
        persons.add(person3);

        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            if (person.age > 25) {
                System.out.println(person.name);
            }
        }
    }
}
