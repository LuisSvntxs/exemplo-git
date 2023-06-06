import java.util.Scanner;

/**
 * LivrariaApplication
 */
public class LivrariaApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scan.nextLine();
        scan.close();
        System.out.println("Ola, " + nome + "!");
    }
}