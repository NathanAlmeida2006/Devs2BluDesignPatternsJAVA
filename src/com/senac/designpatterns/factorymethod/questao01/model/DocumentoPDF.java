package com.senac.designpatterns.factorymethod.questao01.model;

public class DocumentoPDF implements Documento {
    @Override
    public void abrir() {
        System.out.println("Abrindo documento PDF...");
    }
}
