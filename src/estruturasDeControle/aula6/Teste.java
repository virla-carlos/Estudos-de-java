package estruturasDeControle.aula6;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        /*
        * Fone E
        * Fone D
        * Celular
        * Camisa
        * Casaco
        * TV
        * Cadeira
        */

        var sc = new Scanner(System.in);

        System.out.println("Qual produto você gostaria de buscar ?");
        var option = sc.nextInt();

        var message = switch (option){

            case 1, 2 -> {
                var side = option == 1 ? "Esquerdo do fone" : "Direito do fone";
                yield String.format("Você escolheu o lado %s ", side);
            }
            case 3 -> "Celular";
            case 4 -> "Camisa";
            case 5 -> "Cadeira";
            default -> "opção inválida";

        };

        System.out.println(message);

    }
}
