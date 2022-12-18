package ru.patterns.creational.prototype;

public interface Prototype {
    Prototype clone();
    default String getName() {
        return this.getClass().getSimpleName();
    }
    void execute();
}
