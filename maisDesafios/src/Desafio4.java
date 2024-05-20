import java.util.Scanner;
//VerificacaoChequeEspecial
public class Desafio4 { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        double saldo = scanner.nextDouble(); 
        double saque = scanner.nextDouble(); 
        double limiteChequeEspecial = 500; 

        // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:
        if(saldo >= saque){
           System.out.println("Transacao realizada com sucesso.");
        }else{
          if(saldo + limiteChequeEspecial >= saque){
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial."); 
          }else{
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
          }
        }
        
// Fechamos o objeto Scanner para liberar os recursos:
        scanner.close(); 
    }
}
