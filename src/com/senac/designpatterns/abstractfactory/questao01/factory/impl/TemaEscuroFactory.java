package com.senac.designpatterns.abstractfactory.questao01.factory.impl;

import com.senac.designpatterns.abstractfactory.questao01.factory.TemaFactory;
import com.senac.designpatterns.abstractfactory.questao01.model.Label;
import com.senac.designpatterns.abstractfactory.questao01.model.Textbox;
import com.senac.designpatterns.abstractfactory.questao01.model.impl.LabelEscuro;
import com.senac.designpatterns.abstractfactory.questao01.model.impl.TextboxEscuro;

public class TemaEscuroFactory implements TemaFactory {
    public Textbox criarTextbox() {
        return new TextboxEscuro();
    }

    public Label criarLabel() {
        return new LabelEscuro();
    }
}