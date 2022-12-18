package ru.patterns.creational.abstract_factory;

import ru.patterns.creational.abstractFactory.PhoneFactory;

public class DemoAbstractFactoryPattern {
    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();
        System.out.println("Phone created: " + factory.create("iphone").getModel());
        System.out.println("Phone created: " + factory.create("samsung").getModel());
    }
}
