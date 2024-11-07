package com.senac.designpatterns.abstractfactory.questao01.factory;

import com.senac.designpatterns.abstractfactory.questao01.model.Label;
import com.senac.designpatterns.abstractfactory.questao01.model.Textbox;

public interface TemaFactory {
    Textbox criarTextbox();
    Label criarLabel();
}
