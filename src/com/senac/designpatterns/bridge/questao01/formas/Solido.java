package com.senac.designpatterns.bridge.questao01.formas;

public class Solido implements Estilo {
    @Override
    public String getDescricao() {
        return "sólido";
    }

    @Override
    public void aplicarEstilo() {
        System.out.print("Aplicando estilo sólido");
    }
}