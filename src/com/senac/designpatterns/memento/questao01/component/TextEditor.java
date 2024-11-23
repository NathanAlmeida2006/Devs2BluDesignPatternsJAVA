package com.senac.designpatterns.memento.questao01.component;

public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Memento saveToMemento() {
        return new Memento(text);
    }

    public void restoreFromMemento(Memento memento) {
        text = memento.getState();
    }

    public static class Memento {
        private final String text;

        public Memento(String text) {
            this.text = text;
        }

        private String getState() {
            return text;
        }
    }
}