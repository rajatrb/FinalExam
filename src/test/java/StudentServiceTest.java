
package com.FinalExam;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;

import java.io.PrintStream;
import java.util.HashMap;
import static java.util.Arrays.asList;


import java.io.ByteArrayOutputStream;


class StudentServiceTest {


        StudentService obj = new StudentService();

        public HashMap<String,String> address = new HashMap<String, String>();

        private final PrintStream standardOut = System.out;
        private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


        @Test
    void edit() {

        assertEquals(asList(""), asList(obj.getAddress());

    }

    @Test
    void delete() {

        ByteArrayInputStream in = new ByteArrayInputStream("Studentxyz\n123123\2.9".getBytes());
        System.setIn(in);

        obj.add();


        in = new ByteArrayInputStream("Studentabc\n000123\3.2".getBytes());
        System.setIn(in);

        obj.add();

        in = new ByteArrayInputStream("Studentxyz".getBytes());
        System.setIn(in);

        obj.delete();

        assertEquals(1,obj.address.size());

    }

    @Test
    void display() {
        ByteArrayInputStream in = new ByteArrayInputStream("Studentxyz\n123456\2.9".getBytes());
        System.setIn(in);

        obj.add();

        in = new ByteArrayInputStream("Studentabc\n000123\3.2".getBytes());
        System.setIn(in);

        obj.add();

        assertEquals(asList(address), asList(obj.getAddress()), () -> "They are arranged by insertion point");

    }

    @Test
    void update() {
    }
}