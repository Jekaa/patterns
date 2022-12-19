package ru.patterns.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        var instance1 = Singleton.getInstance();
        var instance2 = Singleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
