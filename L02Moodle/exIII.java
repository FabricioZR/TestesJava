/*Escreva o código dos métodos indicados na classe Retangulo abaixo. Implemente também os métodos getter e
setter para que seja possível ler e colocar valores nas propriedades dos objetos da classe. Usando a classe
Retangulo, escreva um programa em Java que crie um retângulo com base 7 e altura 4 e imprima os valores das
suas dimensões através do método imprimeDimensoes(). Além disso, o programa deve ler do teclado as
informações necessárias para modificar as duas dimensões do retângulo criado e imprimir novamente as suas
dimensões através do método imprimeDimensoes(). */

package L02Moodle;

class Retangulo {

    private int base;
    private int altura;

    Retangulo(int base, int altura) {
    }

    public int getbase() {
        return base;
    }

    public void setaltura(int b) {
    }

    // Imprime as dimensoes do retangulo
    void imprimeDimensoes() {
        System.out.println("base = " + this.base);
        System.out.println("altura = " + this.altura);
    }
}

public class exIII {
    public static void main(String args[]) {
        Retangulo r = new Retangulo(10, 4);
        r.imprimeDimensoes();
    }
}
