package com.javagda34;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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
    }

    public static Optional<Integer> metoda(Integer... zmienna){
        if(zmienna.length == 2){
            return Optional.of(5);
        }
        return Optional.empty();
    }
}
