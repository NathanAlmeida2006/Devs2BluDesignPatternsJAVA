package com.senac.designpatterns.bridge.questao01.formas;

import com.senac.designpatterns.bridge.questao01.cores.Cor;

public class Triangulo extends Forma {
    public Triangulo(Cor cor) {
        super(cor);
    }

    public Triangulo(Cor cor, Estilo estilo) {
        super(cor, estilo);
    }

    @Override
    public void desenhar() {
        if (estilo == null) {
            System.out.println("Desenhando um triângulo com cor " + cor.getNomeCor());
        } else {
            System.out.println("Desenhando um triângulo com cor " + cor.getNomeCor() + " e estilo " + estilo.getDescricao());
        }
    }
}