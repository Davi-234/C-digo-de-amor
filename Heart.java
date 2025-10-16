package com.amor.para.vitoriaantonieta.couto;

public class Heart {
    private int tamanho = 8;
    
    public String getCoraçãoTela() {        
        StringBuilder coracao = new StringBuilder();
        
        //Variáveis relacionadas ao tamanho do Coração:
        int tamanho3 = tamanho / 3;
        int metadeParaEspaços = tamanho / 2;
        int metade = tamanho / 2;

        for (int a = 0; a <= metade; a++) {
            //espaço inicial
            for (int h = metadeParaEspaços; h >= 0; h--) {
                coracao.append(" ");
            }

            //triângulo
            for (int s = a; s > 0; s--) {
                coracao.append("* ");
            }

            //espaço central
            for (int i = metadeParaEspaços; i > 0; i--) {
                coracao.append("  ");
            }

            //triângulo
            for (int s = a; s > 0; s--) {
                coracao.append("* ");
            }

            metadeParaEspaços--;
            coracao.append("\n");
        }

        //Meio do coração
        int cc = tamanho + 1;

        for (int h = 0; h < tamanho3; h++) {
            for (int i = 0; i < cc; i++) {
                coracao.append("* ");
            }
            coracao.append("\n");
        }

        //Parte de baixo do coração:
        for (int j = 0; j < tamanho; j++) {
            int variavel = j;

            while (variavel >= 0) {
                coracao.append(" ");
                variavel--;
            }

            for (int h = tamanho; h > j; h--) {
                coracao.append("* ");

            }

            coracao.append("\n");
        }
        
        return coracao.toString();
    }
    
    public void getCoraçãoPrint(int tamanho) {  
        
        if (tamanho < 6){
           tamanho = 6;
        } 
        else if (tamanho % 2 == 1){
           tamanho = tamanho + 1;
        }
        else if (tamanho > 100){
           tamanho = 100;
        }
        
        StringBuilder coracao = new StringBuilder();
        
        //Variáveis relacionadas ao tamanho do Coração:
        int tamanho3 = tamanho / 3;
        int metadeParaEspaços = tamanho / 2;
        int metade = tamanho / 2;

        for (int a = 0; a <= metade; a++) {
            //espaço inicial
            for (int h = metadeParaEspaços; h >= 0; h--) {
                coracao.append(" ");
            }

            //triângulo
            for (int s = a; s > 0; s--) {
                coracao.append("* ");
            }

            //espaço central
            for (int i = metadeParaEspaços; i > 0; i--) {
                coracao.append("  ");
            }

            //triângulo
            for (int s = a; s > 0; s--) {
                coracao.append("* ");
            }

            metadeParaEspaços--;
            coracao.append("\n");
        }

        //Meio do coração
        int cc = tamanho + 1;

        for (int h = 0; h < tamanho3; h++) {
            for (int i = 0; i < cc; i++) {
                coracao.append("* ");
            }
            coracao.append("\n");
        }

        //Parte de baixo do coração:
        for (int j = 0; j < tamanho; j++) {
            int variavel = j;

            while (variavel >= 0) {
                coracao.append(" ");
                variavel--;
            }

            for (int h = tamanho; h > j; h--) {
                coracao.append("* ");

            }

            coracao.append("\n");
        }
        
        System.out.println(coracao);
    }
}
