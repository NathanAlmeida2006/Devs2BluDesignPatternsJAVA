package com.senac.designpatterns.bridge.questao02.empregados;

import com.senac.designpatterns.bridge.questao02.formatos.FormatoExportacao;

public class Gerente extends Empregado {
    public Gerente(String nome, int idade, double salario, FormatoExportacao formato) {
        super(nome, idade, salario, formato);
    }
}