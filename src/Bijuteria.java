public class Bijuteria extends Loja {
    private double metaVendas;//----| Meta de vendas de Bijuterias

    // Construtor do objeto vs1 de Loja de Bijuteria
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int maxProdutos, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
        this.metaVendas = metaVendas;
    }

    // Construtor do objeto vs2 de Loja de Bijuteria
    public Bijuteria(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int maxProdutos, double metaVendas) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, maxProdutos);
        this.metaVendas = metaVendas;
    }

    // Retorna o Valor "Meta de vendas" da loja
    public double getMetaVendas() {
        return metaVendas;
    }

    // Seta o Valor "Meta de vendas" da loja
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    // Modifica o Retorno do Objeto quando Solicitado
    @Override
    public String toString() {
        return super.toString() + ", Meta de Vendas: " + metaVendas;
    }
}