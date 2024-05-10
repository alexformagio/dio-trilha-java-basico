import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        /*
         * TODO: Conhecer e importar a classe scanner
         *       Exibir as mensagens para o nosso usuário
         * Obter pelo scanner os valores digitados no terminal
         * exibir a mensagem final
         */
        int conta=0;
        String agencia;
        String nome;
        String sobrenome;
        double saldo; 

         try (Scanner scan = new Scanner(System.in).useLocale(new Locale("pt", "BR"))) {
            System.out.println("Por favor, digite o numero da conta:");
             conta = scan.nextInt();

             System.out.println("Por favor, digite o numero da agencia com digito:");
             agencia = scan.next();

             System.out.println("Por favor, digite o nome:");
             nome = scan.next();
             
             System.out.println("Por favor, digite o sobrenome:");
             sobrenome = scan.next();

             System.out.println("Por favor, digite o saldo:");
             saldo = scan.nextDouble();

             System.out.printf("Olá ,%s %s obrigado por criar uma conta "+
             "em nosso banco, sua agência é %s, conta %d e seu saldo %10.2f já "+
             "está disponível para saque", nome, sobrenome, agencia, conta, saldo);
        }
    }
}
