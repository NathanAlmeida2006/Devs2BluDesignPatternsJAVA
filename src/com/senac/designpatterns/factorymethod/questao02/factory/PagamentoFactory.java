package com.senac.designpatterns.factorymethod.questao02.factory;

import com.senac.designpatterns.factorymethod.questao02.model.Pagamento;

public abstract class PagamentoFactory {
    public abstract Pagamento criarPagamento(double valor);
}
