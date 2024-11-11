package com.senac.designpatterns.bridge.questao01;

import com.senac.designpatterns.bridge.questao01.cores.Azul;
import com.senac.designpatterns.bridge.questao01.cores.Vermelho;
import com.senac.designpatterns.bridge.questao01.formas.*;

public class Main {
    public static void main(String[] args) {
        // Teste círculo com e sem estilo
        Forma circuloVermelho = new Circulo(new Vermelho());
        circuloVermelho.desenhar();

        Forma circuloVermelhoComEstilo = new Circulo(new Vermelho(), new Tracejado());
        circuloVermelhoComEstilo.desenhar();

        // Teste quadrado com e sem estilo
        Forma quadradoAzul = new Quadrado(new Azul());
        quadradoAzul.desenhar();

        Forma quadradoAzulComEstilo = new Quadrado(new Azul(), new Solido());
        quadradoAzulComEstilo.desenhar();

        // Teste triângulo com e sem estilo
        Forma trianguloAzul = new Triangulo(new Azul());
        trianguloAzul.desenhar();

        Forma trianguloAzulComEstilo = new Triangulo(new Azul(), new Tracejado());
        trianguloAzulComEstilo.desenhar();
    }
}