public class Loja {
    private String nome; //--------------------| Nome da loja
    private int quantidadeFuncionarios; //-----| Quantidade de Funcionários
    private double salarioBaseFuncionario; //--| Salários Base dos Funcionarios
    private Endereco endereco; //--------------| Endereço da Loja
    private Data dataFundacao; //--------------| Data da fundação da Loja
    private Produto[] estoqueProdutos; //------| Estoque de produtos de uma loja

    // Seta Objeto para criação
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int maxProdutos) {
        this.nome = nome; //--------------------------------------| Seta o nome da loja
        this.quantidadeFuncionarios = quantidadeFuncionarios; //--| Seta a quantidade de Funcionários
        this.salarioBaseFuncionario = salarioBaseFuncionario; //--| Seta o salários Base dos Funcionarios
        this.endereco = endereco; //------------------------------| Seta o endereço da Loja
        this.dataFundacao = dataFundacao; //----------------------| Seta a data da fundação da Loja
        this.estoqueProdutos = new Produto[maxProdutos]; //-------| Seta o estoque de produtos de uma loja
    }

    // Seta valores default Objeto para criação
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int maxProdutos) {
        this(nome, quantidadeFuncionarios, -1, endereco, dataFundacao, maxProdutos);
    }

    // Retorna o Valor "Nome" da Loja
    public String getNome() {
        return nome;
    }

    // Seta o Valor "Nome" da Loja
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna o Valor "Quantidade de Funcionários" da Loja
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    // Seta o Valor "Quantidade de Funcionários" da Loja
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    // Retorna o Valor "Salários Base dos Funcionarios" da Loja
    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    // Seta o Valor "Salários Base dos Funcionarios" da Loja
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    // Retorna o Valor "Endereço da Loja" da Loja
    public Endereco getEndereco() {
        return endereco;
    }

    // Seta o Valor "Endereço da Loja" da Loja
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Retorna o Valor "Data da fundação" da Loja
    public Data getDataFundacao() {
        return dataFundacao;
    }

    // Seta o Valor "Data da fundação" da Loja
    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    // Retorna o Valor "Estoque de produtos de uma loja" da Loja
    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    // Seta o Valor "Estoque de produtos de uma loja" da Loja
    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    // Imprime todos os produtos da Loja
    public void imprimeProdutos() {
        System.out.println("Produtos no estoque:");
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                System.out.println(produto);
            }
        }
    }

    // Insere produtos de uma loja
    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    // Remove produtos de uma loja
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    // Modifica o Retorno do Objeto quando Solicitado
    @Override
    public String toString() {
        StringBuilder produtos = new StringBuilder();
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                produtos.append(produto).append("\n");
            }
        }

        // Forma de apresentar o produto
        return "Loja [\n" +
                "  Nome: " + nome + "\n" +
                "  Funcionários: " + quantidadeFuncionarios + "\n" +
                "  Salário Base: " + (salarioBaseFuncionario == -1 ? "Não definido" : salarioBaseFuncionario) + "\n" +
                "  Endereço: " + endereco + "\n" +
                "  Fundação: " + dataFundacao + "\n" +
                "  Estoque de Produtos: " +
                (produtos.length() > 0 ? produtos.toString() : "Sem produtos no estoque") +
                "\n]";
    }

    // Validador de salário
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    // Retorna o tamanho de uma loja com base na qtd de funcionários
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }
}