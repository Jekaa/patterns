package ru.patterns.creational.prototype;

import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args) {
        for (String type : List.of("ProductA", "ProductB", "ProductC")) {
            Prototype prototype = PrototypeFactory.getPrototype(type);
            if (prototype != null) {
                prototype.execute();
            }
        }
    }
}