package com.amor.para.vitoriaantonieta.couto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Telas {
    public static void telaParaFrase(String[] a) {
        Random sorteio = new Random();
        
        int soeteado = sorteio.nextInt(a.length);

        // Cria o rótulo com os 10 números
        String sb = a[soeteado];        
        
        JLabel labelNumeros = new JLabel(sb.trim(), SwingConstants.CENTER);
        if ((soeteado != 1) && (soeteado != 4) && (soeteado != 3)&& (soeteado != 7)) {
           labelNumeros.setFont(new Font("Arial", Font.BOLD, 32));
        } else {
           labelNumeros.setFont(new Font("Arial", Font.BOLD, 25));
        }

        JLabel labelContador = new JLabel("Te Amo Vitória Antonieta do Couto S2.", SwingConstants.CENTER/*centraliza na tela.*/);
        labelContador.setFont(new Font("Arial"/*fonte*/, Font.PLAIN/*tipo de escrita: negrito, itálico*/, 14/*tamanho*/));
        labelContador.setForeground(Color.RED/*cor da escrita*/);
        
        //JLabel é uma classe que cria rótulos
        
        JPanel painel = new JPanel(new BorderLayout/* divede a tela em 5 partes: sul, norte, leste, oeste e centro*/());
        
        painel.add(labelNumeros, BorderLayout.CENTER);//adiciona um rótulo na redião especificada
        painel.add(labelContador, BorderLayout.SOUTH);//adiciona um rótulo na redião especificada
        //JPanel é uma classe que serve para juntar botões, labels, caixas de texto etc. e tratar esse grupo como uma unidade. Organiz, agrupa e desenha
        
        //Você pode sobrescrever paintComponent(Graphics g) e desenhar qualquer coisa ali: linhas, figuras, imagens, gráficos, o que quiser.
        
        JOptionPane optionPane = new JOptionPane(painel,
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
        //JOptionPane é uma classe que traz os botões, e também permite tira-los
        
        JDialog dialog = optionPane.createDialog("Frase solta para O Meu Amor.");
        //Cria a tela
        
        dialog.setModal(false); //define se é sobreposta
        dialog.setSize(3000, 700); // define tamanho
        dialog.setLocationRelativeTo(null); // centraliza na tela
        dialog.setAlwaysOnTop(true); //garante que sempre esteja visivel, mesmo quando aparecem outras janelas
        dialog.setVisible(true);  //tornar visivel  
    }
     
    public static void telaParaCoração(Heart heart){        
        String coracao = heart.getCoraçãoTela();
        
        JDialog dialog = new JDialog();
        dialog.setUndecorated(true); // sem barra de título/borda
        dialog.setBackground(new Color(0, 0, 0, 0)); // fundo transparente
        
        JTextArea labelHeart = new JTextArea(coracao);
        labelHeart.setFont(new Font("Monospaced",Font.PLAIN,40));
        labelHeart.setEditable(false);
        //labelHeart.setBackground(null);
        labelHeart.setForeground(Color.RED);
        labelHeart.setOpaque(false);
        
        JPanel telaCoracao = new JPanel(new BorderLayout());
        telaCoracao.setOpaque(false);
        telaCoracao.add(labelHeart, BorderLayout.CENTER);//BorderLayout.CENTER centraliza                      

        dialog.add(telaCoracao);
        dialog.pack();
        dialog.setAlwaysOnTop(true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        dialog.setModal(false);
        
        //Pulsar do coração
        var tamanhoMax = 35;
        int tamanho = 25;   
        int variacao = 2;
        int tempo = 650;
        
        // Cria um objeto Timer, responsável por executar uma ação repetidamente a cada intervalo definido
        // Cria um Timer que executa uma ação a cada 'tempo' milissegundos.
        // O 'new ActionListener() { ... }' define o que será feito a cada execução,
        // neste caso, alterar o tamanho da fonte para simular o batimento do coração.
        // O método 'actionPerformed' é chamado automaticamente em cada ciclo.
        // 'timer.start()' inicia o processo contínuo.

        Pulsar.pulsar(tempo, tamanhoMax, variacao, labelHeart, tamanho);                  
    }   
}

