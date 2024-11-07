package com.senac.designpatterns.abstractfactory.questao02.factory;

import com.senac.designpatterns.abstractfactory.questao02.model.Chart;
import com.senac.designpatterns.abstractfactory.questao02.model.Report;

public interface ReportFactory {
    Report criarRelatorio();
    Chart criarGrafico();
}
