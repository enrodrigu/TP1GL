package fr.erodrigu;

import fr.erodrigu.demo.Money;

public class Main {
    public static void main(String[] args) {
        Money monnaie = new Money(42,"EUR");

        System.out.println(monnaie);
    }
}