package com.senac.designpatterns.bridge.questao01.cores;

//Implementacao Vermelho
public class Vermelho implements Cor {
    @Override
    public String getNomeCor() {
        return "vermelha";
    }

    @Override
    public void aplicarCor() {
        System.out.print("Aplicando a cor vermelha");
    }
}
