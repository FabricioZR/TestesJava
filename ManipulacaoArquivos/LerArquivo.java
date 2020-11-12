package ManipulacaoArquivos;

import java.util.Scanner;
import java.io.File;

 class LerArquivo {
    public static void main(String[] args){
        try{
            File arquivo = new File("/ManipulacaoArquivos/teste.txt");
            Scanner teclado = new Scanner(arquivo);

            System.out.println("Digite uma palavra");

            System.out.println("A palavra: " + teclado.nextLine());
            System.out.println("A palavra: " + teclado.nextLine());
            System.out.println("A palavra: " + teclado.nextLine());
            System.out.println("A palavra: " + teclado.nextLine());

            teclado.close();

        }catch(Exception e){
            System.out.println("ERROR");
        }

    }
}

