/*
Assinatura de metodos e sobrecarga;

A assinatura de metodos é a identificação de um metodo;
A assinatura serve para descobrir qual o metodo tem que ser chamado;
Se existirem nomes iguais, ele puxa o primeiro que tenha o nome chamado;
A assinatura segue regras:
A assinatura nao considera o return do metodo, nao importa se é int, float, etc;
Posso usar o tipo do parametro e a ordem que ele aparece pra montar a assinatura do metodo;

Assinatura leva em conta o nome do metodo e os parametros que ele recebe;
ex: meumetodo(int, int) // meumetodo() // meumetodo(int, double)

Se eu chamar meumetodo(2, 2.0) ele vai chamar o meumetodo(int, double);
nao importa se tem 3 com mesmo nome, eles tem assinaturas diferentes 

Se eu chamar meumetodo(2, 2) ele vai chamar o meumetodo(int, int);
nao importa se tem 3 com mesmo nome, eles tem assinaturas diferentes 
*/

class Assinatura {

    int idade;
    String nome;

    public Assinatura() {
        this(0);
        // aqui ele vai chamar o Assinatura(int) porque é a mesma assinatura;
        // this(0) = eu quero a classe com mesmo nome desta com (parametro int);
    }

    // This() é o nome da classe;
    // nesse caso This(0) = Assinatura(int);

    public Assinatura(int i) {
        this.idade = i;
        this.nome = new String("alguem");
    }
}

public class AssinaturaDeMetodo {

    Assinatura a = new Assinatura(); // aqui chama o primeiro People pois nao tem nenhum parametro;

    Assinatura ab = new Assinatura(9); // aqui chama o segundo People pois tem parametro int;

    // Assinatura abc = new Assinatura(3.0);
    // Nao tem esse construtor, nenhum tem parametro double;
}
