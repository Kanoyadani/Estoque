import java.util.Scanner;

public class Main {

    // Faz o Cadastro dos Novos itens no Estoque.
    public static int cadastro(String[] name, Double[] valor, int[] qtd, int p) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("--- Cadastro de Novo Produto ---");

        System.out.println("Nome do Produto: ");
        String nome = sc1.next();

        System.out.println("Preco:");
        double preco = sc1.nextDouble();

        System.out.println("Quantidade:");
        int quantidade = sc1.nextInt();

        // Armazena valores em ArrayList na qual vieram dos parametros da Main.
        name[p] = nome;
        valor[p] = preco;
        qtd[p] = quantidade;

        System.out.println("Produto Cadastrado");
        // Não dar Close no Scanner pois ocasiona em erro.
        return p;

    }

    // Mostra os itens em Estoque.
    // Valores vieram do ArrayList na qual vieram dos parametros da Main.
    public static void estoque(String[] name, Double[] valor, int[] qtd, int p) {
        for (int i = 0; i < p; i++) {
            System.out.println("------------------");
            System.out.println("Produto: " + name[i] + "\nValor: " + valor[i] + "\nQuantidade: " + qtd[i]);
            System.out.println("------------------");
        }

    }

    public static void venda(String[] name, int[] qtd, int p) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nome do Produto: ");
        String nome = sc1.next();

        System.out.println("Quantidade Vendido:");
        int quantidade = sc1.nextInt(); 
        int i;
        for (i = 0; i <= p; i++) {
            if (nome.equals(name[i]) == true) {//Equals para comparar valor pois == não da certo
                qtd[i] = qtd[i] - quantidade;
                
                System.out.println("------------------");
                System.out.println("Registro de Venda");
                System.out.println("Nome do Produto: " + nome );
                System.out.println("Quantidade Vendida: "+ quantidade);
                System.out.println("------------------");

            }

        }
        // Não dar Close no Scanner pois ocasiona em erro.
    }

    // Menu de Acesso
    public static void menu(String[] name, Double[] valor, int[] qtd, int p) {
        Scanner sc1 = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("1. Cadastrar Novo Produto");
            System.out.println("2. Consultar Estoque");
            System.out.println("3. Registrar Venda");
            System.out.println("4. Sair");

            escolha = sc1.nextInt();
            switch (escolha) {
                case 1:
                    p = cadastro(name, valor, qtd, p) + 1; // Faz a soma de 1 para a incrementação do proximo item do
                                                           // Array.
                    break;

                case 2:
                    estoque(name, valor, qtd, p);
                    break;

                case 3:
                    venda(name, qtd, p);
                    break;

                case 4:
                    System.out.println("Obrigado por utilizar nosso sistema. Até mais!");
                    break;

                default:
                    System.out.println("Opcao invalida");

            }

        } while (escolha != 4);

        sc1.close();
    }

    public static void main(String[] Args) {

        String[] name = new String[44];
        Double[] valor = new Double[44];
        int[] qtd = new int[44];
        int p = 0;

        menu(name, valor, qtd, p);

    }

}
