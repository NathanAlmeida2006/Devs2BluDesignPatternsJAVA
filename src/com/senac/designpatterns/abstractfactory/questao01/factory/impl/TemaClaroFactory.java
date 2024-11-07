package com.senac.designpatterns.abstractfactory.questao01.factory.impl;

import com.senac.designpatterns.abstractfactory.questao01.factory.TemaFactory;
import com.senac.designpatterns.abstractfactory.questao01.model.Label;
import com.senac.designpatterns.abstractfactory.questao01.model.Textbox;
import com.senac.designpatterns.abstractfactory.questao01.model.impl.LabelClaro;
import com.senac.designpatterns.abstractfactory.questao01.model.impl.TextboxClaro;

public class TemaClaroFactory implements TemaFactory {
    public Textbox criarTextbox() {
        return new TextboxClaro();
    }

    public Label criarLabel() {
        return new LabelClaro();
    }
}
