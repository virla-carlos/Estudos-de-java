package fundamentos.exercicioFundamentos;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String name = sc.nextLine();

        System.out.print("Digite a sua idade: ");
        Integer age = sc.nextInt();
        sc.nextLine();

        System.out.print("\nDigite o seu nome: ");
        String name2 = sc.nextLine();

        System.out.print("Digite a sua idade: ");
        Integer age2 = sc.nextInt();

        Integer ageDifference = Math.abs(age - age2);
        System.out.printf("\nA diferença de idade de %s e %s é de %d anos,", name, name2, ageDifference);

    }
}
