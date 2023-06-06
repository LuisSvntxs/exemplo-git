import java.util.Scanner;

/**
 * LivrariaApplication
 */
public class LivrariaApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scan.nextLine();

        System.out.println("Ola, " + nome + "!");

        System.out.println("Digite sua idade");
        int idade = scan.nextInt();

        if (idade < 18) {

            System.out.println(nome + ", sua idade é: " + idade + ". Você é menor de idade!");
        } else {
            System.out.println(nome + ", sua idade é: " + idade + ". Você é maior de idade!");

        }

        scan.close();
    }
}