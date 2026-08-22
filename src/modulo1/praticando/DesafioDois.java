package modulo1.praticando;
import java.util.Scanner;

public class DesafioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a linha de entrada e separa em nome e tipo de conta
        String input = scanner.nextLine();
        String[] partes = input.split(" ");

        String nome = partes[0];
        String tipoConta = partes[1];

        // TODO: Verifique se o tipo de conta é válido ("corrente", "poupanca" ou "investimento")
        if (tipoConta.equalsIgnoreCase("corrente") || tipoConta.equalsIgnoreCase("poupanca") || tipoConta.equalsIgnoreCase("investimento")){
            System.out.printf("Bem-vindo(a), %s! Sua conta %s esta pronta para uso.", nome.toLowerCase(), tipoConta.toLowerCase());
        }else{
            System.out.print("Tipo de conta invalido.");
        }
        // e imprima a mensagem de saudação personalizada ou a mensagem de erro conforme o caso.

        scanner.close();
    }

}
