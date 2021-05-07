package com.company;

import java.time.LocalDate;
import java.util.LinkedList;

public class Actor {
    private String name;
    private String surname;
    private int age;
    private LocalDate dateOfBirth;
    private Gender gender;
    private boolean hasOscar;
    private LinkedList<Movie> movies;
}
