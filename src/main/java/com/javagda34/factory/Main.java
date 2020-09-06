package com.javagda34.factory;

import com.javagda34.factory.money.Money;
import com.javagda34.factory.money.MoneyFactory;

public class Main {
    public static void main(String[] args) {
        Money m5 = MoneyFactory.create5usd();
        Money m10 = Money.create10PLN();
    }
}
