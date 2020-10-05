//tipos de variaveis primiivas; 2 classes: boolean e numero;
//boolean:bool;
//Numeros:int,float,char,double,long,short,byte;
//byte sao numeros bem pequenos; byte<short<int<long;
//byte - 8bits; short - 16bits; int - 32bits; long - 62bits;
//float<double; numeros com ponto flutuante; float - 32bits; double - 64bits;
//FLOAT, SHORT, BYTE - nao sao comuns de ser usado;
//Variaveis char seguem a tabela ascii(https://web.fe.up.pt/~ee96100/projecto/Tabela%20ascii.htm)

class Variaveis {
    public static void main(String args[]) {

        byte byt = 20;
        short sho = 21;
        int in = 10;
        long longo = 22;

        char o = 111;// na tabela ascii o=111;
        char i = 105; // na tabela ascii i=105;

        boolean v = true;
        boolean f = false;

        double doub = 2.90;
        float floa = 3.40f;

        System.out.print("\n" + byt);
        System.out.print("\n" + sho);
        System.out.print("\n" + in);
        System.out.print("\n" + longo);
        System.out.print("\n" + o);
        System.out.print("\n" + i);
        System.out.print("\n" + v);
        System.out.print("\n" + f);
        System.out.print("\n" + doub);
        System.out.print("\n" + floa);
    }

}