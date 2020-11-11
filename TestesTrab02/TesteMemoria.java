package TestesTrab02;

import java.io.File;
import java.util.Scanner;

public class TesteMemoria {
    public static void main(String[] args) {
        int indice = 0;
        Variavel[] variaveis = new Variavel[1000];
        
        try {
            File arquivo = new File("teste.txt");
            Scanner fluxo = new Scanner(arquivo);
            
            while(fluxo.hasNext()) {
                String linha = fluxo.nextLine();

                if(linha.equals("oi")) {
                    System.out.println("ABACATE!!!!!!!");    
                } else if(linha.equals("var")) {
                    variaveis[indice] = new Variavel();
                    variaveis[indice].nome = "ola";
                    variaveis[indice].valor = 20;
                    indice++;
                } else {
                    System.out.println("Linha = " + linha);
                }
            }

            System.out.println("indice =  " + indice);

            fluxo.close();

        } catch (Exception e) {
            System.out.println("Deu ruim.");
        }
    }
}