/*Polimorfismo - varias formas */

interface Rotacionavel {
    public void setAngulo(double a);
    public double getAngulo();
}

interface Indentificavel {
    public int getId();
}

//                      É
abstract class Forma implements Rotacionavel {
    public void imprime() {
        System.out.println("Forma");
    }
}
//                É         
class Quadrado extends Forma implements Indentificavel {
    public int lado;
    public void imprime() {
        System.out.println("Quadrado");
    }
    public void setAngulo(double a) {
        System.out.println("Professor, preciso de mais tempo!");
        System.out.println("Mimi mimi muitas coisas! Faço o setAngulo() e os videos depois.");
    }
    public double getAngulo() {
        return 0;
    }
    public int getId() {
        return 1;
    }
}

class Triangulo extends Forma {
    public void imprime() {
        System.out.println("Triangulo");
    }
    public void setAngulo(double a) {
        System.out.println("setAngulo triangulo");
    }
    public double getAngulo() {
        return 0;
    }
}

class Trapezio extends Forma {
    public void imprime() {
        System.out.println("Trapezio");
    }
    public void setAngulo(double a) {
        System.out.println("setAngulo trapezio");
    }
    public double getAngulo() {
        return 0;
    }
}

class Circulo extends Forma {
    public void imprime() {
        System.out.println("Ciculo");
    }
    public void setAngulo(double a) {
        System.out.println("setAngulo circulo");
    }
    public double getAngulo() {
        return 0;
    }
}

class Losango extends Forma {
    public void imprime() {
        System.out.println("Losango");
    }
    public void setAngulo(double a) {
        System.out.println("setAngulo losango");
    }
    public double getAngulo() {
        return 0;
    }
}

class Main {
    public static void main(String[] a) {
        Triangulo h = new Triangulo();
        Quadrado q = new Quadrado();
        Trapezio t = new Trapezio();
        rotaciona(h);
    }
    //                                 y =  t
    public static void imprimeCoisa(Forma y) {
        y.imprime();
    }

    public static void rotaciona(Rotacionavel r) {
        r.setAngulo(3.50);
    }
}