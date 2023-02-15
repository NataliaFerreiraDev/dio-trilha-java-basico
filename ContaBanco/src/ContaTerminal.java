import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println(" Por favor, digite o seu nome !");

        String nome = leitor.nextLine();

        System.out.println(" Por favor, digite o número da Agência !");

        String agencia = leitor.nextLine();

        System.out.println(" Por favor, digite o número da Conta !");

        int numero = leitor.nextInt();

        System.out.println(" Por favor, digite o saldo da Conta !");

        double saldo = leitor.nextDouble();

        DecimalFormat df = new DecimalFormat("0.00");


        System.out.println( "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + df.format(saldo) + " já está disponível para saque.");

    }
}