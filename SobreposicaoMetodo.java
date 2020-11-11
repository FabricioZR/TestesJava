/*SOBREPOSIÇÂO DE METODOS

super() - variavel que define a classe "mae" da minha atual;

sobreposição - muda o comportamento padrao de um metodo para atender as minhas necessidades;

*/
class Avo{
    public void ola(){
        System.out.println("ola");
    }
    public void bem(){
        System.out.println("BEMM");
    }
    public void apresenta(){
        this.ola();
        this.bem();
    }
}

class Mae extends Avo{
    public void ola(){
        System.out.println("aff");
    }
    //esta sobreesrevendo o codigo ola() em Avo{};
}

class Filha extends Mae{
    public void ola(){
        super.ola(); // vou procurar na classe mae um metodo ola();
        System.out.println("oii");
        //as assinaturas dos meus metodos sao iguais;
    }
}

public class SobreposicaoMetodo {

  public static void main (String args[]){
    Filha f = new Filha();
    f.apresenta();

    }
}
