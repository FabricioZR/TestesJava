package Testes;

//PRIMEIRO EXERCICIO DA SEGUNDA LISTA DO FERNANDO

import java.util.Scanner;

class Autor {
  public String name;
  public int id;

  public void imprime() {
    System.out.println("Seu nome é: " + name + ", e seu id é: " + id);
  }
}

public class teste08 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    Autor a;
    a = new Autor();
    System.out.println("Digite seu nome completo: ");
    a.name = s.nextLine();
    System.out.println("Digite seu ID: ");
    a.id = s.nextInt();
    a.imprime();
    s.close();
  }
}
