package fundamentos.Aula2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        var scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("    Teste de Carteira de Motorista");
        System.out.println("=======================================");

        System.out.print("Qual a sua idade ? ");
        var age = scanner.nextInt();

        System.out.print("Você é emancipado ? ");
        var isEmanciped = scanner.nextBoolean();

        var canDrive = age >= 18 || (isEmanciped && age >= 16);

        System.out.printf("\nVocê pode tirar sua carteira ? (%s)",canDrive);

    }
}