package org.example;

public class Main {
    static void main() {
        User u1 = new User("altynai@gmail", 1234, "Altynai");
        User u2 = new User("altynai@gmail", 1234, "Akylai");

        System.out.println(u1.equals(u2));
    }
}
