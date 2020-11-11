/*
Conjunto de dados
*/
class vetores{
    public static void main(String args[]){
        //vetores sao objetos tambem;
        //os de cima estao apontando pra nulo;

        int[] veto = new int[20]; //vetor de 20 posicoes;

        //vet.(...) tenho acesso a varios atributos do meu tipo vetor;
        //vet.length me da o tamanho do vetor;
        //
        veto[0]=20;
        veto[1] = 21;
        veto[19] = 11;

        int i;
        for (i=0;i<20;i++){
            System.out.println(veto[i]);
        }
    }
}