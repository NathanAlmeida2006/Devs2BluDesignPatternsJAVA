package com.senac.designpatterns.factorymethod.questao01.factory;

import com.senac.designpatterns.factorymethod.questao01.model.Documento;

public abstract class DocumentoFactory {
    public abstract Documento criarDocumento();
}