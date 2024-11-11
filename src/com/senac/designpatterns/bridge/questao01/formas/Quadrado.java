package com.senac.designpatterns.bridge.questao01.formas;

import com.senac.designpatterns.bridge.questao01.cores.Cor;

public class Quadrado extends Forma {
    public Quadrado(Cor cor) {
        super(cor);
    }

    public Quadrado(Cor cor, Estilo estilo) {
        super(cor, estilo);
    }

    @Override
    public void desenhar() {
        if (estilo == null) {
            System.out.println("Desenhando um quadrado com cor " + cor.getNomeCor());
        } else {
            System.out.println("Desenhando um quadrado com cor " + cor.getNomeCor() + " e estilo " + estilo.getDescricao());
        }
    }
}