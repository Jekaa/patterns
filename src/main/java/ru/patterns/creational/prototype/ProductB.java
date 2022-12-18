package ru.patterns.creational.prototype;

public class ProductB implements Prototype {
    @Override
    public Prototype clone() {
        return new ProductB();
    }

    @Override
    public void execute() {
        System.out.println("This is " + getName());
    }
}
