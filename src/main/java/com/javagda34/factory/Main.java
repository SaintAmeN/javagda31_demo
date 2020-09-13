package com.javagda34.factory;

import com.javagda34.factory.money.Money;
import com.javagda34.factory.money.MoneyFactory;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static final Integer zmienna = 3;

    public static void main(String[] args) {
        Money m5 = MoneyFactory.create5usd();
        Money m10 = Money.create10PLN();
        Money.Obiekty o = new Money.Obiekty();

        String k = "I have a common prefixCa";
        String h = "I have a common prefixDB";

        System.out.println(k.hashCode());
        System.out.println(h.hashCode());

        Set<String> set = new HashSet<>();
        set.add(k);
        set.add(h);

        System.out.println(set);

        Map<String, String> t = new HashMap<>();
        t.put(k, "cos");
        t.put(h, "cos innego");

        System.out.println(t);

        LocalDateTime dtBitwa = LocalDateTime.of(1410, 7, 15, 12, 00, 00);
        LocalDateTime teraz = LocalDateTime.now();

        Period period = Period.between(dtBitwa.toLocalDate(), teraz.toLocalDate());
        System.out.println(period);

        Duration duration = Duration.between(dtBitwa, teraz);
        System.out.println(duration);
    }
}
