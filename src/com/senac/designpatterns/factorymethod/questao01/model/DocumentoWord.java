package com.senac.designpatterns.factorymethod.questao01.model;

public class DocumentoWord implements Documento {
    @Override
    public void abrir() {
        System.out.println("Abrindo documento Word...");
    }
}
