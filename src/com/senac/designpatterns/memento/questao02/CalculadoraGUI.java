package com.senac.designpatterns.memento.questao02;

import javax.swing.*;
import java.awt.*;

public class CalculadoraGUI extends JFrame {
    private final Calculadora calc;
    private final GerenciadorHistorico gerenciador;
    private final JTextField display;
    private final JTextArea historico;

    public CalculadoraGUI() {
        calc = new Calculadora();
        gerenciador = new GerenciadorHistorico();

        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(400, 300);

        // Painel de display e histórico
        JPanel painelSuperior = new JPanel(new BorderLayout());
        display = new JTextField("0");
        display.setEditable(false);
        historico = new JTextArea(10, 20);
        historico.setEditable(false);

        painelSuperior.add(display, BorderLayout.NORTH);
        painelSuperior.add(new JScrollPane(historico), BorderLayout.CENTER);
        add(painelSuperior, BorderLayout.EAST);

        // Painel de botões
        JPanel painelBotoes = getjPanel();

        add(painelBotoes, BorderLayout.CENTER);
        setLocationRelativeTo(null);
    }

    private JPanel getjPanel() {
        JPanel painelBotoes = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] botoes = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "←", "→", "+"};

        for (String botao : botoes) {
            JButton btn = new JButton(botao);
            btn.addActionListener(e -> {
                switch (botao) {
                    case "←":
                        desfazer();
                        break;
                    case "→":
                        refazer();
                        break;
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        realizarOperacao(botao);
                        break;
                    default:
                        display.setText(botao);
                        break;
                }
            });
            painelBotoes.add(btn);
        }
        return painelBotoes;
    }

    private void realizarOperacao(String operador) {
        try {
            double numero = Double.parseDouble(display.getText());
            calc.executarOperacao(numero, operador);
            gerenciador.adicionar(calc.salvarLembranca());
            atualizarDisplay();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Número inválido!");
        }
    }

    private void desfazer() {
        Calculadora.Lembranca lembranca = gerenciador.desfazer();
        if (lembranca != null) {
            calc.restaurarLembranca(lembranca);
            atualizarDisplay();
        }
    }

    private void refazer() {
        Calculadora.Lembranca lembranca = gerenciador.refazer();
        if (lembranca != null) {
            calc.restaurarLembranca(lembranca);
            atualizarDisplay();
        }
    }

    private void atualizarDisplay() {
        display.setText(String.format("%.2f", calc.getValor()));
        historico.setText(historico.getText() + "\n" + calc.getOperacao() + " = " + calc.getValor());
    }
}