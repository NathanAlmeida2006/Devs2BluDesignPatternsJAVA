package com.senac.designpatterns.bridge.questao02;

import com.senac.designpatterns.bridge.questao02.empregados.Analista;
import com.senac.designpatterns.bridge.questao02.empregados.Empregado;
import com.senac.designpatterns.bridge.questao02.empregados.Gerente;
import com.senac.designpatterns.bridge.questao02.empregados.Secretaria;
import com.senac.designpatterns.bridge.questao02.formatos.FormatoCSV;
import com.senac.designpatterns.bridge.questao02.formatos.FormatoExportacao;
import com.senac.designpatterns.bridge.questao02.formatos.FormatoJSON;

public class Main {
    public static void main(String[] args) {
        // Criando os formatos
        FormatoExportacao formatoCSV = new FormatoCSV();
        FormatoExportacao formatoJSON = new FormatoJSON();

        // Criando empregados com diferentes formatos
        Empregado gerente = new Gerente("João", 45, 15000.00, formatoJSON);
        Empregado analista = new Analista("Maria", 30, 7000.00, formatoCSV);
        Empregado secretaria = new Secretaria("Ana ", 35, 4500.00, formatoJSON);

        // Exportando dados
        System.out.println("Dados do Gerente (JSON):");
        System.out.println(gerente.exportar());
        System.out.println("\nDados do Analista (CSV):");
        System.out.println(analista.exportar());
        System.out.println("\nDados da Secretária (JSON):");
        System.out.println(secretaria.exportar());

    }
}
