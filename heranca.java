/*
compartilhar o que é comum entre as classes e reaproveitas o codigo;
as classes vao receber propriedades de uma outra classe que tambem sao usadas em outras classes;

compartilhar propriedades de metodos;
*/

class Forma {

    public int x;
    public int y;
    private int xx;

    public void ImprimePosicao() {
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println(this.xx);
    }

    public void setXX(int xx) {
        this.xx = xx;
    }

}

// como se eu copiasse a classe dentro da outra
class Quadrado extends Forma {
    public int lado;
    private int ladoxx;

    public void oi() {
        System.out.println(this.ladoxx);
    }
}

// classe filha -- a classe forma é a mae/pai;
class Retangulo extends Forma {
    public int base;
    public int altura;
}

class heranca {
    public static void main(String args[]) {

        Forma coisa = new Forma();
        // nao tem acesso ao int xx;
        coisa.x = 5;
        coisa.y = 9;
        coisa.ImprimePosicao();

        Quadrado quad = new Quadrado();
        quad.lado = 10;
        quad.x = 5;
        quad.y = 5;
        quad.setXX(20);
        quad.ImprimePosicao();

        Retangulo ret = new Retangulo();
        ret.base = 5;
        ret.altura = 5;
        ret.x = 10;
        ret.y = 10;
    }
}

class Olha {
    public static void oi(int a) {
        /*
         * System.out.println( "oi = "+a); a = 40;
         */
    }

    public static void main(String args[]) {
        int b = 80;
        oi(b);
        // int r = 2;
        // int g = 2;
        String r = new String("oi");
        String g = new String("oi");

        /*
         * if(r == g){ System.out.println( "igual"); }else{ System.out.println(
         * "diferente"); }
         */

        if (r.equals(g) == true) {
            System.out.println("igual");
        } else {
            System.out.println("diferente");
        }

        // System.out.println( b);

    }
}
