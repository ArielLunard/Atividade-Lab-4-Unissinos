public class Produto {
    private String nome; //-------|Produto da Loja
    private double preco; //------|Preço do Produto
    private Data dataValidade; //-|Data de Validade

    // Seta Objeto para criação
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome; //---| Seta o "Nome" da Produto
        this.preco = preco; //-| Seta o "Preço" da Produto
    }

    // Retorna o Valor "Nome" do Produto
    public String getNome() {
        return nome;
    }

    // Seta o Valor "Nome" do Produto
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna o Valor "Preço" do Produto
    public double getPreco() {
        return preco;
    }

    // Seta o Valor "Preço" do Produto
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Retorna o Valor "Data de Validade" do Produto
    public Data getDataValidade() {
        return dataValidade;
    }

    // Seta o Valor "Data de Validade" do Produto
    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Verifica se o produto está vencido
    public boolean estaVencido(Data dataAtual) {
        if (dataAtual.getAno() > dataValidade.getAno()) {
            return true;
        } else if (dataAtual.getAno() == dataValidade.getAno()) {
            if (dataAtual.getMes() > dataValidade.getMes()) {
                return true;
            } else if (dataAtual.getMes() == dataValidade.getMes()) {
                return dataAtual.getDia() > dataValidade.getDia();
            }
        }
        return false;
    }

    // Modifica o Retorno do Objeto quando Solicitado
    @Override
    public String toString() {
        return "Produto [Nome: " + nome + ", Preço: " + preco + ", Data de Validade: " + dataValidade + "]";
    }
}