package modulo1.fundamentos.aula4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("=================================================");
        System.out.println("               CALCULADORA BITWISE");
        System.out.println("=================================================\n");

        var sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        var value1 = sc.nextInt();
        var binary1 = Integer.toBinaryString(value1);

        System.out.print("Digite o segundo número: ");
        var value2 = sc.nextInt();
        var binary2 = Integer.toBinaryString(value2);

        System.out.printf("\nPrimeiro número: %s\n", value1);
        System.out.printf("Representação binária: %s\n", binary1);

        System.out.printf("\nSegundo número: %s\n", value2);
        System.out.printf("Representação binária: %s\n", binary2);

        System.out.println("\n-------------------------------------------------");
        System.out.println("                  Operador | (OR)");
        System.out.println("-------------------------------------------------\n");

        var resultOr = value1 | value2;
        var binaryResult = Integer.toBinaryString(resultOr);

        System.out.printf("Resultado da operação: %s | %s = %s \n", value1, value2, resultOr);
        System.out.printf("Representação binária da operação: %s \n", binaryResult);

        System.out.println("\n-------------------------------------------------");
        System.out.println("                  Operador & (AND)");
        System.out.println("-------------------------------------------------\n");

        var resultAnd = value1 & value2;
        binaryResult = Integer.toBinaryString(resultAnd);

        System.out.printf("Resultado da operação: %s & %s = %s \n", value1, value2, resultAnd);
        System.out.printf("Representação binária da operação: %s \n", binaryResult);

        System.out.println("\n-------------------------------------------------");
        System.out.println("                  Operador ^ (XOR)");
        System.out.println("-------------------------------------------------\n");

        var resultXor = value1 ^ value2;
        binaryResult = Integer.toBinaryString(resultXor);

        System.out.printf("Resultado da operação: %s ^ %s = %s \n", value1, value2, resultXor);
        System.out.printf("Representação binária da operação: %s \n", binaryResult);

        System.out.println("\n-------------------------------------------------");
        System.out.println("               Operador ~ (COMPLEMENTO)");
        System.out.println("-------------------------------------------------\n");

        var resultComplemento = ~value1;
        binaryResult = Integer.toBinaryString(resultComplemento);

        System.out.printf("Resultado da operação: %s ~ %s \n", value1, resultComplemento);
        System.out.printf("Representação binária da operação: %s \n", binaryResult);

        System.out.println("\n-------------------------------------------------");
        System.out.println("               Operador << (SHIFT LEFT)");
        System.out.println("-------------------------------------------------\n");

        var resultShiftLeft = value1 << value2;
        binaryResult = Integer.toBinaryString(resultShiftLeft);

        System.out.printf("Resultado da operação: %s << %s \n", value1, resultShiftLeft);
        System.out.printf("Representação binária da operação: %s \n", binaryResult);

        System.out.println("\n-------------------------------------------------");
        System.out.println("               Operador >> (SHIFT RIGHT)");
        System.out.println("-------------------------------------------------\n");

        var resultShiftRight = value1 >> value2;
        binaryResult = Integer.toBinaryString(resultShiftRight);

        System.out.printf("Resultado da operação: %s >> %s \n", value1, resultShiftRight);
        System.out.printf("Representação binária da operação: %s \n", binaryResult);

        System.out.println("\n-------------------------------------------------");
        System.out.println("               Operador >>> (UNSIGNED SHIFT RIGHT)");
        System.out.println("-------------------------------------------------\n");

        var resultUnsignedShiftRight = value1 >>> value2;
        binaryResult = Integer.toBinaryString(resultUnsignedShiftRight);

        System.out.printf("Resultado da operação: %s >>> %s \n", value1, resultUnsignedShiftRight);
        System.out.printf("Representação binária da operação: %s \n", binaryResult);


        /*
        *     1111111111111111111111111111100000     -8
        *   10  2
        * */

    }
}
