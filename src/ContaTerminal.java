import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o número da agência: ");
        String numeroAgencia = sc.nextLine();

        System.out.println("Digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Entre com o valor do saldo: ");
        float saldo = sc.nextFloat();

        System.out.println("Olá " + nomeCliente.substring(0, 1).toUpperCase() + nomeCliente.substring(1) + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo "+ saldo +
                " já está disponível para saque");


    }
}