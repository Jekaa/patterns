package ru.patterns.creational.abstractFactory;

/**
 * Фабрика смартфонов, реализует функционал создания объектов типа Phone
 */
public class PhoneFactory implements AbstractFactory<Phone> {
    @Override
    public Phone create(String productType) {
        switch (productType) {
            case "iphone": {
                return new Iphone();
            }
            case "samsung": {
                return new Samsung();
            }
            default: {
                throw new IllegalArgumentException("Unsupported device type: " + productType);
            }
        }
    }
}
