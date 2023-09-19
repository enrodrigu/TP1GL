package fr.erodrigu.demo;

import java.util.Objects;

public class Money {
    int amount;
    String currency;

    public Money(){
        amount = 0;
        currency = "EUR";
    }

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public Money add(Money moneyToAdd){
        return new Money(amount+=moneyToAdd.amount,this.currency);
    }

    @Override
    public String toString() {
        return amount+currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount && Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }
}
