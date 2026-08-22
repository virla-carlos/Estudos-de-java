package modulo1.fundamentos.exerciciofundamentos;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args){
        // Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado: ");
        float l = sc.nextFloat();
        float a = l * l;

        System.out.printf("A área do quadrado de lado %.1f é %.1f", l, a);
    }

}