import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua conta");
        int numero = scanner.nextInt();

        
        System.out.println("Digite sua agência");   
        String agencia = scanner.next();

        
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        double saldo = 237.48 ;
        System.out.println("Seu saldo é: " + saldo);
        

        
        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo "
         + saldo + " já está disponível para saque." );
    }
}
