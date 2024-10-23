import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Como devemos te chamar? ");
        String nomeCliente = sc.nextLine();

        float saldo = 237.48F;

        System.out.println("saldo = " + saldo);

        System.out.println("Olá, " + nomeCliente +
                "! Obrigado por criar uma conta em nosso banco, sua agência é: " + numeroAgencia +
                ", conta " + numeroConta +
                " e seu saldo " + saldo+ " já está disponível para saque!");

        sc.close();



      //to do: conhecer e importar a classe scanner
      //exibir as mensagens para o usuario
      //obter pela scanner os valores digitados no terminal
      //exibir a mensagem final da conta criada


    }
}