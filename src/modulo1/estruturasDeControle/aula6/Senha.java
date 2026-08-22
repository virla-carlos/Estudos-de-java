package modulo1.estruturasDeControle.aula6;
import java.util.Scanner;

public class Senha {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        // "carl2094S";
        // "Tnull023@@";

        System.out.println("========================");
        System.out.println("   Register platform");
        System.out.println("========================");

        System.out.print("Send to username: ");
        var user = scanner.nextLine();
        System.out.print("Send to password: ");
        var key = scanner.nextLine();

        var validator = 0;

        if (user.equalsIgnoreCase("carl2094S") && key.equals("Tnull023@@")){
            System.out.println("<- access granted ->"); // correct
        }else if (user.equalsIgnoreCase("carl2094S") && !key.equals("Tnull023@@")){
            System.out.println("<- access dained ->");// failed
        }else if (!user.equalsIgnoreCase("carl2094S") && key.equals("Tnull023@@")){
            System.out.println("<- access dained ->"); // failed
        }else{
            System.out.println("<- access dained ->"); // failed
        }
    }
}