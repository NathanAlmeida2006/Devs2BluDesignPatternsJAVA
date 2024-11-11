package com.senac.designpatterns.bridge.questao01.formas;

import com.senac.designpatterns.bridge.questao01.cores.Cor;

//Abstracao
public abstract class Forma {
    protected Cor cor;
    protected Estilo estilo;

    // Construtor que recebe uma implementacao de cor
    protected Forma(Cor cor) {
        this.cor = cor;
    }

    // Construtor que recebe uma implementacao de cor e estilo
    public Forma(Cor cor, Estilo estilo) {
        this.cor = cor;
        this.estilo = estilo;
    }

    public abstract void desenhar();
}
