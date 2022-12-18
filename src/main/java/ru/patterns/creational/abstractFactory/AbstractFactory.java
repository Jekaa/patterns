package ru.patterns.creational.abstractFactory;

/**
 * Абстрактная фабрика
 * @param <T> тип поздаваемого продукта
 */
public interface AbstractFactory<T> {
    T create(String productType);
}
