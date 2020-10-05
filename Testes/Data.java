package Testes;

//this é muito usado na orientação a objetos;

class Data {
    private int dia;
    int mes;

    public Data() {
        this.dia = 0;
        this.mes = 2;
    }

    void imprime() {
        System.out.println("dia: " + this.dia);
        System.out.println("mes: " + this.mes);
    }

    void avancaDia(int quantosDIas) {
        this.dia += quantosDIas;
        // this se refere aos dados do objeto que esta rodando aquela perte do codigo;
    }

    void setDia(int d) {
        if (d < 0) {

        }
        this.dia = d;
    }

    int soma() {
        // nao preciso passar dia nem mes como parametro porque ja tenho ele no codigo
        // metodo soma retorna a soma do tributo dia com o atributo mes do objeto
        int r = this.dia + this.mes;
        return r;
    }

    void ajustaparanascimentoFabricio() {
        this.dia = -22;
        this.mes = -2;
    }
}

class UsaData {
    public static void main(String args[]) {
        Data d = new Data();
        d.ajustaparanascimentoFabricio();
        d.setDia(10);
        // d.avancaDia();
        // d.dia->10
        d.imprime();
        // int h = d.soma();
        // setter serve para proteger uma variavel
        // System.out.println(h);
        // imprime () esta definido na classe Data e pode receber parametros
        // de fora e roda em um espaço de memoria bem deifnido;
    }
}