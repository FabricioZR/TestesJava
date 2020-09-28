import java.util.Scanner;

class Personagem {
    String hero;
    String lado;
    String Serie;
    int luta;
    int força;
}

class Exe {

    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        Personagem p = new Personagem();
        System.out.print("Serie: ");
        p.Serie = h.nextLine();
        System.out.print("Nome Hero: ");
        p.hero = h.nextLine();
        System.out.print("Lado: ");
        p.lado = h.nextLine();
        System.out.print("Lutas: ");
        p.luta = h.nextInt();
        System.out.print("Força: ");
        p.força = h.nextInt();

        System.out.println("Serie : " + p.Serie);
        System.out.println("Nome do Heroi: " + p.hero);
        System.out.println("Lado: " + p.lado);
        System.out.println("Lutas: " + p.luta);
        System.out.println("Força: " + p.força);
        h.close();
    }

}
