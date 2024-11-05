package com.senac.designpatterns.factorymethod.questao02.factory;

import com.senac.designpatterns.factorymethod.questao02.model.Pagamento;
import com.senac.designpatterns.factorymethod.questao02.model.PagamentoPayPal;

public class PagamentoPayPalFactory extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento(double valor) {
        return new PagamentoPayPal(valor);
    }
}
