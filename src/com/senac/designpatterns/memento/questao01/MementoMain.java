package com.senac.designpatterns.memento.questao01;

import com.senac.designpatterns.memento.questao01.component.TextEditor;
import com.senac.designpatterns.memento.questao01.memory.CareTaker;

public class MementoMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker caretaker = new CareTaker();

        // Adicionando 6 versões do texto
        for (int i = 1; i <= 6; i++) {
            editor.setText("Versao " + i);
            caretaker.addMemento(editor.saveToMemento());
            System.out.println("Salvando: " + editor.getText() +
                    " (Total de estados: " + caretaker.getMementoCount() + ")");
        }

        System.out.println("\nTexto atual: " + editor.getText());
        System.out.println("\nDesfazendo alterações:");

        // Desfazendo as últimas 5 alterações
        for (int i = 0; i < 5; i++) {
            TextEditor.Memento memento = caretaker.getLastMemento();
            if (memento != null) {
                editor.restoreFromMemento(memento);
                System.out.println("Desfazer #" + (i + 1) + ": " + editor.getText());
            }
        }
    }
}