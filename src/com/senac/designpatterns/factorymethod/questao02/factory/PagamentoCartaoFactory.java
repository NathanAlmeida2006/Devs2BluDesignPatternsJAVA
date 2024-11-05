package com.senac.designpatterns.factorymethod.questao02.factory;

import com.senac.designpatterns.factorymethod.questao02.model.Pagamento;
import com.senac.designpatterns.factorymethod.questao02.model.PagamentoCartao;

public class PagamentoCartaoFactory extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento(double valor) {
        return new PagamentoCartao(valor);
    }
}
