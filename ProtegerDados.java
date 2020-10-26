/*
Preciso proteger os dados da minha classe;
MOdificador no caminho do dado, nao deixo entrar no contexto do meu objeto se nao cabe nas minhas atribuições;
O objeto vai ter alem de dados, uma semantica, regras que impedem o usuario de alterar indevidamente.
Membros publicos da classe tem acesso livre;
Membros encapsulados tem um acesso restrito; Só a classe pode chamar ele;

Restringir acesso a dados e funcionalidades;

COnsigo fazer testes dentro da minha classe; Posso fazer um controle;
Eu posso testar se o nome que o usuario esta enviando é maior que 5 caracteres;
Tudo isso dentro da classe;

public permite acesso a qualquer classe e qalquer objeto;
protect se n botar nada ele pode ser acessado por classes do mesmo pacote ou pelas classes filhas;
private deixa privado, limite o acesso
*/


class Pessoa{
    private String nome;
     public Pessoa(){
         this.nome = "Fabricio";
     }
     void imprime(){
        System.out.println(this.nome);
     }
     String getNome(){
         return this.nome;
     }
}

class Teste{
    public static void main (String args[]){
        Pessoa p = new Pessoa();
        p.imprime();
    }
}