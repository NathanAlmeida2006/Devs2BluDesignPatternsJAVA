package com.senac.designpatterns.factorymethod.questao01;

import com.senac.designpatterns.factorymethod.questao01.factory.DocumentoFactory;
import com.senac.designpatterns.factorymethod.questao01.factory.PDFFactory;
import com.senac.designpatterns.factorymethod.questao01.factory.WordFactory;
import com.senac.designpatterns.factorymethod.questao01.model.Documento;

public class Cliente {
    public static void main(String[] args) {
        DocumentoFactory wordFactory = new WordFactory();
        Documento wordDoc = wordFactory.criarDocumento();
        wordDoc.abrir();

        DocumentoFactory pdfFactory = new PDFFactory();
        Documento pdfDoc = pdfFactory.criarDocumento();
        pdfDoc.abrir();
    }
}
