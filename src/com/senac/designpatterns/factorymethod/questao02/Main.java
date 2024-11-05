package com.senac.designpatterns.factorymethod.questao02;

import com.senac.designpatterns.factorymethod.questao02.factory.PagamentoCartaoFactory;
import com.senac.designpatterns.factorymethod.questao02.factory.PagamentoFactory;
import com.senac.designpatterns.factorymethod.questao02.factory.PagamentoPayPalFactory;
import com.senac.designpatterns.factorymethod.questao02.model.Pagamento;

public class Main {
    public static void main(String[] args) {
        PagamentoFactory cartaoFactory = new PagamentoCartaoFactory();
        Pagamento pagamentoCartao = cartaoFactory.criarPagamento(150);
        pagamentoCartao.processarPagamento();

        PagamentoFactory payPalFactory = new PagamentoPayPalFactory();
        Pagamento pagamentoPayPal = payPalFactory.criarPagamento(900);
        pagamentoPayPal.processarPagamento();
    }
}
