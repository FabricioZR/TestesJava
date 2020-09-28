import java.util.Scanner;

//Exercicio fazer uma classe em Java que represente um personagem de uma serie;

//O que tem em comum a todos os personagens?
// - nome;
// - herou ou vilao;
// - serie/filme;
//instanciar pelo menos 3 objetos dessa classe, ler os dados dela do teclado;
//imprimir todos os atributos de cada um desse objeto;

class Personagem {
    String Nome;
    String Lado;
    String Serie;
}

class Teste {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Personagem p = new Personagem();
        System.out.println("Qual o nome do personagem?");
        p.Nome = s.nextLine();
        System.out.println("Qual o lado do personagem?");
        p.Lado = s.nextLine();
        System.out.println("Qual a serie do personagem?");
        p.Serie = s.nextLine();
        System.out.println("O personagem se chama: " + p.Nome);
        System.out.println("O personagem é do lado: " + p.Lado);
        System.out.println("O personagem é da serie: " + p.Serie);
        s.close();
    }
}
