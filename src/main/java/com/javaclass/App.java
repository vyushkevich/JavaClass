package com.javaclass;

/**
 * Hello world!
 */

public class App {
    public static void main(String[] args) {
        // Creating two Person objects
        Person person1 = new Person("Alice", "Smith", "123456", 1990, "USA", 'M');
        Person person2 = new Person("Bob", "Johnson", "789012", 1985, "Canada", 'H');

        // Printing details of each person
        System.out.println("Details of Person 1:");
        person1.printDetails();

        System.out.println("\nDetails of Person 2:");
        person2.printDetails();
    }
}
