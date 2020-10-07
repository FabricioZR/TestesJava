/*
 Metodo = acao que pede pro obj representado por aquela classe fazer;
 Propriedades privadas para ele, p q ninguem possa alterar suas propriedades diretamente;

Set e Get serve tb pra validar valores, nao aceitar negativos, etc...;
Da pra usar com if (idade>0){this.idade=idade};


*/

class Pessoaaa {
    private int idade;

    int getIdade() {
        return this.idade;
        // vai retornar a idade da classe pessoa;
    }

    void setIdade(int idade) {
        // vai receber um valor e o colocar na propriedade idade;
        // nao retorna nada, entao é void;
        // serve tb pra fazer uma validação;
        if (idade > 0) {
            this.idade = idade;
        }
    }
}

class GetSet {
    public static void main(String args[]) {

        Pessoaaa p = new Pessoaaa();

        // p.idade = 22; só assim ele nao consegue, pois nao tem acesso ao objeto;
        // precisa emplementar metodos para ler um valor e colocar ele na propriedade;

        p.setIdade(22);

        System.out.println("Idade: " + p.getIdade());
    }
}
