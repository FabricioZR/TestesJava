package L02Moodle;

import java.util.Scanner;

class PessoaII {

    private String nome;
    private int idade;
    private float peso;

    String getNome() {
        return this.nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    int getIdade() {
        return this.idade;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    float getPeso() {
        return this.peso;
    }

    void setPeso(float peso) {
        this.peso = peso;
    }

    // Imprime todas as propriedades da classe
    void imprimeDados() {
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("peso: " + this.peso);
    }
}

class exII {
    public static void main(String[] args) {
        PessoaII p = new PessoaII();

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");
        String nome = s.nextLine();
        p.setNome(nome);

        System.out.println("Digite a idade da pessoa: ");
        int idade = s.nextInt();
        p.setIdade(idade);

        System.out.println("Digite o peso da pessoa: ");
        float peso = s.nextFloat();
        p.setPeso(peso);

        p.imprimeDados();

        s.close();
    }
}
