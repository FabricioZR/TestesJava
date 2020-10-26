/*
Conjunto de dados
*/
import java.util.Scanner;

class vetores{
    public static void main(String args[]){
        int[] vet = null; //tipo vetor de inteiros
        int vetor[]; //mesma coisa do de cima;
        //vetores sao objetos tambem;
        //os de cima estao apontando pra nulo;

        int[] vet = new int[20]; //vetor de 20 posicoes;

        //vet.(...) tenho acesso a varios atributos do meu tipo vetor;
        //vet.length me da o tamanho do vetor;
        //
        vet[0]=20;
        vet[1] = 21;
        vet[19] = 11;

        int i;
        for (i=0;i<20;i++){
            System.out.println(vet[i]);
        }
    }
}