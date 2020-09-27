package ru.patterns.creational.abstract_factory;

/**
 * Абстрактная фабрика
 * @param <T> тип поздаваемого продукта
 */
public interface AbstractFactory<T> {
    T create(String productType);
}
