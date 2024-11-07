package com.senac.designpatterns.abstractfactory.questao02.model;

public class PDFReport implements Report{
    @Override
    public void gerarReport() {
        System.out.println("Gerando um relatório em PDF.");
    }
}
