package com.senac.designpatterns.memento.questao01.memory;

import com.senac.designpatterns.memento.questao01.component.TextEditor;
import java.util.LinkedList;
import java.util.Deque;

public class CareTaker {
    private static final int MAX_MEMENTOS = 5;
    private Deque<TextEditor.Memento> savedStates = new LinkedList<>();

    public void addMemento(TextEditor.Memento memento) {
        if (savedStates.size() >= MAX_MEMENTOS) {
            savedStates.removeFirst(); // Remove o memento mais antigo
        }
        savedStates.addLast(memento); // Adiciona o novo memento no final
    }

    public TextEditor.Memento getLastMemento() {
        return savedStates.isEmpty() ? null : savedStates.removeLast();
    }

    public int getMementoCount() {
        return savedStates.size();
    }
}