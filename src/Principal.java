import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //-| Variavel que armazena opção escolhida setada pelo usuario
        Loja loja       = null; //-------------------| Objeto Loja
        Produto produto = null; //-------------------| Objeto Produto

        // Menu de operações
        while (true) {
            // Lista as opções do 1º Menu
            System.out.println("\nMenu:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            // Armazena a opção escolhida
            int opcao = scanner.nextInt();

            //Abertura do SubMenu
            switch (opcao) {
                //No caso da 1 Opção ser escolhida "Criar loja"
                case 1:
                    System.out.println("\n--- Criar Loja ---");
                    scanner.nextLine();

                    //Insere o nome informado dentro da Variavel nomeLoja
                    System.out.print("Nome da loja: ");
                    String nomeLoja = scanner.nextLine();

                    //Insere a quantidade de funcionarios informadas dentro da Variavel qtdFuncionarios
                    System.out.print("Quantidade de funcionários: ");
                    int qtdFuncionarios = scanner.nextInt();

                    //Insere o Salario base de funcionarios informados dentro da Variavel salarioBase
                    System.out.print("Salário base dos funcionários (-1 para não definido): ");
                    double salarioBase = scanner.nextDouble();
                    scanner.nextLine();

                    //Insere a rua informada dentro da Variavel rua
                    System.out.println("Insira os dados do endereço:");
                    System.out.print("Rua: ");
                    String rua = scanner.nextLine();

                    //Insere o numero informado dentro da Variavel numero
                    System.out.print("Número: ");
                    String numero = scanner.nextLine();

                    //Insere a cidade informada dentro da Variavel cidade
                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();

                    //Insere o estado informado dentro da Variavel estado
                    System.out.print("Estado: ");
                    String estado = scanner.nextLine();

                    //Insere o pais informado dentro da Variavel pais
                    System.out.print("País: ");
                    String pais = scanner.nextLine();

                    //Insere o cep informado dentro da Variavel cep
                    System.out.print("CEP: ");
                    String cep = scanner.nextLine();

                    //Insere o complemento informado dentro da Variavel complemento
                    System.out.print("Complemento: ");
                    String complemento = scanner.nextLine();

                    //Insere o objeto endereco usando as Variaveis
                    Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

                    //Formação da data para inserção dentro do objeto
                    System.out.println("Insira a data de fundação (dia, mês, ano):");
                    //Insere o dia informado dentro da Variavel dia
                    System.out.print("Dia: ");
                    int dia = scanner.nextInt();

                    //Insere o mes informado dentro da Variavel mes
                    System.out.print("Mês: ");
                    int mes = scanner.nextInt();

                    //Insere o ano informado dentro da Variavel ano
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();

                    //Insere o ano informado dentro da Variavel maxProdutos
                    System.out.print("Quantidade máxima de produtos no estoque: ");
                    int maxProdutos = scanner.nextInt();

                    //Insere o objeto dataFundacao usando as Variaveis
                    Data dataFundacao = new Data(dia, mes, ano);

                    //Manipula as variaveis nomeLoja, qtdFuncionarios, salarioBase, endereco e dataFundacao
                    loja = new Loja(nomeLoja, qtdFuncionarios, salarioBase, endereco, dataFundacao, maxProdutos);
                    break;

                //No caso da 2 Opção ser escolhida "Sair"
                case 2:
                    System.out.println("\n--- Criar Produto ---");
                    scanner.nextLine();

                    //Insere o nome do produto informado dentro da Variavel nomeProduto
                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();

                    //Insere o preço do produto informado dentro da Variavel precoProduto
                    System.out.print("Preço do produto: ");
                    double precoProduto = scanner.nextDouble();

                    //Insere o dia informado dentro da Variavel dia
                    System.out.println("Insira a data de validade (dia, mês, ano):");
                    System.out.print("Dia: ");
                    int diaVal = scanner.nextInt();

                    //Insere o mes informado dentro da Variavel mes
                    System.out.print("Mês: ");
                    int mesVal = scanner.nextInt();

                    //Insere o ano informado dentro da Variavel ano
                    System.out.print("Ano: ");
                    int anoVal = scanner.nextInt();

                    //Manipula as variaveis dia, mes e ano para montar a data usando o metodo Data
                    Data dataValidade = new Data(diaVal, mesVal, anoVal);

                    //Manipula as variaveis nomeProduto, precoProduto e dataValidade
                    produto = new Produto(nomeProduto, precoProduto, dataValidade);
                    break;

                //No caso da 2 Opção ser escolhida "Criar um produto"
                case 3:
                    System.out.println("Saindo...");
                    // Encerra o menu
                    scanner.close();
                    return;

                default:
                    // Caso seja informado um numero fara das 3 opções ele retorna Opção inválida!
                    System.out.println("Opção inválida!");
            }

            if (loja != null && produto != null) {
                Data referencia = new Data(20, 10, 2023);
                System.out.println("\n--- Resultados ---");
                System.out.println(produto.estaVencido(referencia) ? "PRODUTO VENCIDO" : "PRODUTO NÃO VENCIDO");
                System.out.println(loja);
            }
        }
    }
}