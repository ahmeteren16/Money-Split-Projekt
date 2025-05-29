package org.example;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> persons =  List.of(
                new Person("Willi", 320),
                new Person("Tim", 140),
                new Person("Gaby", 48),
                new Person("Karl", 0));

        DebtorsCreditors dc = new DebtorsCreditors(persons);
        Berechnung berechnung = new Berechnung(dc.debtors(), dc.creditors());

        for (Uberweisung t : berechnung.Uberweisungen()) {
            System.out.println(t);
        }

    }


}