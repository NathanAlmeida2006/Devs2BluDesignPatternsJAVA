package com.senac.designpatterns.memento.memory;

import com.senac.designpatterns.memento.component.TextEditor;
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private static final int MAX_MEMENTOS = 5;
    private List<TextEditor.Memento> savedStates = new ArrayList<>();

    // Adiciona um novo memento à lista, mantendo o limite de 5 estados
    public void addMemento(TextEditor.Memento memento) {
        if (savedStates.size() >= MAX_MEMENTOS) {
            // Remove o estado mais antigo
            savedStates.remove(0);
        }
        savedStates.add(memento);
    }

    // Recupera o último memento salvo e remove-o da lista
    public TextEditor.Memento getLastMemento() {
        if (!savedStates.isEmpty()) {
            return savedStates.remove(savedStates.size() - 1);
        }
        return null;
    }
}