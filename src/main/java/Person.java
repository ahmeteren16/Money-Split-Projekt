package org.example;

public class Person {

    private String name;
    private double gezahlt;
    private double balance;

    public  Person(String name, double gezahlt) {
        this.name = name;
        this.gezahlt = gezahlt;
    }
    public void setBalance(double balance) { this.balance = balance; }


    public String getName(){
        return name;
    }

    public double getGezahlt() {
        return gezahlt;
    }

    public double getBalance() {
        return balance;
    }
}
