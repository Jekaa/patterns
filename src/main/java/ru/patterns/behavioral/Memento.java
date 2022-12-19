package ru.patterns.behavioral;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * the lock box that is written and read by the Originator, and shepherded by the Caretaker
 */
@Getter
@AllArgsConstructor
public class Memento {
    private String state;
}
