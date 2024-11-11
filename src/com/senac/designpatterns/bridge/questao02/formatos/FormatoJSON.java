package com.senac.designpatterns.bridge.questao02.formatos;

public class FormatoJSON implements FormatoExportacao {
    @Override
    public String exportarDados(String[] dados) {
        StringBuilder json = new StringBuilder();
        json.append("{\n");
        json.append("  \"nome\": \"").append(dados[0]).append("\",\n");
        json.append("  \"idade\": ").append(dados[1]).append(",\n");
        json.append("  \"salario\": ").append(dados[2]).append("\n");
        json.append("}");
        return json.toString();
    }
}
