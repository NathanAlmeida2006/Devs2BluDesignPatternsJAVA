package com.senac.designpatterns.abstractfactory.questao01.model.impl;

import com.senac.designpatterns.abstractfactory.questao01.model.Textbox;

public class TextboxEscuro implements Textbox {
    public void render() {
        System.out.println("Renderizando Textbox no tema Escuro.");
    }
}

