package com.amor.para.vitoriaantonieta.couto;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class Pulsar{
    
    public static void pulsar(int tempo,int tamanhoMax, int variacao, JTextArea labelHeart, int tamanho){
        Timer timer;
        
        timer = new Timer(tempo, new ActionListener(){
            boolean aumentou = false;

            @Override
            public void actionPerformed(ActionEvent e){
                
                int tamanhoAtual = labelHeart.getFont().getSize();
                
                int tamanhoNovo = tamanhoAtual;
                
                if (aumentou == false){
                   tamanhoNovo = tamanhoNovo + variacao;
                   
                   if (tamanhoNovo >= tamanhoMax){
                      aumentou = true;
                   }
                   
                } else {
                   tamanhoNovo = tamanhoNovo - variacao;
                   
                   if (tamanhoNovo >= tamanho){
                      aumentou = false;
                   }
                   
                }
               
                labelHeart.setFont(new Font("Monospaced",Font.PLAIN,tamanhoNovo));
                
            }
        });
        timer.start();
    }
}
