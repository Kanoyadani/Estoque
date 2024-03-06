import java.util.Scanner;

public class Main {


  public static void cadastro(String[] name,Double[] valor,int[] qtd,int p) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("--- Cadastro de Novo Produto ---");
    System.out.println("Nome do Produto: ");
    String nome = sc1.next();

    System.out.println("Preco:");
    double preco = sc1.nextDouble();

    System.out.println("Quantidade:");
    int quantidade = sc1.nextInt();

    name[p] = nome;
    valor[p] = preco;
    qtd[p] = quantidade;
    p++;

    System.out.println("Produto Cadastrado");

    sc1.close();

  }



  public static void estoque(String[] name,Double[] valor,int[] qtd, int p){
  for (int i = 0; i <= p;i++){
     System.out.println("Produto:"+ name[i] + "Valor: " + valor[i] + "Quantidade: " + qtd[i]);
  }

  }


  public static void menu(String[] name,Double[] valor,int[] qtd, int p) {
    Scanner sc1 = new Scanner(System.in);
    int escolha = sc1.nextInt();
    while (escolha != 4) {
      
      switch (escolha) {
        case 1:
          cadastro(name,valor,qtd,p);
          break;
         
        case 2:
         estoque(name,valor,qtd,p);
         break;


        case 4:
          System.out.println("Saiu");
          break;

          default:
          System.out.println("Opcao invalida");

      }

    }

    sc1.close();
  }

  public static void main(String[] Args) {
    System.out.println("1. Cadastrar Novo Produto");
    System.out.println("2. Consultar Estoque");
    System.out.println("3. Registrar Venda");
    System.out.println("4. Sair");


    String[] name   = new String[44];
    Double[] valor  = new Double[44];
    int[] qtd       = new int[44];
    int p = 0;

    menu(name,valor,qtd,p);


  }

}