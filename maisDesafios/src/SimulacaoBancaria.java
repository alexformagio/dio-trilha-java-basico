import java.util.Scanner;

public class SimulacaoBancaria {

    static Scanner scanner = new Scanner(System.in);
    static double saldo = 0;

    private static void imprimirMenu(int opcao) {
        if(opcao !=0){
          System.err.println("tecle qualquer letra e aperte enter para continuar ...");
          String i = scanner.next();
        }
        System.out.println("#######################");
        System.out.println("1 - Depositar         #");
        System.out.println("2 - Sacar             #");
        System.out.println("3 - Consultar Saldo   #");
        System.out.println("4 - Sair do Programa  #");
        System.out.println("#######################");
      }

      
     private static void depositar(){
        System.out.println("depositando ...");
        System.out.println("Informe o valor do depósito:");
        double valor = scanner.nextFloat();
        saldo+=valor;
        System.err.println("Saldo atual: " + saldo);
     }


     private static void sacar(){
        System.out.println("Sacando ...");
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Informe o valor do saque:");
        double valor = scanner.nextFloat();
        if(valor > saldo){
            System.err.println("Saldo insuficiente");
        }else{
            saldo-=valor;
            System.err.println("Saldo atual: " + saldo);
        }
     }     

     
     private static void consultarSaldo(){
        System.err.println("Saldo atual: " + saldo);
     }

    public static void main(String[] args) {
         
        int opcao = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        
        while (opcao != 4) {
            // imprimirMenu(opcao); 
            //System.out.println("Digite sua escolha:");
            opcao = scanner.nextInt();
            switch (opcao){
              case 1: depositar();
                      break;
              case 2: sacar();
                      break;
              case 3: consultarSaldo();
                      break;
              case 4: System.out.println("Você escolheu sair do programa");                
                      break;
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }        
            
        }



    }
}