package ru.patterns.creational.prototype;

public class ProductA implements Prototype {
    @Override
    public Prototype clone() {
        return new ProductA();
    }

    @Override
    public void execute() {
        System.out.println("This is " + getName());
    }
}
