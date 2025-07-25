import java.util.Scanner;


public class ReprodutorMusical {


    boolean play = true;
    String musica;

    

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Selecionar Música");
            System.out.println("2 - Tocar Música");
            System.out.println("3 - Pausar Música");
            System.out.println("4 - Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    selecionarMusica(scanner);
                    System.out.println("Música selecionada: " + musica);
                    break;
                case 2:
                    tocar();
                    break;
                case 3:
                    pausar();
                    break;
                case 4:
                    System.out.println("\nSaindo do reprodutor musical...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }

    public void selecionarMusica(Scanner scanner) {
        System.out.println("Digite o nome da música: ");
        musica = scanner.nextLine();
    }

    public void tocar(){
        play = true;
        System.out.println("Música tocando: " + musica);
    }

    public void pausar(){
        play = false;   
        System.out.println("Música pausada: " + musica);
    }


}