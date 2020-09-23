                  //PRIMEIRO EXERCICIO DA SEGUNDA LISTA DO FERNANDO
import java.util.Scanner;

class Autor{

  public String name;
  public int id;
  public void imprime(){

    System.out.println("Seu nome é: " + name + ", e seu id é: " + id);

  }
}

public class Fabricio{

  public static void main (String args[]){

    Scanner scanner = new Scanner(System.in);
    Autor a;
    a = new Autor();
    System.out.println("Digite seu nome completo: ");
    a.name = scanner.nextLine();
    System.out.println("Digite seu ID: ");
    a.id = scanner.nextInt();
    a.imprime();

  }



}
