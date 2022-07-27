package com.btb.Day7;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ComparableComparator_2 {
    public static void main(String[] args) {
        PersonDetails p3 = new PersonDetails("name3", 325, 50);
        PersonDetails p1 = new PersonDetails("name1", 123, 77);
        PersonDetails p2 = new PersonDetails("name2", 456, 25);

        List<PersonDetails> personList = new ArrayList<>();

        personList.add(p2);
        personList.add(p3);
        personList.add(p1);

        for (PersonDetails p : personList){
            System.out.println(p.getName() + " " + p.getAge() + " " + p.getSsn());
        }

        Collections.sort(personList, new AgeComparator());

        for (PersonDetails p : personList){
            System.out.println(p.getName() + " " + p.getAge() + " " + p.getSsn());
        }

    }
}

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
class PersonDetails implements Comparable<Person> {
    String name;
    int ssn;
    int age;

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }
}

class AgeComparator implements Comparator<PersonDetails>{
    @Override
    public int compare(PersonDetails o1, PersonDetails o2) {
        if (o1.getAge() > o2.getAge()){
            //System.out.println(o1.getName() + " is older than " + o2.getAge());
            return 1;
        }
        if (o1.getAge() < o2.getAge()){
            //System.out.println(o1.getName() + " is younger than " + o2.getAge());
            return -1;
        }
        return 0;
    }
}