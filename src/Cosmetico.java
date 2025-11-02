public class Cosmetico extends Loja {
    private double taxaComercializacao;//-| Valor de Taxa

    // Construtor do objeto vs1 de Loja de Cosmetico
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int maxProdutos, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    // Construtor do objeto vs2 de Loja de Cosmetico
    public Cosmetico(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int maxProdutos, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, maxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    // Retorna o Valor "Valor de Taxa" da loja
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    // Seta o Valor "Valor de Taxa" da loja
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    // Modifica o Retorno do Objeto quando Solicitado
    @Override
    public String toString() {
        return super.toString() + ", Taxa de Comercialização: " + taxaComercializacao;
    }
}