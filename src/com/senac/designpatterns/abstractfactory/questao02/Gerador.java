package com.senac.designpatterns.abstractfactory.questao02;

import com.senac.designpatterns.abstractfactory.questao02.factory.ReportFactory;
import com.senac.designpatterns.abstractfactory.questao02.model.Chart;
import com.senac.designpatterns.abstractfactory.questao02.model.Report;

public class Gerador {
    private final ReportFactory reportFactory;

    public Gerador(ReportFactory reportFactory) {
        this.reportFactory = reportFactory;
    }

    public void gerar() {
        Report report = reportFactory.criarRelatorio();
        Chart chart = reportFactory.criarGrafico();

        report.gerarReport();
        chart.gerarChart();
    }
}
