package modulo1.estruturasDeControle.aula5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================================");
        System.out.println("                  CARTEIRA DIGITAL");
        System.out.println("====================================================");

        System.out.print("Olá, seja bem-vindo!\nComo você gostaria de ser chamado ?\nNome: ");
        String name = sc.nextLine();

        System.out.printf("\nOlá %s, seja bem-vindo a CNH Digital!\nPara iniciarmos o seu cadastro,\nPrecisamos saber algumas informações\n", name);

        System.out.println("\nPoderia fornecer mais algumas informações ?\n\n1 - Sim\n2 - Não\n");
        System.out.print("Selecione uma opção: ");
        int userResponse = sc.nextInt();

        if (userResponse == 2){

            System.out.println("\nEntendemos sua escolha em não prosseguir com o cadastro.\nO atendimento será encerrado, mas você pode tentar novamente a qualquer momento executando o programa.");

        }else if (userResponse == 1){

            System.out.println("\nPara iniciarmos o cadastro, precisamos validar a sua idade.");
            System.out.print("Em que ano você nasceu ?\nAno do nascimento: ");
            int yearOfBirth = sc.nextInt();
            sc.nextLine();

            if (yearOfBirth >= 2009){
                System.out.println("Você ainda não possui a idade necessária para realizar o cadastro.\nNão será possível concluir o cadastro.");

            }else{
                System.out.println("""
                    \nQue legal!!!
                    Você possui a idade necessária para realizar o cadastro.
                    Para continuarmos precisamos de mais algumas informações.
                    São elas: Nome completo, CPF, Email, Estado, Cidade, Bairro.
                    Vamos lá!"""
                );

                System.out.print("\nNome completo: ");
                String fullName = sc.nextLine();

                System.out.print("CPF: ");
                String cpf = sc.nextLine();

                System.out.print("Email: ");
                String email = sc.nextLine();

                System.out.print("Estado: ");
                String state = sc.nextLine();

                System.out.print("Cidade: ");
                String city = sc.nextLine();

                System.out.print("Bairro: ");
                String neighborhood = sc.nextLine();

                System.out.printf("""
                ====================================================
                       FORMULÁRIO DE CADASTRO NO CARTEIRA DIGITAL
                ====================================================
                
                    Nome completo: %s
                    CPF: %s
                    Email: %s
                    Estado: %s
                    Cidade: %s
                    Bairro: %s
                    Ano de nascimento: %s""", fullName, cpf, email, state, city, neighborhood, yearOfBirth
                );

                System.out.printf("""

                    Parabéns %s!!!
                    Cadastro concluído com sucesso!
                    Obrigado por compartilhar suas informações.
                    Fique atento ao seu e-mail, entraremos em contato em breve.
                    Até logo!""", name
                );
            }
        }
    }
}