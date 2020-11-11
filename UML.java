/*
linguagem visual que se usa para descrever elementos de um sistema;

Nome // Classes // Metodos;

Modificador de visibilidade // private - // public + // protected # //

- int dia; = private int dia;

getalmente, o tipo esta do outro lado, ficaria:

- dia: int;

agora, os metodos:

public int getDIa();

+ getDia(): int;

+ int getDia();

*/

class Personagemmmm{

    private int id;
    private double peso;
    private int altura;
    private String nome;

    public int getId(){
        return this.id;
    }
    public void setId(int ide){
    }
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double p){  
    }
    public int getAltura(){
        return this.altura;
    }
    public void setAltura(double a){
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
    }
}

class Ferramentasssss{
    private double pesoF;
    private String nomeF;  

    public double getPesoF(){
        return this.pesoF;
    }
    public void setPesoF(double pf){  
    }
    public String getNomeF(){
        return this.nomeF;
    }
    public void setNomeF(String nf){
    }
}