package Testes;

//uso uma classe para criar outra;
//tipo abstrato quando voce cria a partir dos tipos primitivos
//posso criar outras classes a partir de outros tipos complexos
//div em 3 categorias:
//associação - existe uma relacao entre duas classes
//agregação - por acaso tem uma relação entre si, mas existem de forma independente;
//composição - se voce separa todas, ou uma delas, nao vao fazer mais sentido fora da relação;
//classe Data e Pessoa; A data seria uma classe que faz sentido sozinha, a pessoa tb existe fora da data;
//Essas duas sao independentes, pois fazem sentido sozinhas. Entao essa relação é de agregação;
//classe carro e porta malas; um carro faz sentido isolado, pois pode ter km, marca, cor;
//Porem, o porta malas depende do carro; Nao existe sem o carro; esta obrigatoriamente associado a aquele carro;
//Essa relação é de composição, pois se nao ha relação, uma das classes nao faz sentido; uma das classes envolvidas depende da outra;
//Posso usar varias classes para formar uma outra classe; Posso criar uma classe carro que usa classe porta malas, classe km, cor;

//essas duas classes Pessoa E String fazem sentido isoladamente;

class Pessoaas {

    Data nascimento;

    public Pessoaas() {
        this.nascimento = new Data();
        // essa chamada aloca um esp de mem do data e chama o consultor da classe Data;

    }
}

class Dataas {

    int dia;
    int mes;
    int ano;
    String animal;

    public Dataas() {
        this.animal = new String("dragao");
        // consultor para alocar um espaco de memoria para o objeto animal; instanciar;
    }

    void imprime() {
        System.out.println("dia = " + this.dia);
        System.out.println("mes = " + this.mes);
        System.out.println("ano = " + this.ano);
    }

}

class Principal {
    public static void main(String args[]) {

        Dataas nascimento = new Dataas();// novo espaco na memoria e chame o metodo pessoa;

        nascimento.dia = 22;
        nascimento.mes = 2;
        nascimento.ano = 2001;
        nascimento.imprime();
        // objeto.metodo;

        Pessoaas p = new Pessoaas();
        p.nascimento.dia = 23;
        p.nascimento.imprime();
        // pessoa e nascimento existem de forma separada - agragação;

        String animal = new String("dragao");
        animal = "rato";
        animal.charAt(0);// charAt da o caracter no indice 0;

        Pessoaas pe = new Pessoaas();
        pe.nascimento.animal = "rato";
        pe.nascimento.animal.charAt(0);
    }
}