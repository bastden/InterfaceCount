package com.my;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testPerson() throws Exception {
        Person person = new Person(16, "Kate");
        assertFalse(person != null);
    }


}