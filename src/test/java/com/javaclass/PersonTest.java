package com.javaclass;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testPersonAttributes() {
        Person person = new Person("Alice", "Smith", "123456", 1990, "USA", 'M');

        assertEquals("Alice", person.getName());
        assertEquals("Smith", person.getSurname());
        assertEquals("123456", person.getIdNumber());
        assertEquals(1990, person.getBirthYear());
        assertEquals("USA", person.getCountryOfBirth());
        assertEquals('M', person.getGender());
    }
}
