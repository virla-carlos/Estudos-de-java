package estruturasDeControle.exerciciosEstruturaDeControle;
import java.util.Scanner;

// Escreva um código onde o usuário entra com um número e seja gerado a tabuada de 1 até 10 desse número

public class ExercicioUm {
    public static void main(String[] args){
        System.out.println("TABUADA NO TERMINAL");
        var scanner = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        var num = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", num, i, (num*i));
        }
    }
}