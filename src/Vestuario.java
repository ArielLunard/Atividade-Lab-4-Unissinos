public class Vestuario extends Loja {
    private boolean produtosImportados;//-| Produto Importado

    // Construtor do objeto vs1 de Loja de Vestuario
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,  boolean produtosImportados, int maxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
        this.produtosImportados = produtosImportados;
    }

    // Construtor do objeto vs2 de Loja de Vestuario
    public Vestuario(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, boolean produtosImportados, int maxProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, maxProdutos);
        this.produtosImportados = produtosImportados;
    }

    // Retorna o Valor "Produto Importado" da loja
    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    // Seta o Valor "Produto Importado" da loja
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    // Modifica o Retorno do Objeto quando Solicitado
    @Override
    public String toString() {
        return super.toString() + ", Produtos Importados: " + (produtosImportados ? "Sim" : "Não");
    }
}