package com.senac.designpatterns.memento.questao02;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorHistorico {
    private final List<Calculadora.Lembranca> historicoDesfazer;
    private final List<Calculadora.Lembranca> historicoRefazer;

    public GerenciadorHistorico() {
        this.historicoDesfazer = new ArrayList<>();
        this.historicoRefazer = new ArrayList<>();
    }

    public void adicionar(Calculadora.Lembranca lembranca) {
        historicoDesfazer.add(lembranca);
        historicoRefazer.clear();
    }

    public Calculadora.Lembranca desfazer() {
        if (!historicoDesfazer.isEmpty()) {
            Calculadora.Lembranca lembranca = historicoDesfazer.removeLast();
            historicoRefazer.add(lembranca);
            return lembranca;
        }
        return null;
    }

    public Calculadora.Lembranca refazer() {
        if (!historicoRefazer.isEmpty()) {
            Calculadora.Lembranca lembranca = historicoRefazer.removeLast();
            historicoDesfazer.add(lembranca);
            return lembranca;
        }
        return null;
    }
}