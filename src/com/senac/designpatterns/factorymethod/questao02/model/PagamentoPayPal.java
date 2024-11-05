package com.senac.designpatterns.factorymethod.questao02.model;

public class PagamentoPayPal extends Pagamento {

    public PagamentoPayPal(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento de R$" + valor + " via PayPal.");
    }
}
