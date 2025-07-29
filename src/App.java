import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
        
         int opcao;
        

        do { 

            System.out.println("\nBem-vindo ao iPhone!");
            System.out.println("1 - Acessar Reprodutor");
            System.out.println("2 - Acessar Aparelho");
            System.out.println("3 - Acessar Internet");
            System.out.println("4 - Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    ReprodutorMusical reprodutor = new ReprodutorMusical();
                    reprodutor.menuMusica();
                    
                    break;

                case 2:
                    Aparelho aparelho = new Aparelho();
                    aparelho.menuAparelho();

                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
                
            }
           
            
        } while (opcao != 4);
    }
}
