package com.mycompany.vitoriaantonieta;

import java.util.Scanner;
import com.amor.para.vitoriaantonieta.couto.Heart;
import com.amor.para.vitoriaantonieta.couto.Telas;

public class VitoriaAntonieta {

    public static void main(String[] args) throws InterruptedException {
        Heart heart = new Heart();
        
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite um número par, e maior que 5: (Este jogo têm 7 frases)");
        int tamanhoEscolhido = input.nextInt();
        
        String frases[] = {"Tu És o meu máximo denominador comum.",
            "Nem que eu falasse língua dos homens, e nem que eu falasse a lingua dos anjos, sem teu amor de nada me serveria.",
            "Desde que te conheci, assinei com todo meu ser o contrato de: \"Para sempre, sempre teu\".",
            "Seus lindos cabelos, espalham-se na terra como o próprio sol, e seu brilho intenso rivaliza com o próprio astro-rei.",
            "Teus formosos olhos verdes se assmelham aos mais belos campos, onde a natureza derrama sua beleza.",
            "Vosso sorriso juvenil me enfeitiçou, e para sempre alegrará os meus sonhos.",
            "Teus belos lábios carmesim me encantam, e a imagem deles perseguem-me aonde for.",
            "Os tão poucos momentos que tivemos à sós, se tornaram parte das poucos memórias que pretendo jamais esquecer.",
            "O que por ti sinto é inominável, e nem os símbolos santos da Umbanda, nem qualquer cousa sagrada, poderiam conter tamanho amor."};
        
        Telas.telaParaFrase(frases);
        
        Thread.sleep(2000);
        
        //Metodo para imprimir coracão, feito por for's.
        Telas.telaParaCoração(heart);
        
        heart.getCoraçãoPrint(tamanhoEscolhido);
        
        System.out.println("Independente de tudo, eu te amo.");
        
        System.out.println("\nASS: Davi Leandro Costa.");
    }
}
