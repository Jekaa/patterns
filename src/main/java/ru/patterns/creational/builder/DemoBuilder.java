package ru.patterns.creational.builder;

public class DemoBuilder {
    public static void main(String[] args) {
        Product tesla = Product.builder()
                .name("Tesla Model X")
                .type("Car")
                .cost(100_000D)
                .build();
        Product bmw = Product.builder()
                .name("BMW X5")
                .type("Car")
                .cost(80_000D)
                .build();
        System.out.println(tesla.toString());
        System.out.println(bmw.toString());
    }
}
