interface Retacionavellll {
    public void setAngulo(double a);
    public double getAngulo();
}

class Cliente implements Retacionavellll {
    public void setAngulo(double a) {

    }
    public double getAngulo() {
        return 0;
    }
}

interface Indentificavelll {
    public int getId();
}

//                      É
abstract class Formaaa implements Retacionavellll {
    public void imprime() {
        System.out.println("Formaaa");
    }
}
//                É         
class Quadradooo extends Formaaa implements Indentificavelll {
    public int lado;

    public Quadradooo(int l) {
        super();
        this.lado = l;
    }

    public Quadradooo() {
        super();
        this.lado = 30;
    }

    public void imprime() {
        System.out.println("Quadradooo");
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

    public String toString() {
        return "Que mito!";
    }
}

class Triangulooo extends Formaaa {
    public void imprime() {
        System.out.println("Triangulooo");
    }
    public void setAngulo(double a) {
        System.out.println("setAngulo Triangulooo");
    }
    public double getAngulo() {
        return 0;
    }

    public void imprimeTipo() {
        System.out.println("Sou um Triangulooo equilátero");
    }
}

class Trapeziooo extends Formaaa {
    public void imprime() {
        System.out.println("Trapeziooo");
    }
    public void setAngulo(double a) {
        System.out.println("setAngulo Trapeziooo");
    }
    public double getAngulo() {
        return 0;
    }
}

class Circulooo extends Formaaa {
    public void imprime() {
        System.out.println("Ciculo");
    }
    public void setAngulo(double a) {
        System.out.println("setAngulo Circulooo");
    }
    public double getAngulo() {
        return 0;
    }
}

class Losangulooo extends Formaaa {
    public void imprime() {
        System.out.println("Losangulooo");
    }
    public void setAngulo(double a) {
        System.out.println("setAngulo Losangulooo");
    }
    public double getAngulo() {
        return 0;
    }
    public void imprimeDiagonal() {
        System.out.println("diagonal");
    }
}

class Main {
    public static void main(String[] a) {
        Retacionavellll[] Formaaas = new Retacionavellll[10];

        Formaaas[0] = new Triangulooo();
        Formaaas[1] = new Losangulooo();
        Formaaas[2] = new Quadradooo();
        Formaaas[3] = new Cliente();

        for(int i = 0; i < Formaaas.length; i++) {
            if(Formaaas[i] != null) {
                Formaaas[i].getAngulo();
                Formaaas[i].setAngulo(3);
            }

            if(Formaaas[i] instanceof Formaaa) {
                Formaaa f = (Formaaa)Formaaas[i];
                f.imprime();
            }     

            if(Formaaas[i] instanceof Triangulooo) {
                ((Triangulooo)Formaaas[i]).imprimeTipo();
            }
        }
    }
    //                                 y =  t
    public static void imprimeCoisa(Formaaa y) {
        y.imprime();
    }

    public static void rotaciona(Retacionavellll r) {
        r.setAngulo(3);
        System.out.println(r.getAngulo());

        // obj instanceof Triangulooo
        if(r instanceof Formaaa) {
            ((Formaaa)r).imprime();
        }

        if(r instanceof Losangulooo) {
            ((Losangulooo)r).imprimeDiagonal();
        }

        if(r instanceof Triangulooo) {
            ((Triangulooo)r).imprimeTipo();
        }
    }
}