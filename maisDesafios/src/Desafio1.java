import java.util.Scanner;

//Simulacao Bancaria
public class Desafio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0;
        double valor =0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        int opcao = -1;
        while (opcao != 0) { 

            opcao = scanner.nextInt(); 
            switch(opcao){
              case 1: valor = scanner.nextFloat();
                      saldo += valor;
                      System.out.println("Saldo atual: " + saldo);
                      break;
              case 2: valor = scanner.nextFloat();
                      if(valor > saldo){
                        System.out.println("Saldo insuficiente.");
                      } else{
                        saldo -= valor;
                        System.out.println("Saldo atual: " + saldo);
                      }  
                      break;
              case 3:   System.out.println("Saldo atual: " + saldo);
                        break;
              case 0:   System.out.println("Programa encerrado.");   
                        break;
              default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
        }
    }
}
