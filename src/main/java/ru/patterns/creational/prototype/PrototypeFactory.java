package ru.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

    private static final Map<String, Prototype> prototypes = new HashMap<>();

    static {
        var productA = new ProductA();
        prototypes.put(productA.getName(), productA);
        var productB = new ProductB();
        prototypes.put(productB.getName(), productB);
    }

    public static Prototype getPrototype(String type) {
        try {
            return prototypes.get(type).clone();
        } catch (NullPointerException ex) {
            System.out.println("Prototype with name: " + type + ", doesn't exist");
            return null;
        }
    }
}
