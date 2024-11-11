package com.senac.designpatterns.bridge.questao01.formas;

import com.senac.designpatterns.bridge.questao01.cores.Cor;

//Abstracao Refinada para um Circulo
public class Circulo extends Forma {
    public Circulo(Cor cor) {
        super(cor);
    }

    public Circulo(Cor cor, Estilo estilo) {
        super(cor, estilo);
    }

    @Override
    public void desenhar() {
        if (estilo == null) {
            System.out.println("Desenhando um círculo com cor " + cor.getNomeCor());
        } else {
            System.out.println("Desenhando um círculo com cor " + cor.getNomeCor() + " e estilo " + estilo.getDescricao());
        }
    }
}
