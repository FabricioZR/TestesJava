package ExercicioMoodle;

import java.util.Scanner;

//Exercicio 01 da lista do fernando

class Autor {
    public String nome;
    public int id;
}

class Teste {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Autor a = new Autor();
        System.out.println("Qual o seu nome?");
        a.nome = s.nextLine();
        System.out.println("Qual o seu ID?");
        a.id = s.nextInt();
        System.out.println("O seu nome é: " + a.nome);
        System.out.println("O seu ID é: " + a.id);
        s.close();
    }
}
