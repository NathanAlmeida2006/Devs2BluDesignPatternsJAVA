package com.senac.designpatterns.abstractfactory.questao02.model;

public class HTMLChart implements Chart{
    @Override
    public void gerarChart() {
        System.out.println("Gerando gráfico em HTML.");

    }
}
