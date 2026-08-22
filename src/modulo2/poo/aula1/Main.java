package modulo2.poo.aula1;

/*import java.util.Scanner;*/

public class Main {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        var wolks = new Car();
        var honda = new Car();

        honda.setName("Civic");
        honda.setYear(2025);

        wolks.setName("Jetta");
        wolks.setYear(2024);

        System.out.print("VITRINE DE CARROS\n");
        System.out.printf("Carro: %s\nAno de lançamento: %d\n\nCarro: %s\nAno de lançamento: %d", honda.getName(), honda.getYear(), wolks.getName(), wolks.getYear());
    }
}
