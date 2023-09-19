package fr.erodrigu.demo;

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

    @Override
    public String toString() {
        return amount+currency;
    }
}
