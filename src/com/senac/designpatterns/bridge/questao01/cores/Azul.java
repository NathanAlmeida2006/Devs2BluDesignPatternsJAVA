package com.senac.designpatterns.bridge.questao01.cores;

//Implementacao Azul
public class Azul implements Cor {
    @Override
    public String getNomeCor() {
        return "azul";
    }

    @Override
    public void aplicarCor() {
        System.out.print("Aplicando a cor azul");
    }
}

