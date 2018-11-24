package shild.comparableComparator;

import java.util.TreeSet;

public class  Person implements Comparable<Person> {


    private String name;

    public Person(String value) {
        name = value;
    }

    String getName() {
        return name;
    }

    @Override
    public int compareTo(Person p) {
        return name.length() - p.getName().length();
    }
    TreeSet<Person> personTreeSet = new TreeSet<>();

    }

