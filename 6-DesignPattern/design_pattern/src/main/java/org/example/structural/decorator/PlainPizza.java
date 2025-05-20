package org.example.structural.decorator;

public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Pizza de base";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
