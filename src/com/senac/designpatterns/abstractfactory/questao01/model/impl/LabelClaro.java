package com.senac.designpatterns.abstractfactory.questao01.model.impl;

import com.senac.designpatterns.abstractfactory.questao01.model.Label;

public class LabelClaro implements Label {
    public void render() {
        System.out.println("Renderizando Label no tema Claro.");
    }
}

