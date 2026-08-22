package modulo1.estruturasDeControle.aula6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Em qual setor você trabalha ?");
        var option = scanner.next();

        switch (option){

            case "ADM", "T.I":
                System.out.println("Não é necessário utilizar equipamentos de segurança");
                break;
            case "ELETRICA", "MECANICA":
                System.out.println("É necessário o uso de equipamentos de segurança\nSolicite ao coordenador que realize a compra dos equipamentos.");
                break;
            default:
                System.out.println("Nenhum setor cadastrado.");
        }

        // Criar um passo a passo de conexão na rede usando switch
    }
}
