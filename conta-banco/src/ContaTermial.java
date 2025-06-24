import java.util.Scanner;

public class ContaTermial {
    public static void main(String[] args) throws Exception {
        //Criando o scanner para entrada de dados
        Scanner Scanner = new Scanner(System.in);

        //Solicitação e leitura dos dados
        System.out.println("Por favor, digite o número da Conta: ");
        int numero = Scanner.nextInt();

        Scanner.nextLine();//Consumir quebra de linha

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = Scanner.nextLine();

        System.out.println("Por favor, Digite o nome do Cliente: ");
        String nomeCliente = Scanner.nextLine();

        System.out.println("Por favor, Digite o Saldo: "); 
        double saldo = Scanner.nextDouble();

        //Exibindo a mensagem final formatada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + String.format("%.2f ", saldo) + "já está disponível para saque.");

        //Fechando o scanner
        Scanner.close();
    }
}
