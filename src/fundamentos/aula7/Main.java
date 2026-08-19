package fundamentos.aula7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        var sc = new Scanner(System.in);

        for(;;){
            System.out.println("Digite um nome: ");
            var name = sc.next();

            System.out.printf("Olá %s\n", name);
        }
    }
}
