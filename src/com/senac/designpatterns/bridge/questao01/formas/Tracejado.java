package com.senac.designpatterns.bridge.questao01.formas;

public class Tracejado implements Estilo {
    @Override
    public String getDescricao() {
        return "tracejado";
    }

    @Override
    public void aplicarEstilo() {
        System.out.print("Aplicando estilo tracejado");
    }
}