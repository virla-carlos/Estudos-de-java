package Fundamentos.Aula1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("             Cadastro de usuário            ");
        System.out.println("============================================");

        System.out.print("Nome: ");
        String username = sc.nextLine();

        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Cidade: ");
        String city = sc.nextLine();

        System.out.print("Idade: ");
        int age = sc.nextInt();

        System.out.println("============================================");
        System.out.println("            Informações do usuário          ");
        System.out.println("============================================");
        System.out.println("Nome do usuário: " + username);
        System.out.println("ID do usuário: " + id);
        System.out.println("Cidade do usuário: " + city);
        System.out.println("Idade do usuário: " + age + " anos\n");

    }
}
