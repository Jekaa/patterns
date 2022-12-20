package ru.patterns.behavioral.memento;

import java.util.ArrayList;

/**
 * the object that knows why and when the Originator needs to save and restore itself
 */
public class Caretaker {

    private final ArrayList<Memento> mementos = new ArrayList<>();
    private int cursor = 0;

    public void addMemento(Memento m) {
        mementos.add(m);
    }

    public Memento getMemento() {
        cursor++;
        return mementos.get(mementos.size() - Math.min(cursor, mementos.size()));
    }
}
