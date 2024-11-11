package com.senac.designpatterns.bridge.questao02.empregados;

import com.senac.designpatterns.bridge.questao02.formatos.FormatoExportacao;

public abstract class Empregado {
    protected String nome;
    protected int idade;
    protected double salario;
    protected FormatoExportacao formato;

    public Empregado(String nome, int idade, double salario, FormatoExportacao formato) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.formato = formato;
    }

    public String exportar() {
        String[] dados = {nome, String.valueOf(idade), String.valueOf(salario)};
        return formato.exportarDados(dados);
    }
}
