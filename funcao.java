import java.util.Scanner;

class mania {
    void ImprimeSoma(int x, int y) {
        System.out.println("Soma = " + (x + y));
    }

}

class funcao {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int a = s.nextInt();

        System.out.print("Digite um numero: ");
        int b = s.nextInt();
        mania f = new mania();
        f.ImprimeSoma(a, b);
        s.close();
    }
}