package Testes;

class Pessoa {
    int rg;
    int cpf;
    int TamanhoPe;
    String Nome;
    String CorCabelo;
}

class Marmita {
    public static void main(String args[]) {
        Pessoa andrei = new Pessoa();
        andrei.rg = 12345;
        andrei.cpf = 5 + andrei.rg;
        System.out.print("RG: " + andrei.rg);
        System.out.print("    CPF: " + andrei.cpf);
    }
}
