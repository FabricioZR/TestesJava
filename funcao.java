import java.util.Scanner;

class funcao {
    public static void ImprimeSoma(int x, int y) {
        System.out.println("Soma = " + (x + y));
    }

}

class Principal {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int a = s.nextInt();

        System.out.print("Digite um numero: ");
        int b = s.nextInt();
        funcao f = new funcao();
        f.ImprimeSoma(a, b);
        s.close();
    }
}