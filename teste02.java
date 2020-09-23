class Data { // classe com os métodos

  public int mes; // atributos
  public int dia; // atributos
  public int hora; // atributos
  public int minuto; // atributos
  public int segundo; // atributos

  public void imprime_todos() {

    System.out.println("MES :" + this.mes); // metodos
    System.out.println("DIA :" + this.dia); // metodos
    System.out.println("MINUTO :" + this.minuto); // metodos
    System.out.println("SEGUNDO :" + this.segundo); // metodos
  }

  public void teste() {

    if (this.hora < 12) {
      System.out.println("HORA :" + this.hora + "AM");
    } // metodos

    if (this.hora >= 12) {
      System.out.println("HORA :" + this.hora + "PM");
    } // metodos

  }
}

public class teste02 { // classe main(principal)

  public static void main(String args[]) {

    Data h, j;

    h = new Data();
    h.mes = 2;
    h.dia = 2;
    h.hora = 12;
    h.minuto = 22;
    h.segundo = 13;
    h.imprime_todos();
    h.teste();

    j = new Data();
    j.mes = 12;
    j.dia = 2;
    j.hora = 2;
    j.minuto = 12;
    j.segundo = 22;
    j.imprime_todos();
    j.teste();
  }
}
