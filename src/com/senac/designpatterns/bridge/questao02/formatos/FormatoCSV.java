package com.senac.designpatterns.bridge.questao02.formatos;

public class FormatoCSV implements FormatoExportacao {
    @Override
    public String exportarDados(String[] dados) {
        return String.join(",", dados);
    }
}
