package com.senac.designpatterns.abstractfactory.questao02;

import java.util.Scanner;

import com.senac.designpatterns.abstractfactory.questao02.factory.HTMLFactory;
import com.senac.designpatterns.abstractfactory.questao02.factory.PDFFactory;
import com.senac.designpatterns.abstractfactory.questao02.factory.ReportFactory;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReportFactory factory = null;

        System.out.println("Escolha o formato:");
        System.out.println("1 - PDF");
        System.out.println("2 - HTML");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                factory = new PDFFactory();
                break;

            case 2:
                factory = new HTMLFactory();
                break;

            default:
                System.out.println("Opção inválida!");
                System.exit(1);
        }

        Gerador gerador = new Gerador(factory);
        gerador.gerar();
        scanner.close();
    }
}