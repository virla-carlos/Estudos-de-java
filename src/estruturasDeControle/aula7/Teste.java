package estruturasDeControle.aula7;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args){

        var sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("               Tabuada no terminal");
        System.out.println("==============================================");

        System.out.print("Digite um número para gerar a tábuada: ");
        var num = sc.nextInt();

        for (int i = 1; i <=10; i++){
            System.out.printf("%d x %d = %d\n", num, i, (num*i));
        }
    }
}
