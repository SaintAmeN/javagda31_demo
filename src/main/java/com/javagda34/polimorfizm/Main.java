package com.javagda34.polimorfizm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ptak kukulka = new Kukulka();
        kukulka.spiewaj(); // kuku

        Ptak p = new Ptak();
        p.spiewaj(); // tralalala

        List<Ptak> list = new ArrayList<>();


    }
}
