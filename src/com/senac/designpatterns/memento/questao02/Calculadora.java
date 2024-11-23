package com.senac.designpatterns.memento.questao02;

public class Calculadora {
    private double valor;
    private String operacao;

    public Calculadora() {
        this.valor = 0;
        this.operacao = "Inicial: 0";
    }

    public void executarOperacao(double numero, String operador) {
        switch (operador) {
            case "+": valor += numero; break;
            case "-": valor -= numero; break;
            case "*": valor *= numero; break;
            case "/":
                if (numero != 0) {
                    valor /= numero;
                }
                break;
        }
        operacao = operador + numero;
    }

    public double getValor() {
        return valor;
    }

    public String getOperacao() {
        return operacao;
    }

    public Lembranca salvarLembranca() {
        return new Lembranca(valor, operacao);
    }

    public void restaurarLembranca(Lembranca lembranca) {
        this.valor = lembranca.valor;
        this.operacao = lembranca.operacao;
    }

    public static class Lembranca {
        private final double valor;
        private final String operacao;

        private Lembranca(double valor, String operacao) {
            this.valor = valor;
            this.operacao = operacao;
        }
    }
}