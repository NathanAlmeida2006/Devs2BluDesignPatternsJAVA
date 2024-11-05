package com.senac.designpatterns.factorymethod.questao02.model;

public class PagamentoCartao extends Pagamento {

    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento de R$" + valor + " no cartão.");
    }
}
