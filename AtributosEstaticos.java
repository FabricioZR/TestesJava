/*
Atributos e metodos estaticos;

Forma simples de botar oq ja sabemos de prog dentro de orientacao a objetos;

Metodo estatico é um serviço, voce usa alguma funcionalidade dela; Sem ter que um elemento existir em si;
atributo estaticos sao bons para criar constantes; Coisas que se usam globalmente;
*/
class Matematica {
    // Static sempre fica na memoria, fixo.
    public static final int soma(int a, int b) {
        int r = a + b;
        return r;
    }
    // Se tiver a palavra final ela nao pode ser mudada;

    static double pi = 3.1415;
    // dentro de um contexto estatico nao usa this;
    // Nao existe um objeto rodando aquele codigo, ele é global;
}

class ClassePessoa {

    static int idade;
    // Removo aquela propriedade do escopo do objeto;
    // Nao vai estar disponivel no objeto;
    // Vai alocar direto um espaço de memoria;
    // Como declarar uma variavel global; Acessivel pelo nome da classe;

    double peso;

    void oi() {
        System.out.println("oi");
    }

}

// System.out.println("oi") A classe System dentro dela tem um atributo out q é
// estativo, e dentro de out tem um println que tambem é estatico;

class Testeeee {

    public static void main(String args[]) {
        ClassePessoa.idade = 5; // acesso ele atravez da classe;
        // contexto global

        ClassePessoa p = new ClassePessoa();
        // Só posso acessar atravez do metodo pessoa o atributo peso;
        p.peso = 9.3;

        int x = Matematica.soma(2, 3);
        System.out.println(x);
    }
}
