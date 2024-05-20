import java.util.Scanner;
//ControleSimplesDeSaque
public class Desafio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        double saque = -1;

// TODO: Crie um loop 'for' para iterar sobre os saques:
        while(saque!=0){
          // TODO: Solicite ao usuário o valor do saque:
          saque = scanner.nextFloat();
          if(saque == 0){
            System.out.println("Transacoes encerradas.");
            break;
          } else{
            if(saque > limiteDiario){
              System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
              break;
            }else{
              limiteDiario -= saque;
              System.out.println("Saque realizado. Limite restante: " + limiteDiario); 
            }
          }
        
        }


        scanner.close(); 
    }
}
