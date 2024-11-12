package com.senac.designpatterns.memento;

import com.senac.designpatterns.memento.component.TextEditor;
import com.senac.designpatterns.memento.memory.CareTaker;

public class MementoMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker caretaker = new CareTaker();

        editor.setText("Versao 1");
        caretaker.addMemento(editor.saveToMemento());

        editor.setText("Versao 2");
        caretaker.addMemento(editor.saveToMemento());

        editor.setText("Versao 3");
        caretaker.addMemento(editor.saveToMemento());

        editor.setText("Versao 4");
        caretaker.addMemento(editor.saveToMemento());

        editor.setText("Versao 5");
        caretaker.addMemento(editor.saveToMemento());

        editor.setText("Versao 6");
        caretaker.addMemento(editor.saveToMemento());

        System.out.println("Texto atual: " + editor.getText());

        for (int i = 0; i < 5; i++) {
            TextEditor.Memento memento = caretaker.getLastMemento();
            if (memento != null) {
                editor.restoreFromMemento(memento);
                System.out.println("Desfazer #" + (i + 1) + ": " + editor.getText());
            }
        }
    }
}