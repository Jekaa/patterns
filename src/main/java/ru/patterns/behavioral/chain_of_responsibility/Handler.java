package ru.patterns.behavioral.chain_of_responsibility;

import java.util.random.RandomGenerator;

/**
 * Each handler is an element of the Chain of Responsibility
 * Chain of Responsibility passes a sender request along a chain of potential receivers
 */
public class Handler {

    private static final RandomGenerator RANDOM = RandomGenerator.getDefault();
    private static int nextID = 1;
    private int id = nextID++;
    private Handler nextInChain;

    public void add(Handler next) {
        if (nextInChain == null) {
            nextInChain = next;
        } else {
            nextInChain.add(next);
        }
    }

    public void wrapAround(Handler root) {
        if (nextInChain == null) {
            nextInChain = root;
        } else {
            nextInChain.wrapAround(root);
        }
    }

    public void handle(int num) {
        if (RANDOM.nextInt(4) != 0) {
            System.out.println(id + "-busy");
            nextInChain.handle(num);
        } else {
            System.out.println(id + "-handled-" + num);
        }
    }
}
