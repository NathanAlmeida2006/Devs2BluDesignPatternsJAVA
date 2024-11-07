package com.senac.designpatterns.abstractfactory.questao01;

import com.senac.designpatterns.abstractfactory.questao01.factory.TemaFactory;
import com.senac.designpatterns.abstractfactory.questao01.model.Label;
import com.senac.designpatterns.abstractfactory.questao01.model.Textbox;

public class Cliente {
    private TemaFactory temaFactory;

    public Cliente(TemaFactory temaFactory) {
        this.temaFactory = temaFactory;
    }

    public void renderizarInterface() {
        Textbox textbox = temaFactory.criarTextbox();
        Label label = temaFactory.criarLabel();

        textbox.render();
        label.render();
    }

    public void setTemaFactory(TemaFactory temaFactory) {
        this.temaFactory = temaFactory;
    }
}

