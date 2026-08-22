package modulo1.estruturasDeControle.aula8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        var name = "";

        while (!name.equalsIgnoreCase("exit")){
            System.out.print("Informe um nome: ");
            name = sc.nextLine();
        }
    }
}
