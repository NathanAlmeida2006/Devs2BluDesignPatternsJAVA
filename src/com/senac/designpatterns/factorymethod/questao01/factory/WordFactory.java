package com.senac.designpatterns.factorymethod.questao01.factory;

import com.senac.designpatterns.factorymethod.questao01.model.Documento;
import com.senac.designpatterns.factorymethod.questao01.model.DocumentoWord;

public class WordFactory extends DocumentoFactory {
    @Override
    public Documento criarDocumento() {
        return new DocumentoWord();
    }
}
