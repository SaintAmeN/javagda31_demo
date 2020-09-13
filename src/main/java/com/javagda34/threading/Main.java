package com.javagda34.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new Runnable() {
            @Override
            public void run() {

            }
        });

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hej");
            }
        });
    }
}
