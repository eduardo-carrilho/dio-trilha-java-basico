import java.util.Scanner;

public class Desafio1 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0;
        boolean status = true; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (status) { 
          

            int opcao = scanner.nextInt(); 
        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch (opcao) {
                case 1:
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
            
                case 2:
                    double valorSaque = scanner.nextDouble();
                    if(saldo >= valorSaque){
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: " + saldo);
                    }else{
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                
                case 0:
                    System.out.println("Programa encerrado.");
                    status = false;
                break;

                default:
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        
            

        }
        scanner.close();
    }
}
