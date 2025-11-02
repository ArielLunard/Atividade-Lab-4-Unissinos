public class Alimentacao extends Loja {
    private Data dataAlvara;//-| Data de alvara

    // Construtor do objeto vs1 de Loja de Alimentação
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int maxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
        this.dataAlvara = dataAlvara;
    }

    // Construtor do objeto vs2 de Loja de Alimentação
    public Alimentacao(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, Data dataAlvara, int maxProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, maxProdutos);
        this.dataAlvara = dataAlvara;
    }

    // Retorna o Valor "Alvara" da loja
    public Data getDataAlvara() {
        return dataAlvara;
    }

    // Seta o Valor "Alvara" da loja
    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    // Modifica o Retorno do Objeto quando Solicitado
    @Override
    public String toString() {
        return super.toString() + ", Data do Alvará: " + dataAlvara;
    }
}