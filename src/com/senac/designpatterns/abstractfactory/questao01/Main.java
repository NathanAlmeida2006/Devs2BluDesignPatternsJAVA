package com.senac.designpatterns.abstractfactory.questao01;

import com.senac.designpatterns.abstractfactory.questao01.factory.impl.TemaClaroFactory;
import com.senac.designpatterns.abstractfactory.questao01.factory.impl.TemaEscuroFactory;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(new TemaClaroFactory());
        cliente.renderizarInterface();

        System.out.println();

        cliente.setTemaFactory(new TemaEscuroFactory());
        cliente.renderizarInterface();
    }
}
