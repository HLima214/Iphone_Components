
import java.util.Scanner;


public class Aparelho{

    String numero;
    String numeroAtendido = "(11) 91234-5678";

public void menuAparelho(){
    Scanner scanner = new Scanner (System.in);
    int opcao;

    do { 
        System.out.println("\n1 - Fazer ligação");
        System.out.println("2 - Atender ligação");
        System.out.println("3 - Abrir correio de voz");
        System.out.println("4 - Sair");
        opcao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        switch(opcao){
            case 1:
                System.out.println("Digite o número para ligar: ");
                numero = scanner.nextLine();
                ligar(numero);
                break;
                
            case 2:
            System.out.println(numeroAtendido + " está ligando para você...");
                System.out.println("Deseja atender a ligação? (s/n)");
                String resposta = scanner.nextLine();
                if (resposta.equalsIgnoreCase("s")) {
                    atender();
                } else {
                    System.out.println("\nLigação não atendida.");
                }
                break;

            case 3:
                iniciarCorreioVoz();
                break;
            
        }


 
    } while (opcao != 4);


}

public void ligar(String numero){
    System.out.println("\nLigando para " + numero + "...");
}

public void atender(){
    System.out.println("\nAtendendo ligação de " + numeroAtendido + "...");
}

public void iniciarCorreioVoz(){
    System.out.println("\nAbrindo correio de voz...");
    



    
}

}