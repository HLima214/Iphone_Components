import java.util.Scanner;

public class NavegadorInternet {

    int aba = 0;

public void menuNavegador(){
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do{
        System.out.println("\n1 - Exibir Página");
        System.out.println("2 - Adicionar Nova Aba");
        System.out.println("3 - Atualizar Página");
        System.out.println("4 - Sair");
        System.out.print("\nEscolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        switch (opcao) {
            case 1:
                System.out.print("Digite a URL da página: ");
                String url = scanner.nextLine();
                exibirPagina(url);
                break;
            case 2:
                aba++;    
                adicionarNovaAba();
                break;
            case 3:
                atualizarPagina();
                break;
            case 4:
                System.out.println("Saindo do navegador...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }while (opcao != 4);

}


public void exibirPagina(String url) {
    System.out.println("Exibindo página: " + url);

}

public void adicionarNovaAba(){
    System.out.println("\nCriando nova aba: " + "[" + (aba) + "]");

}

public void atualizarPagina(){
    System.out.println("\nAtualizando página na aba: " + "[" + aba + "]");

}
}