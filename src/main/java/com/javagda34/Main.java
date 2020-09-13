package com.javagda34;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(integers);
        integers.add(5);
        System.out.println(integers);


        Optional<Integer> wynik = metoda(5, 3, 4);
        if(wynik.isPresent()) {
            Integer intWynik = wynik.get();
            byte b = intWynik.byteValue();
        }

//        integers.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return false;
//            }
//        })

        Deque<String> queue = new LinkedList<>();
        // FIFO - Queue
        // LIFO - Stack

        // Comparable
        // Comparator
        List<Student> students = new ArrayList<>();
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getSurname().compareTo(t1.getSurname());
            }
        });

    }

    public static Optional<Integer> metoda(Integer... zmienna){
        if(zmienna.length == 2){
            return Optional.of(5);
        }
        return Optional.empty();
    }
}
