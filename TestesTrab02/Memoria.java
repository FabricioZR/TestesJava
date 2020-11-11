public class Variavel {
    public String nome;
    public double valor;

    public Variavel() {
        this.nome = "?";
        this.valor = 0;
    }

    public void imprime() {
        System.out.println("Variavel " + this.nome + " = " + this.valor);
    }
}