package de.bentolor.java9to14samples.jvm;

public class ThrowNullPointer {
    public static void main(String[] args) {
        var p = new Person("Peter", null);
        var e = p.email().toLowerCase();
    }

    record Person(String name, String email) {}

}
