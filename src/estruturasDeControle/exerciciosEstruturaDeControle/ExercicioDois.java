package estruturasDeControle.exerciciosEstruturaDeControle;

/*
* Escreva um código onde o usuário entra com sua altura e peso, seja feito o cálculo do seu IMC(IMC = peso/(altura * altura)) e seja exibido
  a mensagem de acordo com o resultado:

    Se for menor ou igual a 18,5 "Abaixo do peso";
    se por entre 18,6 e 24,9 “Peso ideal”;
    Se for entre 25,0 e 29,9 "Levemente acima do peso";
    Se entre 30,0 e 34,9 “Obesidade Grau I”;
    Se for entre 35,0 e 39,9 “Obesidade Grau II (Severa)”;
    Se for maior ou igual a 40,0 “Obesidade III (Mórbida)”;
*/

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.print("Qual o seu nome: ");
        var name = scanner.nextLine();
        System.out.print("Qual o seu peso: ");
        var weight = scanner.nextFloat();
        System.out.print("Qual a sua altura: ");
        var height = scanner.nextFloat();

        var IMC = weight/(height*height);

        if (IMC <= 18.5){
            System.out.printf("Sr %s você está abaixo do peso", name);
        }else if (IMC < 24.9){
            System.out.printf("Sr %s você está com o peso ideal", name);
        }else if (IMC < 29.9){
            System.out.printf("Sr %s você está levemente acima do peso", name);
        }else if (IMC < 34.9){
            System.out.printf("Sr %s você está com Obesidade Grau I", name);
        }else if (IMC < 39.9){
            System.out.printf("Sr %s você está com Obesidade Grau II (Severa)", name);
        }else{
            System.out.printf("Sr %s você está com Obesidade grau III (Mórbida)", name);
        }
    }
}
