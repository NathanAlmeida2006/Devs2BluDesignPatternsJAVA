package com.senac.designpatterns.bridge.questao02.empregados;

import com.senac.designpatterns.bridge.questao02.formatos.FormatoExportacao;

public class Analista extends Empregado {
    public Analista(String nome, int idade, double salario, FormatoExportacao formato) {
        super(nome, idade, salario, formato);
    }
}
