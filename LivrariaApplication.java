import java.util.Scanner;

/**
 * LivrariaApplication
 */
public class LivrariaApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Usuario usuario = new Usuario();

        System.out.println("Digite seu nome");
        usuario.setNome(scan.nextLine());
        
        System.out.println("Ola, " + usuario.getNome() + "!");

        System.out.println("Digite sua idade");
        usuario.setIdade(scan.nextInt());
       

        if (usuario.getIdade() < 18) {

            System.out.println(usuario.getNome() + ", sua idade é: " + usuario.getIdade() + ". Você é menor de idade!");
        } else {
            System.out.println(usuario.getNome() + ", sua idade é: " + usuario.getIdade() + ". Você é maior de idade!");

        }

        scan.close();
    }
}