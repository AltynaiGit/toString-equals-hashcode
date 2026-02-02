package org.example;

public class Main {
    static void main() {
        Person p1 = new Person("Trump", 80);
        Person p2 = new Person("Trump", 80);
        Person p3 = new Person("Putin", 70);

        System.out.println(p1);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.hashCode());
    }
}
