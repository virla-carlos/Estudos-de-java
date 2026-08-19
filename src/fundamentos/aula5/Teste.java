package fundamentos.aula5;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args){

        var sc = new Scanner(System.in);

        System.out.println("Qual o seu nome ?");
        var name = sc.nextLine();

        System.out.println("Qual a sua idade ?");
        var age = sc.nextInt();

        System.out.println("Você é emancipado ? (s/n) ");
        var isEmancipated = sc.next().equalsIgnoreCase("s");

        var canDrive = (age >= 18) || (age>= 16 && isEmancipated);
        var message = canDrive ?
                name + ", você pode dirigir \n":
                name + ", você não pode dirigir \n";
    }
}
