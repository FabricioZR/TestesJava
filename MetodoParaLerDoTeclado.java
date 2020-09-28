import java.util.Scanner;

class Pessoa {
    int idade;
}

class MetodoParaLerDoTeclado {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Pessoa p = new Pessoa();
        System.out.println("Digite qual sua idade:");
        p.idade = s.nextInt();
        System.out.println("Sua idade é : " + p.idade);
        s.close();
    }
}
