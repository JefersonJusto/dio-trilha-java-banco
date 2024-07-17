import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

    //TODO:conhecer e importar a classe Scanner

    //Exibir as mensagens para o nosso usuário

    //Obter pela scanner os valores digitados no terminal

    //Exibir a mensagem conta criada

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da sua Agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua Conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da sua Conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", o número da sua conta é " + conta + "e seu saldo " + saldo + " já está disponível para saque.");
    }
}
