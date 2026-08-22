package modulo1.praticando;
import java.util.Scanner;

public class DesafioUm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Lê os dois valores inteiros da entrada (saldo e valor da transação)
        int saldo = scanner.nextInt();
        int valorTransacao = scanner.nextInt();

        // TODO: Verifique se o saldo é suficiente e imprima a mensagem apropriada
        if (valorTransacao <= saldo){
            System.out.print("Transacao aprovada");
        }else{
            System.out.print("Saldo insuficiente");
        }
        scanner.close();
    }
}
