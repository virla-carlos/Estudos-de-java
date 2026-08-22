package modulo1.fundamentos.aula3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("========================================");
        System.out.println("        CALCÚLADORA NO TERMINAL");
        System.out.println("========================================\n");

        var sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        var value1 = sc.nextFloat();

        System.out.print("Digite o segundo número: ");
        var value2 = sc.nextFloat();

        System.out.println("\n========================================");
        System.out.println("          CALCULANDO OS VALORES...");
        System.out.println("========================================\n");

        System.out.printf("Adição: %.1f + %.1f = %.1f\n", value1, value2, (value1 + value2));
        System.out.printf("Subtração: %.1f - %.1f = %.1f\n", value1, value2, (value1 - value2));
        System.out.printf("Multiplicação: %.1f x %.1f = %.1f\n", value1, value2, (value1 * value2));
        System.out.printf("Divisão: %.1f / %.1f = %.1f\n", value1, value2, (value1 / value2));
        System.out.printf("Raiz quadrada do número %.1f é %.1f\n", value1, Math.sqrt(value1));
        System.out.printf("A potência de %.1f elevado a %.1f é %.1f\n", value1, value2, Math.pow(value1, value2));
        System.out.println("\n========================================");



        // src/Fundamentos/Aula3/main.java
    }
}
