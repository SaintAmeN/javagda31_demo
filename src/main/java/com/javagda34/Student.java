package com.javagda34;

public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private String pesel;

    // ten obiekt może być porównany do innego obiektu typu student
    @Override
    public int compareTo(Student innyStudent) {
        return surname.compareTo(innyStudent.surname);
    }

    public String getSurname() {
        return surname;
    }
}
