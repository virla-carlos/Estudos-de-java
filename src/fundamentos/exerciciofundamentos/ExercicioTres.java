package fundamentos.exerciciofundamentos;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args){
        // Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do triãngulo: ");
        float b = sc.nextFloat();

        System.out.print("Digite a altura do triãngulo: ");
        float h = sc.nextFloat();

        float a = b*h;

        System.out.printf("\nA área de um triâmgulo, com base = %.1f e altura = %.1f, é equivalente a:\n\na = %.1f x %.1f\na = %.1f", b, h, b, h, a);

    }
}
