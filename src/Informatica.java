public class Informatica extends Loja {
    private double seguroEletronicos;//-| Seguro Eletronico

    // Construtor do objeto vs1 de Loja de Informatica
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int maxProdutos,double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Construtor do objeto vs2 de Loja de Informatica
    public Informatica(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int maxProdutos, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, maxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Retorna o Valor "Seguro Eletronico" da loja
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    // Seta o Valor "Seguro Eletronico" da loja
    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    // Modifica o Retorno do Objeto quando Solicitado
    @Override
    public String toString() {
        return super.toString() + ", Seguro de Eletrônicos: R$ " + seguroEletronicos;
    }
}