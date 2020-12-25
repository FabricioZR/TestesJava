package TestesTrab02;

class Variaveis {
    public String nome;
    public double valor;

    public Variaveis() {
        this.nome = "?";
        this.valor = 0;
    }

    public void imprime() {
        System.out.println("Variavel " + this.nome + " = " + this.valor);
    }
}