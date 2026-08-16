package fundamentos.exercicioFundamentos;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args){
        // Escreva um código que receba o nome e o ano do nascimento de alguém e imprima na tela a seguinte mensagem:
        // "Olá 'Fulano' você tem 'x' anos"

        var sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        var name = sc.nextLine();

        System.out.print("Digite a sua idade: ");
        var age = sc.nextInt();

        System.out.printf("Olá %s você tem %d anos.", name, age);

    }
}
