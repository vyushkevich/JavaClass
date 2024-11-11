package com.javaclass;

public class Person {
    private String name;
    private String surname;
    private String idNumber;
    private int birthYear;
    private String countryOfBirth;
    private char gender; // 'H' for male, 'M' for female, 'O' for other

    // Constructor
    public Person(String name, String surname, String idNumber, int birthYear, String countryOfBirth, char gender) {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
        this.birthYear = birthYear;
        this.countryOfBirth = countryOfBirth;
        this.gender = gender;
    }

    // Method to print attribute values
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Country of Birth: " + countryOfBirth);
        System.out.println("Gender: " + gender);
    }

    // Getters (for testing purposes)
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getIdNumber() { return idNumber; }
    public int getBirthYear() { return birthYear; }
    public String getCountryOfBirth() { return countryOfBirth; }
    public char getGender() { return gender; }
}
